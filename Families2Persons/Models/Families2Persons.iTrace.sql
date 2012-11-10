-- iTrace SQL Script Generation --
-- Model Name: /Families2Persons/Models/Families2Persons.iTrace

INSERT INTO iTraceModel (uuid_iTraceModel, iTraceModel, projectName, version) VALUES ("_CYFsoCqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#/","Families2Persons","1.0");
INSERT INTO TraceLink (uuid_TraceLink, traceLink, createdOn, type, fromFileName, comment, createdBy, mode, technicalBinding, ruleName, linkType, iTraceModel) VALUES ("_CYGTsCqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.0","09-11-2012","Transformation","","Automatic generation by iTrace","iTrace Tool","Automatic","ATL","Member2Male","M2MLink","/Families2Persons/Models/Families2Persons.iTrace#/");
INSERT INTO TraceLink (uuid_TraceLink, traceLink, createdOn, type, fromFileName, comment, createdBy, mode, technicalBinding, ruleName, linkType, iTraceModel) VALUES ("_CYGTsSqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.1","09-11-2012","Transformation","","Automatic generation by iTrace","iTrace Tool","Automatic","ATL","Member2Male","M2MLink","/Families2Persons/Models/Families2Persons.iTrace#/");
INSERT INTO TraceLink (uuid_TraceLink, traceLink, createdOn, type, fromFileName, comment, createdBy, mode, technicalBinding, ruleName, linkType, iTraceModel) VALUES ("_CYGTsiqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.2","09-11-2012","Transformation","","Automatic generation by iTrace","iTrace Tool","Automatic","ATL","Member2Male","M2MLink","/Families2Persons/Models/Families2Persons.iTrace#/");
INSERT INTO TraceLink (uuid_TraceLink, traceLink, createdOn, type, fromFileName, comment, createdBy, mode, technicalBinding, ruleName, linkType, iTraceModel) VALUES ("_CYGTsyqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.3","09-11-2012","Transformation","","Automatic generation by iTrace","iTrace Tool","Automatic","ATL","Member2Male","M2MLink","/Families2Persons/Models/Families2Persons.iTrace#/");
INSERT INTO TraceLink (uuid_TraceLink, traceLink, createdOn, type, fromFileName, comment, createdBy, mode, technicalBinding, ruleName, linkType, iTraceModel) VALUES ("_CYGTtCqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.4","09-11-2012","Transformation","","Automatic generation by iTrace","iTrace Tool","Automatic","ATL","Member2Female","M2MLink","/Families2Persons/Models/Families2Persons.iTrace#/");
INSERT INTO TraceLink (uuid_TraceLink, traceLink, createdOn, type, fromFileName, comment, createdBy, mode, technicalBinding, ruleName, linkType, iTraceModel) VALUES ("_CYGTtSqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.5","09-11-2012","Transformation","","Automatic generation by iTrace","iTrace Tool","Automatic","ATL","Member2Female","M2MLink","/Families2Persons/Models/Families2Persons.iTrace#/");
INSERT INTO TraceLink (uuid_TraceLink, traceLink, createdOn, type, fromFileName, comment, createdBy, mode, technicalBinding, ruleName, linkType, iTraceModel) VALUES ("_CYGTtiqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.6","09-11-2012","Transformation","","Automatic generation by iTrace","iTrace Tool","Automatic","ATL","Member2Female","M2MLink","/Families2Persons/Models/Families2Persons.iTrace#/");
INSERT INTO TraceLink (uuid_TraceLink, traceLink, createdOn, type, fromFileName, comment, createdBy, mode, technicalBinding, ruleName, linkType, iTraceModel) VALUES ("_CYGTtyqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.7","09-11-2012","Transformation","","Automatic generation by iTrace","iTrace Tool","Automatic","ATL","Member2Female","M2MLink","/Families2Persons/Models/Families2Persons.iTrace#/");
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, type, artefact, relationType, traceLink) VALUES ("_CYGTuSqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.0/@sourceElements.0","//@containing.0/@father","FamiliesModel!Member","Source","/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.0","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.0");
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, type, artefact, relationType, traceLink) VALUES ("_CYGTuiqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.1/@sourceElements.0","//@containing.0/@sons.0","FamiliesModel!Member","Source","/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.0","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.1");
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, type, artefact, relationType, traceLink) VALUES ("_CYGTuyqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.2/@sourceElements.0","//@containing.1/@father","FamiliesModel!Member","Source","/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.0","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.2");
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, type, artefact, relationType, traceLink) VALUES ("_CYGTvCqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.3/@sourceElements.0","//@containing.1/@sons.0","FamiliesModel!Member","Source","/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.0","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.3");
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, type, artefact, relationType, traceLink) VALUES ("_CYGTvSqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.4/@sourceElements.0","//@containing.0/@mother","FamiliesModel!Member","Source","/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.0","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.4");
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, type, artefact, relationType, traceLink) VALUES ("_CYGTviqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.5/@sourceElements.0","//@containing.0/@daughters.0","FamiliesModel!Member","Source","/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.0","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.5");
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, type, artefact, relationType, traceLink) VALUES ("_CYGTvyqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.6/@sourceElements.0","//@containing.0/@daughters.1","FamiliesModel!Member","Source","/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.0","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.6");
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, type, artefact, relationType, traceLink) VALUES ("_CYGTwCqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.7/@sourceElements.0","//@containing.1/@mother","FamiliesModel!Member","Source","/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.0","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.7");
INSERT INTO Artefact (uuid_Artefact, artefact, aspect, name, abstractionLevel, metamodel, path, artefactType, iTraceModel) VALUES ("_CYGTuCqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.0","Unspecified","Families","UNSPECIFIED","D:/Workspaces/Case Studies/Families2Persons/Metamodels/Families.ecore","D:/Workspaces/Case Studies/Families2Persons/Models/Families.families","Model","/Families2Persons/Models/Families2Persons.iTrace#/");
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, type, artefact, relationType, traceLink) VALUES ("_CYG6wSqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.0/@targetElements.0","/0","PersonsModel!Male","Target","/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.1","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.0");
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, type, artefact, relationType, traceLink) VALUES ("_CYG6wiqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.1/@targetElements.0","/1","PersonsModel!Male","Target","/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.1","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.1");
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, type, artefact, relationType, traceLink) VALUES ("_CYG6wyqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.2/@targetElements.0","/2","PersonsModel!Male","Target","/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.1","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.2");
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, type, artefact, relationType, traceLink) VALUES ("_CYG6xCqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.3/@targetElements.0","/3","PersonsModel!Male","Target","/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.1","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.3");
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, type, artefact, relationType, traceLink) VALUES ("_CYG6xSqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.4/@targetElements.0","/4","PersonsModel!Female","Target","/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.1","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.4");
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, type, artefact, relationType, traceLink) VALUES ("_CYG6xiqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.5/@targetElements.0","/5","PersonsModel!Female","Target","/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.1","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.5");
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, type, artefact, relationType, traceLink) VALUES ("_CYG6xyqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.6/@targetElements.0","/6","PersonsModel!Female","Target","/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.1","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.6");
INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, ref, type, artefact, relationType, traceLink) VALUES ("_CYG6yCqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.7/@targetElements.0","/7","PersonsModel!Female","Target","/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.1","/Families2Persons/Models/Families2Persons.iTrace#//@traceLinks.7");
INSERT INTO Artefact (uuid_Artefact, artefact, aspect, name, abstractionLevel, metamodel, path, artefactType, iTraceModel) VALUES ("_CYG6wCqqEeKdUp5cOuprvQ","/Families2Persons/Models/Families2Persons.iTrace#//@artefacts.1","Unspecified","Persons","UNSPECIFIED","D:/Workspaces/Case Studies/Families2Persons/Metamodels/Persons.ecore","D:/Workspaces/Case Studies/Families2Persons/Models/Persons.persons","Model","/Families2Persons/Models/Families2Persons.iTrace#/");
