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

DROP TABLE TRACEMAP CASCADE CONSTRAINTS;

CREATE TABLE TRACEMAP(
  rute NUMBER NOT NULL,
  step NUMBER NOT NULL,
  modelName VARCHAR2(100) NOT NULL,
  id_element VARCHAR2(100) NOT NULL,
  tl VARCHAR2(100) NOT NULL
  );

CREATE OR REPLACE VIEW TRACEMAP_SQL2003 (RUTE, ID_TRACEMAP_SQL2003) AS (SELECT RUTE, ID_ELEMENT FROM TRACEMAP WHERE MODELNAME='SQL2003');
CREATE OR REPLACE VIEW TRACEMAP_UML (RUTE, ID_TRACEMAP_UML) AS (SELECT RUTE, ID_ELEMENT FROM TRACEMAP WHERE MODELNAME='UML');
CREATE OR REPLACE VIEW TRACEMAP_ORDB4ORA (RUTE, ID_TRACEMAP_ORDB4ORA) AS (SELECT RUTE, ID_ELEMENT FROM TRACEMAP WHERE MODELNAME='ORDB4ORA');
CREATE OR REPLACE VIEW TRACEMAP_CODE (RUTE, ID_TRACEMAP_CODE) AS (SELECT RUTE, ID_ELEMENT FROM TRACEMAP WHERE MODELNAME='omdb.sql');

CREATE OR REPLACE VIEW CODE_STATS AS
  (select sum((endline-startline)+1) total_lines ,sum(endcolumn-startcolumn) total_chars
  from block);

CREATE OR REPLACE VIEW BLOCK_STATS AS
  (select id,(endline-startline)+1 lines, (endcolumn-startcolumn) characters,
    (endline-startline)+1/(select total_lines from code_stats) per_lines,
    (endcolumn-startcolumn)/(select total_chars from code_stats) per_chars
   from block);
   
 create view rutes_stats as (
  select rute, sum(step) steps, block_stats.lines, block_stats.characters, block_stats.per_lines, block_stats.per_chars from tracemap, block_stats
    where tracemap.id_element=block_stats.id
    group by rute, block_stats.lines, block_stats.characters, block_stats.per_lines, block_stats.per_chars);
    
create or replace view Mapping_Rules_Source 
(MR_projectName, MR_ruleName, MR_artefact_Source, MR_objecttype_Source, MR_relationtype_Source, MR_total_Source) AS (
select projectname, ruleName, name, my_split(objecttype,'!',2), relationtype, count(*) as total 
 from iTraceModel i, tracelinkelement tle, tracelink tl, artefact a
 where i.itracemodel=tl.itracemodel and tle.tracelink=tl.tracelink and
       a.artefact=tle.artefact and relationtype='Source'
 group by projectname, ruleName, name, objecttype, relationtype)
 ;
 
 create or replace view Mapping_Rules_Target
(MR_projectName, MR_ruleName, MR_artefact_Target, MR_objecttype_Target, MR_relationtype_Target, MR_total_Target) AS (
select projectname, ruleName, name, my_split(objecttype,'!',2), relationtype, count(*) as total 
 from iTraceModel i, tracelinkelement tle, tracelink tl, artefact a
 where i.itracemodel=tl.itracemodel and tle.tracelink=tl.tracelink and
       a.artefact=tle.artefact and relationtype='Target'
 group by projectname, ruleName, name, objecttype, relationtype)
 ;
 
 
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