-- Quelles sont les dates du concert de Corneille au Zenith ?
SELECT concert.Date_concert FROM gestionspectacles.concert
INNER JOIN gestionspectacles.spectacle ON concert.Spectacle_id = spectacle.Spectacle_id
INNER JOIN gestionspectacles.salle ON salle.Salle_id = spectacle.Salle_id
WHERE spectacle.Chanteur = 'Corneille'
AND salle.Nom = 'Zenith';