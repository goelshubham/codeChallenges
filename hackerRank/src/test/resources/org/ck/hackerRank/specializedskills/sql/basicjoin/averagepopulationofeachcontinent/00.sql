USE test;

CREATE TABLE city (
  id          INT,
  name        VARCHAR(17),
  countrycode VARCHAR(3),
  district    VARCHAR(20),
  population  INT
);

CREATE TABLE country (
  code           VARCHAR(3),
  name           VARCHAR(44),
  continent      VARCHAR(13),
  region         VARCHAR(25),
  surfacearea    INT,
  indepyear      VARCHAR(5),
  population     INT,
  lifeexpectancy VARCHAR(4),
  gnp            INT,
  gnpold         INT,
  localname      VARCHAR(44),
  governmentform VARCHAR(44),
  headofstate    VARCHAR(32),
  capital        VARCHAR(4),
  code2          VARCHAR(2)
);

INSERT INTO city VALUES (1, 'City 1', 'GHN', 'D 1', 1500);
INSERT INTO city VALUES (2, 'City 2', 'MOR', 'D 2', 3000);
INSERT INTO city VALUES (3, 'City 3', 'USA', 'D 5', 100001);
INSERT INTO city VALUES (4, 'City 4', 'USA', 'DC', 500000);

INSERT INTO country VALUE ('GHN', 'Ghana', 'Africa', 'R 1', 5, '??', 12, '42', 18, 16, 'Ghana', '', '', 'CAP', '');
INSERT INTO country VALUE ('MOR', 'Morocco', 'Africa', 'R 1', 5, '??', 12, '42', 18, 16, 'Morocco', '', '', 'CAP', '');
INSERT INTO country VALUE ('USA', 'USA', 'North America', 'R 1', 5, '??', 12, '42', 18, 16, 'USA', '', '', 'CAP', '');