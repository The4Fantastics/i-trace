-- ========================================================================== --
--  Creation of views for element analysis
-- ========================================================================== --

 
CREATE OR REPLACE VIEW ELEMENT_VIEW 
(ev_transformation, ev_traceLink, ev_ruleName, ev_tle, ev_relationtype, element) AS
(SELECT projectname, tl.traceLink,  ruleName, tracelinkelement, relationtype, id
FROM
ITRACEMODEL I, TRACELINK TL, TRACELINKELEMENT TLE
WHERE 
i.itracemodel = tl.itracemodel and
tl.tracelink = tle.tracelink);

CREATE OR REPLACE VIEW CODE_STATS AS
  (select sum((endline-startline)+1) total_lines ,sum(endcolumn-startcolumn) total_chars
  from block);

CREATE OR REPLACE VIEW BLOCK_STATS AS
  (select id,(endline-startline)+1 lines, (endcolumn-startcolumn) characters,
    (endline-startline)+1/(select total_lines from code_stats) per_lines,
    (endcolumn-startcolumn)/(select total_chars from code_stats) per_chars
   from block);
   
 create or replace view ROUTES_STATS as (
  select ROUTE, sum(step) STEPS, block_stats.lines, block_stats.characters, block_stats.per_lines, block_stats.per_chars 
  from tracemap, block_stats
    where tracemap.element=block_stats.id
    group by ROUTE, block_stats.lines, block_stats.characters, block_stats.per_lines, block_stats.per_chars);
