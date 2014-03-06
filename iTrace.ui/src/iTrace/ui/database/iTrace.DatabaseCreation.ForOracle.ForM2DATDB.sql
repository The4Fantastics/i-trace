
@"iTrace.DatabaseCreation.ForOracle.Tables.sql";
@"iTrace.DatabaseCreation.ForOracle.Functions.sql";
@"iTrace.DatabaseCreation.ForOracle.ElementsView.sql";
@"iTrace.DatabaseCreation.ForOracle.TraceMap.sql";
--
-- En el caso de estudio m2datdb. Coje mal el nombre del artefacto código. Mirar

UPDATE TRACEMAP SET ARTEFACT_NAME='omdb.sql' WHERE artefact_name='NULL';

-- Se crean aqui las vistas parciales, pero con permisos se pueden crear dentro
--   del paquete trace map
CREATE OR REPLACE VIEW TraceMap_UML (ROUTE, ELEMENT_TRACEMAP_UML) AS (SELECT ROUTE, ELEMENT FROM TRACEMAP WHERE ARTEFACT_NAME='UML');
CREATE OR REPLACE VIEW TraceMap_SQL2003 (ROUTE, ELEMENT_TRACEMAP_SQL2003) AS (SELECT ROUTE, ELEMENT FROM TRACEMAP WHERE ARTEFACT_NAME='SQL2003');
CREATE OR REPLACE VIEW TraceMap_ORDB4ORA (ROUTE, ELEMENT_TRACEMAP_ORDB4ORA) AS (SELECT ROUTE, ELEMENT FROM TRACEMAP WHERE ARTEFACT_NAME='ORDB4ORA');
CREATE OR REPLACE VIEW TraceMap_CODE (ROUTE, ELEMENT_TRACEMAP_CODE) AS (SELECT ROUTE, ELEMENT FROM TRACEMAP WHERE ARTEFACT_NAME='omdb.sql');
--
--
@"iTrace.DatabaseCreation.ForOracle.TransformationsView.sql";

commit;
