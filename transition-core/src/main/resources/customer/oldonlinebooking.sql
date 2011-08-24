INSERT INTO partnerlogin ( customerformat, login, protocol, loginpassword) VALUES ( 'oldonlinebooking', 'Sogn Avis', 2, 'password');
INSERT INTO partnermap ( partnerlogin_id, identifier, zclientid, description, partnermappassword) SELECT id,'Sogn Avis', 10039, 'Sogn Avis', 'password' FROM partnerlogin WHERE login='Sogn Avis';

INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','privacy','Ingen kontaktinfo skal vises','SHOW_NONE',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','privacy','Email vises','SHOW_EMAIL',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','privacy','Telefonnummer vises','SHOW_PHONE',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','privacy','Navn og telefonnummer vises','SHOW_NAME_PHONE',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','privacy','Epost og telefonnummer vises','SHOW_EMAIL_PHONE',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','privacy','Email, navn og telefonnummer vises','SHOW_EMAIL_NAME_PHONE',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','privacy','All kontaktinfo kan vises på annonsen','SHOW_ALL',1311147487320);

INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','transaction','Til salgs','FOR_SALE',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','transaction','Til leie','FOR_RENT',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','transaction','Ønskes kjøpt','WANTED_BUY',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','transaction','Ønskes leid','WANTED_RENT',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','transaction','Byttes','TRADE',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','transaction','Gis bort','GIVE_AWAY',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','transaction','Gis bort/Byttes','GIVE_AWAY',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','transaction','Arbeidskraft søkes','SERVICES_WANTED',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','transaction','Arbeid utføres','SERVICES_PERFORMED',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','transaction','Tapt/Funnet','LOST_AND_FOUND',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','transaction','Annet','OTHER',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','transaction','Stilling ledig','JOB_AVAILABLE',1311147487320);

INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','country','Norway','Norge',1311147487320);

INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','taxpaid','0','Nei',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','taxpaid','1','Ja',1311147487320);

INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','workarea','Håndtverkstjenester','Håndverksfag',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','workarea','Salgstjenester','Salg',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','workarea','Helse, Sosial og Omsorg','Helse, Sykepleie, Sosial og Omsorg',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','workarea','Helse, sykepleie, sosial og omsorg','Helse, Sykepleie, Sosial og Omsorg',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','workarea','Bud- og transport tjenester','Bud- og Transport-tjenester',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','workarea','Tomterydding/Hagearbeid/Jordbruk','Jordbruk, Skogbruk og Fiske',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','workarea','IT-tjenester','Data og IT',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','workarea','Finansielle/økonomiske tjenester','Bank og Finans',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking','workarea','Helse og skjønnhet','Helse og Skjønnhet',1311147487320);


INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Barneutstyr','Barneutstyr',5619,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Billetter','Billetter',7525,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Brensel/varme','Brensel/varme',6243,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Brunevarer og elektriske artikler','Elektriske apparater',5833,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Bøker og Magasiner','Bøker',7363,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Bygningsartikler','Byggevarer',5793,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Foto','Digitale fotoapparat',4368,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Hus og Hjem diverse','Hus, hage og interiør',5719,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Klær, Ur og Smykker','Smykker',5099,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Samleobjekter','Samlerobjekter',6993,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Data og teleutstyr','Data og IKT',2690,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Dyr og utstyr','Dyr og dyreutstyr',4539,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Film og Musikk','Musikk og film',7293,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Hage','Hage',5779,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Helse','Helse',500,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Hvitevarer','Hvitevarer',5883,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Kunst og antikk','Kunst og antikviteter',6493,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Leketøy og Hobby','Leker',5469,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Mat og Drikke','Mat og Drikke',7163,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Møbler','Interiør og møbler',6303,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Reiseliv','Reiser',7545,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Sport og Fritid','Sport og friluftsliv',7655,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Verktøy','Verktøy',5803,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Annet','Annet',10100,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Bud- og transport tjenester','Transport, lager og logistikk',1590,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Dagmamma/Praktikant','Dagmamma',804,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Finansielle/økonomiske','tjenester Bank/Finansielle tjenester',201,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Håndtverkstjenester','Håndverksfag/bygg og anlegg',2200,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Helse og skjønnhet','Skjønnhet og velvære',600,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'IT-tjenester','Data og IKT',2690,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Jordbrukstjenester','Jordbruk',3200,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Kontortjenester','Kontormedarbeider/Sekretær',102,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Rengjøring','Rengjøring',17500,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Sesongarbeid','Annet',11,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Salgstjenester','Salg, Media og Markeføring',1190,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Tomterydding/Hagearbeid/Jordbruk','Hagearbeid',17460,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Undervisningstjenester','Undervisning',17740,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Underholdning','Kultur, idrett og organisasjoner',1890,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Vedlikehold/Oppussing/Rydding','Vedlikeholdsarbeid',17510,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Campingvogn','Campingvogn',10550,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Traktor','Traktor',10803,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Bolig','Bolig',16200,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Båtplass','Båtplass',14080,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Båt','Båt',13000,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Bil','Bil',10200,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Landbruks- maskiner/utstyr','Utstyr',10833,1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,categoryid, updatedtime) VALUES('oldonlinebooking', 'type', 'Dekk og felger','Dekk og felger',11244,1311147487320);

INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'EDITURL','onlinebookingedit',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'OPTION','feature',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'OPTION_SAFETY','feature',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'OPTION_COMFORT','feature',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'OPTION_OTHER','feature',1311147487320);

INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'AUTOTYPE','type',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'MCTYPE','type',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'BOATCAT','type',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'CAT','type',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'ADCAT','type',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'JOBCAT','type',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'JOBADCAT','type',1311147487320);

INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'MARQUE','make',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'MODEL','model',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'VARIANT','variant',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'YEAR','modelyear',1311147487320);

INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'REGNR','registrationnumber',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'KM','mileage',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'ENGINEVOLUME','enginevolume',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'POWER','enginehp',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'FUEL','fueltype',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'WHEELDRIVE','wheeldrive',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'TRANSMISSION','geartype',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'SEATS','seats',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'DOORS','doors',1311147487320);

INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'COLOR','basecolor',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'COLORNAME','color',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'INTERIORCOLOR','interiorcolor',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'TAXPAID','yearlyfeepaid',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'SOURCE','saletype',1311147487320);

INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'REREGISTRATIONFEE','reregistrationfee',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'GUARANTEE','guarantee',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'SIZE','length',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'CCM','enginevolume',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'HOURS','operationhours',1311147487320);

INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'HOMETYPE','propertytype',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'CABINTYPE','propertytype',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'BUILDINGTYPE','propertytype',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'TOMTTYPE','propertytype',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'RENTTYPE','propertytype',1311147487320);

INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'KNR','municipalnumber',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'GNR','cadastralnumber',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'BNR','holdingnumber',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'SNR','sectionnumber',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'FNR','leasenumber',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'HOUSENUMBER','housenumber',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'APARTMENTNUMBER','apartmentnumber',1311147487320);

INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'PRICE','price',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'ESTVALUE','valueestimate',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'LOANVALUE','loanestimate',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'TAXVALUE','taxvalue',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'SHAREDDEBT','shareddebt',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'SHAREDEXPENCES','sharedexpences',1311147487320);

INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'YEAR','buildyear',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'AREA','area',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'MINAREA','minimumleasearea',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'BOA','livingarea',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'BTA','grossarea',1311147487320);

INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'GRF','basearea',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'PROPERTYCOUNT','propertycount',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'LOTAREA','lotarea',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'LOTRENT','leasefee',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'OWNERSHIP','ownership',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'LOTOWNERSHIP','lotownership',1311147487320);

INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'FLOOR','floor',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'FLOORS','floors',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'NOROOMS','rooms',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'NOBEDROOMS','bedrooms',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'BEDROOMS','bedrooms',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'BATHROOMS','bathrooms',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'EXTRATOILETS','extratoilets',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'LIVINGROOMS','livingrooms',1311147487320);

INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'PARKING','parkingspaces',1311147487320);

INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'LIFESPANSTANDARD','lifespanstandard',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'HUSBANKFINANCING','housebankfinancing',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'MODERNIZEDYEAR','modernizedyear',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'RESTAU','renovatedyear',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'VIEWING','viewing',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'FLOOR','floor',1311147487320);

INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'AVAILABLEFROM','availablefrom',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'DATEFROM','wanteddate',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'FURNITURE','furniturestatus',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'DEPOSIT','deposit',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'NOBEDS','beds',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'MAXRENT','monthlyrent',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'SITUATED','text',1311147487320);

INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'SALEDOCURL','saledocumenturl',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'TAKSTURL','valueestimateurl',1311147487320);

INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'EMPLOYER','employer',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'EMPLOYER_WEBPAGE','employerhomepage',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'JOBTITLE','positiontitle',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'POSITIONS','positioncount',1311147487320);

INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'LOCATION','worklocation',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'SECTOR','worksector',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'ENGAGEMENT','engagementtype',1311147487320);

INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'ROLE','workrole',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'PAY','salary',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'STARTING','starttime',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'EDUCATION','education',1311147487320);

INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'DEADLINE','applicationdue',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'TAG','applicationtag',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'APPLICATION_WEBPAGE','applicationurl',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'APPLICATION_MAILADDRESS','applicationmail',1311147487320);
INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'APPLICATION_EMAILADDRESS','applicationemail',1311147487320);

INSERT INTO valuemap (format,field,lookup,zettvalue,updatedtime) VALUES('oldonlinebooking', 'attribute', 'CONDITION','condition',1311147487320);


