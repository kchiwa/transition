INSERT INTO partnerlogin ( customerformat, login, protocol, loginpassword) VALUES ( 'iadifjob', 'jobzone', 2, 'password');
INSERT INTO partnermap ( partnerlogin_id, identifier, zclientid, description, partnermappassword) SELECT id,'jobzone', 680803, 'Job Zone', 'password' FROM partnerlogin WHERE login='jobzone';
INSERT INTO partnerlogin ( customerformat, login, protocol, loginpassword) VALUES ( 'iadifjob', 'adecco', 2, 'password');

INSERT INTO partnermap ( partnerlogin_id, identifier, zclientid, description, partnermappassword) SELECT id,'adeccookonomi', 792008, 'Adecco', 'password' FROM partnerlogin WHERE login='adecco';
INSERT INTO partnermap ( partnerlogin_id, identifier, zclientid, description, partnermappassword) SELECT id,'adeccoingenior', 792008, 'Adecco', 'password' FROM partnerlogin WHERE login='adecco';
INSERT INTO partnermap ( partnerlogin_id, identifier, zclientid, description, partnermappassword) SELECT id,'adeccoit', 792008, 'Adecco', 'password' FROM partnerlogin WHERE login='adecco';
INSERT INTO partnermap ( partnerlogin_id, identifier, zclientid, description, partnermappassword) SELECT id,'adeccohelse', 792008, 'Adecco', 'password' FROM partnerlogin WHERE login='adecco';
INSERT INTO partnermap ( partnerlogin_id, identifier, zclientid, description, partnermappassword) SELECT id,'adeccosalg', 792008, 'Adecco', 'password' FROM partnerlogin WHERE login='adecco';
INSERT INTO partnermap ( partnerlogin_id, identifier, zclientid, description, partnermappassword) SELECT id,'adeccohospitality', 792008, 'Adecco', 'password' FROM partnerlogin WHERE login='adecco';
INSERT INTO partnermap ( partnerlogin_id, identifier, zclientid, description, partnermappassword) SELECT id,'adeccobygg', 792008, 'Adecco', 'password' FROM partnerlogin WHERE login='adecco';
INSERT INTO partnermap ( partnerlogin_id, identifier, zclientid, description, partnermappassword) SELECT id,'adeccotransport', 792008, 'Adecco', 'password' FROM partnerlogin WHERE login='adecco';
INSERT INTO partnermap ( partnerlogin_id, identifier, zclientid, description, partnermappassword) SELECT id,'adeccobasis', 792008, 'Adecco', 'password' FROM partnerlogin WHERE login='adecco';
INSERT INTO partnermap ( partnerlogin_id, identifier, zclientid, description, partnermappassword) SELECT id,'adeccofinans', 792008, 'Adecco', 'password' FROM partnerlogin WHERE login='adecco';
INSERT INTO partnermap ( partnerlogin_id, identifier, zclientid, description, partnermappassword) SELECT id,'adeccojurisisk', 792008, 'Adecco', 'password' FROM partnerlogin WHERE login='adecco';
INSERT INTO partnermap ( partnerlogin_id, identifier, zclientid, description, partnermappassword) SELECT id,'adeccomarine', 792008, 'Adecco', 'password' FROM partnerlogin WHERE login='adecco';
INSERT INTO partnermap ( partnerlogin_id, identifier, zclientid, description, partnermappassword) SELECT id,'adeccofinanspersonell', 792008, 'Adecco', 'password' FROM partnerlogin WHERE login='adecco';
INSERT INTO partnermap ( partnerlogin_id, identifier, zclientid, description, partnermappassword) SELECT id,'adeccopedagogisk', 792008, 'Adecco', 'password' FROM partnerlogin WHERE login='adecco';
INSERT INTO partnermap ( partnerlogin_id, identifier, zclientid, description, partnermappassword) SELECT id,'adeccokontor', 792008, 'Adecco', 'password' FROM partnerlogin WHERE login='adecco';



