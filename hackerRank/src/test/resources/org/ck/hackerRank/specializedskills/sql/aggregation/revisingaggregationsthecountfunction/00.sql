USE test;

CREATE TABLE city (
  id          INT,
  name        VARCHAR(17),
  countrycode VARCHAR(3),
  district    VARCHAR(20),
  population  INT
);

INSERT INTO city VALUES (1, 'City 1', 'USA', '', 1500);
INSERT INTO city VALUES (2, 'City 2', 'USA', '', 3000);
INSERT INTO city VALUES (3, 'City 3', 'USA', '', 100001);
INSERT INTO city VALUES (4, 'City 4', 'USA', '', 500000);