CREATE TABLE IF NOT EXISTS DBUnit;
USE DBUnit;
CREATE TABLE IF NOT EXISTS Alumnia(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  firstName VARCHAR(40) NOT NULL,
  lastName VARCHAR(40) NOT NULL,
  age INT NOT NULL
);