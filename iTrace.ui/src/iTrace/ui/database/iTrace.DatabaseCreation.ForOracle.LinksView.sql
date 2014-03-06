-- ========================================================================== --
--  Creation of views for Links analysis
-- ========================================================================== --

 
CREATE OR REPLACE VIEW LINK_VIEW 
(lv_process, lv_traceLink, lv_ruleName, lv_tle, lv_relationtype, element) AS
(SELECT fromfilename, tl.traceLink,  ruleName, tracelinkelement, relationtype, id
FROM
ITRACEMODEL I, TRACELINK TL, TRACELINKELEMENT TLE
WHERE 
i.itracemodel = tl.itracemodel and
tl.tracelink = tle.tracelink);