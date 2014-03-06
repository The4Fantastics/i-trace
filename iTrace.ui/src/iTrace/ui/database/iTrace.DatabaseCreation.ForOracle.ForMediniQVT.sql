
@"iTrace.DatabaseCreation.ForOracle.Tables.sql";
@"iTrace.DatabaseCreation.ForOracle.Functions.sql";
-- Elements View

--@"iTrace.DatabaseCreation.ForOracle.TraceMap.sql";
--CREATE OR REPLACE VIEW TraceMap_MXML (ROUTE, ELEMENT_TRACEMAP_MXML) AS (SELECT ROUTE, ELEMENT FROM TRACEMAP WHERE ARTEFACT_NAME='MXML');
--CREATE OR REPLACE VIEW TraceMap_KDM (ROUTE, ELEMENT_TRACEMAP_KDM) AS (SELECT ROUTE, ELEMENT FROM TRACEMAP WHERE ARTEFACT_NAME='KDM');

@"iTrace.DatabaseCreation.ForOracle.LinksView.sql";
@"iTrace.DatabaseCreation.ForOracle.ProcessView.sql";



commit;