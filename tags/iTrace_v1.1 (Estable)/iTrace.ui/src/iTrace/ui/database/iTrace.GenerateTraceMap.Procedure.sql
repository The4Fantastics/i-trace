create or replace 

PROCEDURE generate_TraceMap AS
 rute_num NUMBER:=1;

CURSOR C_TL (p_tle VARCHAR2) IS
    SELECT tl.traceLink FROM tracelink tl, tracelinkelement tle
        WHERE tl.tracelink=tle.traceLink AND tle.relationType='Source' 
            AND tle.tracelinkelement=p_tle;

BEGIN

FOR V_TLE IN (SELECT tracelinkelement from tracelinkelement) LOOP
  FOR V_TL IN C_TL(V_TLE.tracelinkelement) LOOP
  -- Por cada enlace de traza
   --Obtengo el eelmento de destino y almaceno en la tabla,
    tendria que seguir recorriendo
  
  END LOOP
END LOOP;
             
END;
/

EXEC GENERATE_TRACEMAP;