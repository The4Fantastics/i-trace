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
  artefact VARCHAR2(150) NOT NULL,
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
  artefact VARCHAR2(150) NOT NULL,
  traceLink VARCHAR2(150) NOT NULL,
  id VARCHAR2(100) NOT NULL,
  UNIQUE (traceLinkElement,traceLink)
) ;


--
-- Table structure for table tracelink
--

DROP TABLE tracelink CASCADE CONSTRAINTS;

CREATE TABLE tracelink (
  uuid_traceLink VARCHAR2(100)  NOT NULL,
  traceLink VARCHAR2(150)  NOT NULL,
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
  CONSTRAINT UNIQUE_FEATURE UNIQUE (feature,attribute)
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
  artefact VARCHAR2(150)  NOT NULL,
  traceLink VARCHAR2(150)  NOT NULL,
  id VARCHAR2(100) NOT NULL,
  UNIQUE (block)
) ;
