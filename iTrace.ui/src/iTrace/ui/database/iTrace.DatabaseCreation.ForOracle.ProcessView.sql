create or replace view PROCESS_VIEW AS (
SELECT projectName PV_transformation, t.tracelink PV_tracelink, t.fromfilename PV_process, rulename PV_rulename,
linktype PV_linktype, aspect PV_aspect, name PV_artefactname,
abstractionlevel PV_abstractionlevel, artefacttype PV_artefacttype,
tracelinkelement PV_tle, relationtype PV_relationtype, attribute PV_attribute, value PV_value
FROM TRACELINKELEMENT TLE, ARTEFACT A, tracelink t, itracemodel i, feature f
WHERE TLE.ARTEFACT = A.ARTEFACT
and t.tracelink = tle.tracelink and
i.itracemodel = t.itracemodel and
i.itracemodel = a.itracemodel and f.itracemodel=i.itracemodel);


create or replace view Mapping_Rules_Source 
(pv_ruleName, pv_artefact_Source, pv_objecttype_Source,
pv_relationtype_Source, pv_total_Source) AS (
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
(pv_ruleName, pv_artefact_Target, pv_objecttype_Target,
pv_relationtype_Target, pv_total_Target) AS (
select ruleName, name, my_split(objecttype,'!',2), relationtype,
count(*) as total 
 from tracelinkelement tle, tracelink tl, artefact a
 where tle.tracelink=tl.tracelink and
       a.artefact=tle.artefact and relationtype='Target'
 group by ruleName, name, objecttype, relationtype)
 ;
 