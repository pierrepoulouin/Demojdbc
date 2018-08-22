USE gestionspectacles;
CREATE TABLE salle (
Salle_id INT PRIMARY KEY,
Nom VARCHAR(40),
Adresse VARCHAR(40),
Capacite INT);

CREATE TABLE spectacle (
Spectacle_id INT,
Titre VARCHAR(40),
Datedeb DATE,
Duree INT,
Salle_id INT REFERENCES salle(Salle_id),
Chanteur VARCHAR(40),
PRIMARY KEY (Spectacle_id));

CREATE TABLE concert (
Concert_id INT PRIMARY KEY,
Date_concert DATE,
Heure TIME,
Spectacle_id INT REFERENCES spectacle(Spectacle_id));

CREATE TABLE billet (
Billet_id INT PRIMARY KEY,
Concert_id INT REFERENCES concert(Concert_id),
Num_place INT,
Categorie VARCHAR(40),
Prix INT
);

CREATE TABLE vente (
Vente_id INT PRIMARY KEY,
Date_vente DATE,
Billet_id INT REFERENCES billet(Billet_id),
Moyenpaiement VARCHAR(40)
);

