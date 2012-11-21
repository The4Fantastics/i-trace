-- iTrace SQL Script Generation --
-- Model Name: /M2DATDB/Models/UML2SQL2003.iTrace


INSERT INTO TraceLink 
(uuid_TraceLink, traceLink, createdOn, type, fromFileName, tl_comment, createdBy, tl_mode,
technicalBinding, ruleName, linkType, iTraceModel) VALUES
("TL1","TL1","09-11-2012","Transformation","","Automatic generation by iTrace",
"iTrace Tool","Automatic","ATL","generateEmptyBooleanType","M2MLink","/M2DATDB/Models/UML2SQL2003.iTrace#/");
INSERT INTO TraceLink 
(uuid_TraceLink, traceLink, createdOn, type, fromFileName, tl_comment, createdBy, tl_mode,
technicalBinding, ruleName, linkType, iTraceModel) VALUES
("TL2","TL2","09-11-2012","Transformation","","Automatic generation by iTrace",
"iTrace Tool","Automatic","ATL","generateEmptyBooleanType","M2MLink","/M2DATDB/Models/UML2SQL2003.iTrace#/");
INSERT INTO TraceLink 
(uuid_TraceLink, traceLink, createdOn, type, fromFileName, tl_comment, createdBy, tl_ºmode,
technicalBinding, ruleName, linkType, iTraceModel) VALUES
("TL3","TL3","09-11-2012","Transformation","","Automatic generation by iTrace",
"iTrace Tool","Automatic","ATL","generateEmptyBooleanType","M2MLink","/M2DATDB/Models/UML2SQL2003.iTrace#/");
INSERT INTO TraceLink 
(uuid_TraceLink, traceLink, createdOn, type, fromFileName, tl_comment, createdBy, tl_mode,
technicalBinding, ruleName, linkType, iTraceModel) VALUES
("TL4","TL4","09-11-2012","Transformation","","Automatic generation by iTrace",
"iTrace Tool","Automatic","ATL","generateEmptyBooleanType","M2MLink","/M2DATDB/Models/UML2SQL2003.iTrace#/");
INSERT INTO TraceLink 
(uuid_TraceLink, traceLink, createdOn, type, fromFileName, tl_comment, createdBy, tl_mode,
technicalBinding, ruleName, linkType, iTraceModel) VALUES
("TL5","TL5","09-11-2012","Transformation","","Automatic generation by iTrace",
"iTrace Tool","Automatic","ATL","generateEmptyBooleanType","M2TLink","/M2DATDB/Models/UML2SQL2003.iTrace#/");
INSERT INTO TraceLink 
(uuid_TraceLink, traceLink, createdOn, type, fromFileName, tl_comment, createdBy, tl_mode,
technicalBinding, ruleName, linkType, iTraceModel) VALUES
("TL6","TL6","09-11-2012","Transformation","","Automatic generation by iTrace",
"iTrace Tool","Automatic","ATL","generateEmptyBooleanType","M2TLink","/M2DATDB/Models/UML2SQL2003.iTrace#/");

INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, id, objectType,
relationType, artefact, traceLink) VALUES 
("1","1","1","1","UML!Package","Source",
"/M2DATDB/Models/UML2SQL2003.iTrace#//@artefacts.0","TL1");
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, id, objectType,
relationType, artefact, traceLink) VALUES 
("1","1","1","1","UML!Package","Source",
"/M2DATDB/Models/UML2SQL2003.iTrace#//@artefacts.0","TL2");
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, id, objectType,
relationType, artefact, traceLink) VALUES 
("2A","2A","2A","2A","UML!Package","Target",
"/M2DATDB/Models/UML2SQL2003.iTrace#//@artefacts.0","TL1");
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, id, objectType,
relationType, artefact, traceLink) VALUES 
("2A","2A","2A","2A","UML!Package","Source",
"/M2DATDB/Models/UML2SQL2003.iTrace#//@artefacts.0","TL3");
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, id, objectType,
relationType, artefact, traceLink) VALUES 
("2B","2B","2B","2B","UML!Package","Target",
"/M2DATDB/Models/UML2SQL2003.iTrace#//@artefacts.0","TL2");
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, id, objectType,
relationType, artefact, traceLink) VALUES 
("2B","2B","2B","2B","UML!Package","Source",
"/M2DATDB/Models/UML2SQL2003.iTrace#//@artefacts.0","TL4");
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, id, objectType,
relationType, artefact, traceLink) VALUES 
("3A","3A","3A","3A","UML!Package","Target",
"/M2DATDB/Models/UML2SQL2003.iTrace#//@artefacts.0","TL3");
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, id, objectType,
relationType, artefact, traceLink) VALUES 
("3A","3A","3A","3A","UML!Package","Source",
"/M2DATDB/Models/UML2SQL2003.iTrace#//@artefacts.0","TL5");
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, id, objectType,
relationType, artefact, traceLink) VALUES 
("3B","3B","3B","3B","UML!Package","Target",
"/M2DATDB/Models/UML2SQL2003.iTrace#//@artefacts.0","TL4");
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, id, objectType,
relationType, artefact, traceLink) VALUES 
("3B","3B","3B","3B","UML!Package","Source",
"/M2DATDB/Models/UML2SQL2003.iTrace#//@artefacts.0","TL6");




