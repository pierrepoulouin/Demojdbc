USE `cinema`;

CREATE TABLE `cinema`.`salle` (
	numc INT,
    nums INT NOT NULL AUTO_INCREMENT,
    taille_ecran INT,
    nbplaces INT,
    PRIMARY KEY (nums),
    FOREIGN KEY (numc) REFERENCES `cinema`.`cinema` (numc)
);