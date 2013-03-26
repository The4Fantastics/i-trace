DROP TABLE TRACEMAP CASCADE CONSTRAINTS;

CREATE TABLE TRACEMAP(
  ROUTE NUMBER NOT NULL,
  STEP NUMBER NOT NULL,
  ARTEFACT_NAME VARCHAR2(100) NOT NULL,
 trace_link VARCHAR2(150) NOT NULL,
  ELEMENT VARCHAR2(100) NOT NULL,
  PRIMARY KEY (ROUTE, STEP));
  

-- ========================================================================== --
-- ========================================================================== --
-- Paquete TraceMap
-- ========================================================================== --
-- ========================================================================== --

create or replace 
PACKAGE pk_TraceMap AS

  TYPE type_aux is record (
    id tracelinkelement.id%type,
    tl tracelinkelement.tracelink%type);

  PROCEDURE generate;

END pk_TraceMap;
/

create or replace 
PACKAGE BODY pk_TraceMap AS


-- -----------------------------------------------------------------------------
-- Funcion get_PreviousTLE
-- ----------------------------------------------------------------------------- 

  FUNCTION get_PreviousTLE(p_tle type_aux) RETURN type_aux IS
 
    v_mode tracelinkelement.relationType%type;
    v_return type_aux;
    v_aux type_aux;
    v_isBlock NUMBER;
 
  BEGIN

    v_return.id:='NULL';
    v_return.tl:='NULL';
 
    -- Comprobamos si se trata de un bloque de código
    SELECT NVL(count(*),0) as isBlock INTO v_isBlock FROM block
      WHERE id=p_tle.id AND tracelink=p_tle.tl;
    
    -- Es un block
    IF v_isBlock>0 THEN
      v_Mode:='Target';
    ELSE
      -- Miramos si el elemento es source o target;
      SELECT NVL(relationType,'NULL') as relationType INTO v_mode FROM tracelinkelement
        WHERE id=p_tle.id AND tracelink=p_tle.tl;
    END IF;
    
    IF v_mode='Source' THEN
      SELECT id, tracelink INTO v_aux FROM tracelinkelement
        WHERE relationType='Target' and id=p_tle.id; 
        
      SELECT id, tracelink INTO v_return FROM tracelinkelement
        WHERE relationType='Source' and tracelink=v_aux.tl; 
        
    ELSIF v_mode= 'Target' THEN
      SELECT id, tracelink INTO v_return FROM tracelinkelement
        WHERE relationType='Source' and tracelink=p_tle.tl; 
    END IF;
 
  RETURN v_return;
  
  EXCEPTION
    WHEN NO_DATA_FOUND THEN
      v_return.id:='FIN';
      RETURN v_return;
 
 END;
 
-- -----------------------------------------------------------------------------
-- Funcion get_ArtefactName
-- ----------------------------------------------------------------------------- 
FUNCTION get_ModelName(p_id tracelinkelement.id%type) RETURN artefact.name%TYPE IS

v_ModelName artefact.name%type;

BEGIN
  SELECT distinct name INTO v_ModelName FROM artefact a, tracelinkelement tle
    WHERE a.artefact = tle.artefact AND tle.id=p_id;
  
  RETURN v_ModelName;
  
  EXCEPTION
    WHEN NO_DATA_FOUND THEN
      RETURN 'NULL';

END;

-- -----------------------------------------------------------------------------
-- Procedure generateViews 
-- -----------------------------------------------------------------------------

PROCEDURE GENERATE_VIEWS IS
  l_query varchar2(1000);
  
BEGIN
  FOR V_MODEL IN (SELECT DISTINCT ARTEFACT_NAME FROM TRACEMAP) LOOP
  
   l_query := 'CREATE OR REPLACE VIEW TRACEMAP_' || V_MODEL.ARTEFACT_NAME || ' AS (' ||
      'SELECT RUTE, STEP, ID_ELEMENT FROM TRACEMAP WHERE MODELNAME=''' || 
      V_MODEL.ARTEFACT_NAME || ''')' ;
  
    EXECUTE IMMEDIATE (l_query);
    
  END LOOP;
END;

-- -----------------------------------------------------------------------------
-- Function get_Block 
-- -----------------------------------------------------------------------------
/*FUNCTION get_Block(p_id tracelinkelement.id%type) RETURN block%ROWTYPE IS

  v_return block%rowtype;

BEGIN
  SELECT * into v_return FROM BLOCK
    WHERE tracelink in (select tracelink from tracelinkelemente
      WHERE id=p_ip);

END:
*/
-- -----------------------------------------------------------------------------
-- Procedure generate 
-- -----------------------------------------------------------------------------

PROCEDURE generate IS

  v_route NUMBER:=1;
  v_step NUMBER:=-1;
  v_tam NUMBER:=0;
  v_previous type_aux;
  v_artefactName tracemap.ARTEFACT_name%type;

BEGIN

-- BORRAMOS LA INFORMACIÓN ANTERIOR
 DELETE FROM TRACEMAP;

-- Obtengo los blocks
FOR v_id in (SELECT id from block) LOOP
  
  -- Para cada tl del tle
  FOR v_tl in (select tracelink from (select tracelink, id from tracelinkelement
    union select tracelink, id from block) where id=v_id.id) LOOP
  
    v_previous.id:=v_id.id;
    v_previous.tl:=v_tl.tracelink;
    v_step:=-1;
    
    LOOP
      
      -- si hemos llegado al final
      EXIT WHEN v_previous.id='NULL' or v_previous.id='FIN';
    
      -- insertamos en el mapa de trazas
      v_artefactname:=get_ModelName(v_previous.id);
      INSERT INTO TRACEMAP (ROUTE, step, ARTEFACT_name, element, TRACE_LINK) VALUES
        (v_route, v_step, v_artefactName, v_previous.id, v_previous.tl);
    
      -- pasamos al registro anterior
      v_previous:=get_PreviousTLE(v_previous);
      v_step:=v_step-1;
  
    END LOOP;
  
    -- Actualizamos el valor de los steps
    SELECT count(*) INTO v_tam FROM TRACEMAP WHERE ROUTE=v_route;
    UPDATE TRACEMAP SET STEP=STEP+v_tam+1 WHERE ROUTE=v_route;
    v_route:=v_route+1;
    
  
  END LOOP;
    
END LOOP;

-- Añadimos los enlaces M2T
-- Obtengo los tle targets
--FOR v_id in (SELECT NVL(id,'NULL') as id from tracelinkelement
 -- where tracelink in (select tracelink from tracelink where LinkType='M2TLink')) LOOP

  -- INSERT INTO TRACEMAP (rute, step, modelname, id_element) VALUES
    --    (v_rute, v_step, v_modelName, v_previous.id);

-- No tengo privilegios para crearlo desde aqui
-- GENERATE_VIEWS();
    
END;
END pk_TraceMap;
/
-- -----------------------------------------------------------------------------
-- Fin del paquete tracemap
-- -----------------------------------------------------------------------------

-- Llamada al generador de tracemap  
EXEC PK_TRACEMAP.GENERATE;

