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