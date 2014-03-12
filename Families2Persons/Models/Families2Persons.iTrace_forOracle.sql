-- iTrace SQL Script Generation --
-- Model Name: /Families2Persons/Models/Families2Persons.iTrace

INSERT INTO iTraceModel (uuid_iTraceModel, iTraceModel, projectName, version) VALUES ('_Qp3o8Do8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#/','Families2Persons','1.0');
INSERT INTO TraceLink (uuid_TraceLink, traceLink, createdOn, type, fromFileName, tl_comment, createdBy, tl_mode, technicalBinding, ruleName, linkType, iTraceModel) VALUES ('_Qp4QADo8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.0','29-11-2012','Transformation','','Automatic generation by iTrace','iTrace Tool','Automatic','ATL','Member2Male','M2MLink','/Families2Persons/Models/Families2Persons.iTrace#/');
INSERT INTO TraceLink (uuid_TraceLink, traceLink, createdOn, type, fromFileName, tl_comment, createdBy, tl_mode, technicalBinding, ruleName, linkType, iTraceModel) VALUES ('_Qp4QATo8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.1','29-11-2012','Transformation','','Automatic generation by iTrace','iTrace Tool','Automatic','ATL','Member2Male','M2MLink','/Families2Persons/Models/Families2Persons.iTrace#/');
INSERT INTO TraceLink (uuid_TraceLink, traceLink, createdOn, type, fromFileName, tl_comment, createdBy, tl_mode, technicalBinding, ruleName, linkType, iTraceModel) VALUES ('_Qp4QAjo8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.2','29-11-2012','Transformation','','Automatic generation by iTrace','iTrace Tool','Automatic','ATL','Member2Male','M2MLink','/Families2Persons/Models/Families2Persons.iTrace#/');
INSERT INTO TraceLink (uuid_TraceLink, traceLink, createdOn, type, fromFileName, tl_comment, createdBy, tl_mode, technicalBinding, ruleName, linkType, iTraceModel) VALUES ('_Qp4QAzo8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.3','29-11-2012','Transformation','','Automatic generation by iTrace','iTrace Tool','Automatic','ATL','Member2Male','M2MLink','/Families2Persons/Models/Families2Persons.iTrace#/');
INSERT INTO TraceLink (uuid_TraceLink, traceLink, createdOn, type, fromFileName, tl_comment, createdBy, tl_mode, technicalBinding, ruleName, linkType, iTraceModel) VALUES ('_Qp4QBDo8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.4','29-11-2012','Transformation','','Automatic generation by iTrace','iTrace Tool','Automatic','ATL','Member2Female','M2MLink','/Families2Persons/Models/Families2Persons.iTrace#/');
INSERT INTO TraceLink (uuid_TraceLink, traceLink, createdOn, type, fromFileName, tl_comment, createdBy, tl_mode, technicalBinding, ruleName, linkType, iTraceModel) VALUES ('_Qp4QBTo8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.5','29-11-2012','Transformation','','Automatic generation by iTrace','iTrace Tool','Automatic','ATL','Member2Female','M2MLink','/Families2Persons/Models/Families2Persons.iTrace#/');
INSERT INTO TraceLink (uuid_TraceLink, traceLink, createdOn, type, fromFileName, tl_comment, createdBy, tl_mode, technicalBinding, ruleName, linkType, iTraceModel) VALUES ('_Qp4QBjo8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.6','29-11-2012','Transformation','','Automatic generation by iTrace','iTrace Tool','Automatic','ATL','Member2Female','M2MLink','/Families2Persons/Models/Families2Persons.iTrace#/');
INSERT INTO TraceLink (uuid_TraceLink, traceLink, createdOn, type, fromFileName, tl_comment, createdBy, tl_mode, technicalBinding, ruleName, linkType, iTraceModel) VALUES ('_Qp4QBzo8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.7','29-11-2012','Transformation','','Automatic generation by iTrace','iTrace Tool','Automatic','ATL','Member2Female','M2MLink','/Families2Persons/Models/Families2Persons.iTrace#/');
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, objectType, relationType, artefact, traceLink, id) VALUES ('_Qp4QCTo8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.0/@sourceElements.0','//@containing.0/@father','FamiliesModel!Member','Source','/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.0','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.0','Families//@containing.0/@father');
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, objectType, relationType, artefact, traceLink, id) VALUES ('_Qp4QCjo8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.1/@sourceElements.0','//@containing.0/@sons.0','FamiliesModel!Member','Source','/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.0','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.1','Families//@containing.0/@sons.0');
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, objectType, relationType, artefact, traceLink, id) VALUES ('_Qp4QCzo8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.2/@sourceElements.0','//@containing.1/@father','FamiliesModel!Member','Source','/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.0','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.2','Families//@containing.1/@father');
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, objectType, relationType, artefact, traceLink, id) VALUES ('_Qp4QDDo8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.3/@sourceElements.0','//@containing.1/@sons.0','FamiliesModel!Member','Source','/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.0','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.3','Families//@containing.1/@sons.0');
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, objectType, relationType, artefact, traceLink, id) VALUES ('_Qp4QDTo8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.4/@sourceElements.0','//@containing.0/@mother','FamiliesModel!Member','Source','/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.0','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.4','Families//@containing.0/@mother');
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, objectType, relationType, artefact, traceLink, id) VALUES ('_Qp4QDjo8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.5/@sourceElements.0','//@containing.0/@daughters.0','FamiliesModel!Member','Source','/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.0','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.5','Families//@containing.0/@daughters.0');
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, objectType, relationType, artefact, traceLink, id) VALUES ('_Qp43EDo8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.6/@sourceElements.0','//@containing.0/@daughters.1','FamiliesModel!Member','Source','/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.0','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.6','Families//@containing.0/@daughters.1');
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, objectType, relationType, artefact, traceLink, id) VALUES ('_Qp43ETo8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.7/@sourceElements.0','//@containing.1/@mother','FamiliesModel!Member','Source','/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.0','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.7','Families//@containing.1/@mother');
INSERT INTO Artefact (uuid_Artefact, artefact, aspect, name, abstractionLevel, metamodel, path, artefactType, iTraceModel) VALUES ('_Qp4QCDo8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.0','Unspecified','Families','UNSPECIFIED','/Families2Persons/Metamodels/Families.ecore','/Families2Persons/Models/Families.families','Model','/Families2Persons/Models/Families2Persons.iTrace#/');
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, objectType, relationType, artefact, traceLink, id) VALUES ('_Qp43Ezo8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.0/@targetElements.0','/0','PersonsModel!Male','Target','/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.1','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.0','Persons/0');
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, objectType, relationType, artefact, traceLink, id) VALUES ('_Qp43FDo8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.1/@targetElements.0','/1','PersonsModel!Male','Target','/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.1','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.1','Persons/1');
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, objectType, relationType, artefact, traceLink, id) VALUES ('_Qp43FTo8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.2/@targetElements.0','/2','PersonsModel!Male','Target','/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.1','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.2','Persons/2');
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, objectType, relationType, artefact, traceLink, id) VALUES ('_Qp43Fjo8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.3/@targetElements.0','/3','PersonsModel!Male','Target','/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.1','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.3','Persons/3');
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, objectType, relationType, artefact, traceLink, id) VALUES ('_Qp43Fzo8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.4/@targetElements.0','/4','PersonsModel!Female','Target','/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.1','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.4','Persons/4');
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, objectType, relationType, artefact, traceLink, id) VALUES ('_Qp43GDo8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.5/@targetElements.0','/5','PersonsModel!Female','Target','/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.1','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.5','Persons/5');
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, objectType, relationType, artefact, traceLink, id) VALUES ('_Qp43GTo8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.6/@targetElements.0','/6','PersonsModel!Female','Target','/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.1','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.6','Persons/6');
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, objectType, relationType, artefact, traceLink, id) VALUES ('_Qp43Gjo8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.7/@targetElements.0','/7','PersonsModel!Female','Target','/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.1','/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.7','Persons/7');
INSERT INTO Artefact (uuid_Artefact, artefact, aspect, name, abstractionLevel, metamodel, path, artefactType, iTraceModel) VALUES ('_Qp43Ejo8EeKgotrQd6-Dlw','/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.1','Unspecified','Persons','UNSPECIFIED','/Families2Persons/Metamodels/Persons.ecore','/Families2Persons/Models/Persons.persons','Model','/Families2Persons/Models/Families2Persons.iTrace#/');