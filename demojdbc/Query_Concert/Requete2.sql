--  Quels sont les noms des salles ayant la plus grande capacité ?
SELECT salle.Nom FROM gestionspectacles.salle
ORDER BY salle.Capacite DESC;