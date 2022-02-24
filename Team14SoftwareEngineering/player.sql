--Create table
CREATE TABLE player (
  id VARCHAR(64),
  first_name VARCHAR(30),
  last_name VARCHAR(30),
  codename VARCHAR(30),
  PRIMARY KEY (id)
);

--Place first record into table
INSERT INTO player (id, first_name, last_name, codename)
VALUES (1, 'Jim', 'Strother', 'Opus');
