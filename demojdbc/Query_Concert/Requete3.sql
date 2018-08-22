-- 3. Quels sont les chanteurs n'ayant jamais réalisé de concert à la Cygale ?

SELECT DISTINCT spectacle.Chanteur FROM gestionspectacles.concert
INNER JOIN gestionspectacles.spectacle
ON concert.Spectacle_id = spectacle.Spectacle_id
INNER JOIN gestionspectacles.salle
ON spectacle.Salle_id = salle.Salle_id
WHERE salle.Nom != 'La Cygale'
GROUP BY spectacle.Chanteur;