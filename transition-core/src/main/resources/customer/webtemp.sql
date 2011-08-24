INSERT INTO partnerlogin ( customerformat, login, protocol, loginpassword) VALUES ( 'webtemp', 'webtemp', 2, 'password');
INSERT INTO partnermap ( partnerlogin_id, identifier, zclientid, description, partnermappassword) SELECT id,'phannonser', 40279, 'webtemp', 'password' FROM partnerlogin WHERE login='webtemp';
INSERT INTO partnermap ( partnerlogin_id, identifier, zclientid, description, partnermappassword) SELECT id,'537455', 537455, 'webtemp', 'password' FROM partnerlogin WHERE login='webtemp';
