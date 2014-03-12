-- iTrace SQL Script Generation --
-- Model Name: /M2DATDB/Models/UML2SQL20032.iTrace

INSERT INTO iTraceModel (uuid_iTraceModel, iTraceModel, projectName, version) VALUES ('_qnRpUDfPEeKpC9FV0t3jSg','/M2DATDB/Models/UML2SQL20032.iTrace#/','UML2SQL2003','1.0');
INSERT INTO TraceLink (uuid_TraceLink, traceLink, createdOn, type, fromFileName, tl_comment, createdBy, tl_mode, technicalBinding, ruleName, linkType, iTraceModel) VALUES ('_qnRpUTfPEeKpC9FV0t3jSg','/M2DATDB/Models/UML2SQL20032.iTrace#//@traceLinks.0','17-11-2012','Transformation','','Automatic generation by iTrace','iTrace Tool','Automatic','ATL','Package2Schema','M2MLink','/M2DATDB/Models/UML2SQL20032.iTrace#/');
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, objectType, relationType, artefact, traceLink, id) VALUES ('_qnSQYTfPEeKpC9FV0t3jSg','/M2DATDB/Models/UML2SQL20032.iTrace#//@traceLinks.0/@sourceElements.0','_jopigPxQEd2qTILnYStnJQ','UML!Package','Source','/M2DATDB/Models/UML2SQL20032.iTrace#//@artefacts.0','/M2DATDB/Models/UML2SQL20032.iTrace#//@traceLinks.0','UML_jopigPxQEd2qTILnYStnJQ');
INSERT INTO Artefact (uuid_Artefact, artefact, aspect, name, abstractionLevel, metamodel, path, artefactType, iTraceModel) VALUES ('_qnSQYDfPEeKpC9FV0t3jSg','/M2DATDB/Models/UML2SQL20032.iTrace#//@artefacts.0','Content','UML','PIM','/M2DATDB/Metamodels/UML.ecore','/M2DATDB/Models/omdb.uml','Model','/M2DATDB/Models/UML2SQL20032.iTrace#/');
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, objectType, relationType, artefact, traceLink, id) VALUES ('_qnSQYzfPEeKpC9FV0t3jSg','/M2DATDB/Models/UML2SQL20032.iTrace#//@traceLinks.0/@targetElements.0','/','SQL2003!Schema','Target','/M2DATDB/Models/UML2SQL20032.iTrace#//@artefacts.1','/M2DATDB/Models/UML2SQL20032.iTrace#//@traceLinks.0','SQL2003/');
INSERT INTO Artefact (uuid_Artefact, artefact, aspect, name, abstractionLevel, metamodel, path, artefactType, iTraceModel) VALUES ('_qnSQYjfPEeKpC9FV0t3jSg','/M2DATDB/Models/UML2SQL20032.iTrace#//@artefacts.1','Content','SQL2003','PSM','/M2DATDB/Metamodels/SQL2003.ecore','/M2DATDB/Models/omdb.sql2003','Model','/M2DATDB/Models/UML2SQL20032.iTrace#/');