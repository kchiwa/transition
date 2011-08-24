INSERT INTO partnerlogin ( customerformat, login, protocol, loginpassword) VALUES ( 'iadifestateforsale', 'iadifestateforsale', 2, 'password');
INSERT INTO valuemap ( format, field, lookup, zettvalue, categoryid, updatedtime) VALUES ('iadifestateforsale', 'type', 'estatesale', '', 16200, 1311147487320);

INSERT INTO partnermap ( partnerlogin_id, identifier, zclientid, description, partnermappassword) SELECT id,'NOR', 22101, 'iadifestateforsale', 'password' FROM partnerlogin WHERE login='iadifestateforsale';
