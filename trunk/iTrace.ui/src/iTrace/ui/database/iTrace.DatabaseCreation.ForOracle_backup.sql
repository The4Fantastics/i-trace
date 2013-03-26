-- ========================================================================== --
-- iTrace Database Script Creation
--
-- 23.Dic.12
-- ========================================================================== --

-- ========================================================================== --
--  Creation of base tables
-- ========================================================================== --

DROP TABLE ARTEFACT CASCADE CONSTRAINTS;

CREATE TABLE ARTEFACT (
  uuid_artefact VARCHAR2(100) NOT NULL,
  artefact VARCHAR2(100) NOT NULL,
  aspect VARCHAR2(50) NOT NULL,
  name VARCHAR2(50) DEFAULT NULL,
  abstractionLevel VARCHAR2(50) DEFAULT NULL,
  metamodel VARCHAR2(50) DEFAULT NULL,
  path VARCHAR2(100) DEFAULT NULL,
  artefactType VARCHAR2(50) NOT NULL,
  iTraceModel VARCHAR2(100) NOT NULL,
  UNIQUE (artefact)
);

--
-- Table structure for table itracemodel
--

DROP TABLE itracemodel CASCADE CONSTRAINTS;

CREATE TABLE itracemodel (
  uuid_iTraceModel VARCHAR2(100) NOT NULL,
  iTraceModel VARCHAR2(100) NOT NULL,
  version VARCHAR2(5) NOT NULL,
  projectName VARCHAR2(50) NOT NULL,
  UNIQUE (iTraceModel)
);


--
-- Table structure for table tracelinkelement
--

DROP TABLE tracelinkelement CASCADE CONSTRAINTS;

CREATE TABLE tracelinkelement (
  uuid_traceLinkElement VARCHAR2(100) NOT NULL,
  traceLinkElement VARCHAR2(200) NOT NULL,
  ref VARCHAR2(100) NOT NULL,
  objectType VARCHAR2(100) NOT NULL,
  relationType VARCHAR2(50) NOT NULL,
  artefact VARCHAR2(100) NOT NULL,
  traceLink VARCHAR2(100) NOT NULL,
  id VARCHAR2(100) NOT NULL,
  UNIQUE (traceLinkElement,traceLink)
) ;


--
-- Table structure for table tracelink
--

DROP TABLE tracelink CASCADE CONSTRAINTS;

CREATE TABLE tracelink (
  uuid_traceLink VARCHAR2(100)  NOT NULL,
  traceLink VARCHAR2(100)  NOT NULL,
  createdOn VARCHAR2(10)  NOT NULL,
  type VARCHAR2(50) NOT NULL,
  fromFileName VARCHAR2(100) DEFAULT NULL,
  tl_comment VARCHAR2(1000) DEFAULT NULL,
  createdBy VARCHAR2(50) DEFAULT NULL,
  tl_mode VARCHAR2(50) NOT NULL,
  technicalBinding VARCHAR2(50) DEFAULT NULL,
  ruleName VARCHAR2(50) DEFAULT NULL,
  linkType VARCHAR2(50) NOT NULL,
  iTraceModel VARCHAR2(100) NOT NULL,
  UNIQUE (traceLink)
) ;

--
-- Table structure for table feature
--

DROP TABLE feature CASCADE CONSTRAINTS;

CREATE TABLE feature (
  uuid_feature VARCHAR2(100) NOT NULL,
  feature VARCHAR2(100) NOT NULL,
  groupName VARCHAR2(100) DEFAULT NULL,
  attribute VARCHAR2(50) DEFAULT NULL,
  value VARCHAR2(50) DEFAULT NULL,
  iTraceModel VARCHAR2(100) NOT NULL,
  UNIQUE (feature)
) ;


--
-- Table structure for table block
--

DROP TABLE block CASCADE CONSTRAINTS;

CREATE TABLE block (
  uuid_block VARCHAR2(100)  NOT NULL,
  block VARCHAR2(100)  NOT NULL,
  blockNumber NUMBER NOT NULL,
  startLine NUMBER NOT NULL,
  endLine NUMBER NOT NULL,
  startColumn NUMBER NOT NULL,
  endColumn NUMBER NOT NULL,
  artefact VARCHAR2(100)  NOT NULL,
  traceLink VARCHAR2(100)  NOT NULL,
  id VARCHAR2(100) NOT NULL,
  UNIQUE (block)
) ;

-- ========================================================================== --
--  Functions
-- ========================================================================== --


create or replace function my_split(input_list varchar2,delimiter varchar2, ret_this_one number)
return varchar2
is
	v_list varchar2(32767) := delimiter || input_list;
	start_position number;
	end_position number;
begin
	start_position := instr(v_list, delimiter, 1, ret_this_one);
	if start_position > 0 then
		end_position := instr( v_list, delimiter, 1, ret_this_one + 1);
		if end_position = 0 then
			end_position := length(v_list) + 1; 
		end if;
		return(substr(v_list, start_position + 1, end_position - start_position - 1));
	else
		return NULL;
	end if;
end my_split;
/

-- ========================================================================== --
--  Creation of views for element analysis
-- ========================================================================== --

CREATE TABLE TRACEMAP(
  ROUTE NUMBER NOT NULL,
  STEP NUMBER NOT NULL,
  ARTEFACT_NAME VARCHAR2(100) NOT NULL,
  TRACE_LINK VARCHAR2(100) NOT NULL,
  ID_ELEMENT VARCHAR2(100) NOT NULL,
  PRIMARY KEY (ROUTE, STEP));

CREATE OR REPLACE VIEW TRACEMAP_UML (ROUTE, ID_ELEMENT_TRACEMAP_UML) AS (SELECT ROUTE, ID_ELEMENT FROM TRACEMAP WHERE ARTEFACT_NAME='UML');
CREATE OR REPLACE VIEW TRACEMAP_SQL2003 (ROUTE, ID_ELEMENT_TRACEMAP_SQL2003) AS (SELECT ROUTE, ID_ELEMENT FROM TRACEMAP WHERE ARTEFACT_NAME='SQL2003');
CREATE OR REPLACE VIEW TRACEMAP_ORDB4ORA (ROUTE, ID_ELEMENT_TRACEMAP_ORDB4ORA) AS (SELECT ROUTE, ID_ELEMENT FROM TRACEMAP WHERE ARTEFACT_NAME='ORDB4ORA');
CREATE OR REPLACE VIEW TRACEMAP_CODE (ROUTE, ID_ELEMENT_TRACEMAP_CODE) AS (SELECT ROUTE, ID_ELEMENT FROM TRACEMAP WHERE ARTEFACT_NAME='omdb.sql');

CREATE OR REPLACE VIEW ELEMENT_VIEW 
(ev_transformation, ev_traceLink, ev_ruleName, ev_tle, ev_relationtype) AS
(SELECT projectname, tl.traceLink,  ruleName, tracelinkelement, relationtype
FROM
ITRACEMODEL I, TRACELINK TL, TRACELINKELEMENT TLE
WHERE 
i.itracemodel = tl.itracemodel and
tl.tracelink = tle.tracelink);

select count(*) from element_view;
SELECT * FROM TRACEMAP;

DROP TABLE TRACEMAP CASCADE CONSTRAINTS;

CREATE TABLE TRACEMAP(
  ROUTE NUMBER NOT NULL,
  STEP NUMBER NOT NULL,
  ARTEFACT_NAME VARCHAR2(100) NOT NULL,
  TRACE_LINK VARCHAR2(100) NOT NULL,
  ID_ELEMENT VARCHAR2(100) NOT NULL,
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
      INSERT INTO TRACEMAP (ROUTE, step, ARTEFACT_name, id_element, TRACE_LINK) VALUES
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

-- En el caso de estudio m2datdb. Coje mal el nombre del artefacto código. Mirar
UPDATE TRACEMAP SET ARTEFACT_NAME='omdb.sql' WHERE artefact_name='NULL';

-- Se crean aqui las vistas parciales, pero con permisos se pueden crear dentro
--   del paquete trace map
CREATE OR REPLACE VIEW TRACEMAP_UML (ROUTE, ID_ELEMENT_TRACEMAP_UML) AS (SELECT ROUTE, ID_ELEMENT FROM TRACEMAP WHERE ARTEFACT_NAME='UML');
CREATE OR REPLACE VIEW TRACEMAP_SQL2003 (ROUTE, ID_ELEMENT_TRACEMAP_SQL2003) AS (SELECT ROUTE, ID_ELEMENT FROM TRACEMAP WHERE ARTEFACT_NAME='SQL2003');
CREATE OR REPLACE VIEW TRACEMAP_ORDB4ORA (ROUTE, ID_ELEMENT_TRACEMAP_ORDB4ORA) AS (SELECT ROUTE, ID_ELEMENT FROM TRACEMAP WHERE ARTEFACT_NAME='ORDB4ORA');
CREATE OR REPLACE VIEW TRACEMAP_CODE (ROUTE, ID_ELEMENT_TRACEMAP_CODE) AS (SELECT ROUTE, ID_ELEMENT FROM TRACEMAP WHERE ARTEFACT_NAME='omdb.sql');

CREATE OR REPLACE VIEW CODE_STATS AS
  (select sum((endline-startline)+1) total_lines ,sum(endcolumn-startcolumn) total_chars
  from block);

CREATE OR REPLACE VIEW BLOCK_STATS AS
  (select id,(endline-startline)+1 lines, (endcolumn-startcolumn) characters,
    (endline-startline)+1/(select total_lines from code_stats) per_lines,
    (endcolumn-startcolumn)/(select total_chars from code_stats) per_chars
   from block);
   
 create view ROUTES_STATS as (
  select ROUTE, sum(step) STEPS, block_stats.lines, block_stats.characters, block_stats.per_lines, block_stats.per_chars 
  from tracemap, block_stats
    where tracemap.id_element=block_stats.id
    group by ROUTE, block_stats.lines, block_stats.characters, block_stats.per_lines, block_stats.per_chars);

-- ========================================================================== --
--  Creation of views for transformation analysis
-- ========================================================================== --

create or replace view TRANSFORMATION_VIEW AS (
(SELECT projectName TV_transformation, t.tracelink tv_tracelink, rulename tv_rulename,
linktype tv_linktype, aspect tv_aspect, name tv_artefactname,
abstractionlevel tv_abstractionlevel, artefacttype tv_artefacttype,
tracelinkelement tv_tle, relationtype tv_relationtype, TO_CHAR(NULL) "TV_BLOCK"
FROM TRACELINKELEMENT TLE, ARTEFACT A, tracelink t, itracemodel i
WHERE TLE.ARTEFACT = A.ARTEFACT
and t.tracelink = tle.tracelink and
i.itracemodel = t.itracemodel and
i.itracemodel = a.itracemodel)
UNION
(SELECT projectName TV_transformation, t.tracelink tv_tracelink, rulename tv_rulename,
linktype tv_linktype, aspect tv_aspect, name tv_artefactname,
abstractionlevel tv_abstractionlevel, artefacttype tv_artefacttype,
TO_CHAR(NULL) "tv_tle", TO_CHAR(NULL) "tv_relationtype", block TV_BLOCK FROM 
BLOCK B, ARTEFACT A, tracelink t, itracemodel i
WHERE B.ARTEFACT = A.ARTEFACT
and b.tracelink = t.tracelink
and i.itracemodel = t.itracemodel
and i.itracemodel = a.itracemodel));



create or replace view Mapping_Rules_Source 
(tv_ruleName, tv_artefact_Source, tv_objecttype_Source,
tv_relationtype_Source, tv_total_Source) AS (
select ruleName, name, my_split(objecttype,'!',2), relationtype,
count(*) as total 
 from tracelinkelement tle, tracelink tl, artefact a
 where tle.tracelink=tl.tracelink and
       a.artefact=tle.artefact and relationtype='Source'
 group by ruleName, name, objecttype, relationtype)
 ;
 -- Se ha eliminado el atributo project name de iTraceModel, tanto en source
 -- como en target. Funciona OK en QlikView. Primero criterio de agrupación
 -- y relación en where de itracemodel con tracelink.
  
 create or replace view Mapping_Rules_Target
(tv_ruleName, tv_artefact_Target, tv_objecttype_Target,
tv_relationtype_Target, tv_total_Target) AS (
select ruleName, name, my_split(objecttype,'!',2), relationtype,
count(*) as total 
 from tracelinkelement tle, tracelink tl, artefact a
 where tle.tracelink=tl.tracelink and
       a.artefact=tle.artefact and relationtype='Target'
 group by ruleName, name, objecttype, relationtype)
 ;
 
-- ========================================================================== --
commit;




