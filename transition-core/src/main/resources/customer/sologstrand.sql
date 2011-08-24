INSERT INTO valuemap ( format, field, lookup, zettvalue, updatedtime) VALUES ('sologstrand', 'country', 'DK', 'Danmark', 1311147487320);

INSERT INTO partnerlogin ( customerformat, login, protocol, loginpassword) VALUES ('sologstrand', 'sologstrand', 2, 'password');
INSERT INTO partnermap ( partnerlogin_id, identifier, zclientid, description, partnermappassword) SELECT id,'sologstrand', 21946, 'sologstrand', 'password' FROM partnerlogin WHERE login='sologstrand';