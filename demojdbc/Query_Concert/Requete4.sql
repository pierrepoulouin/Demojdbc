/*4. Quels sont les dates et les identificateurs des concerts pour lesquels
 il ne reste aucun billet invendu ? */
 
 SELECT concert.Date_concert, concert.Concert_id
 FROM gestionspectacles.concert
INNER JOIN gestionspectacles.billet
ON concert.Concert_id = billet.Concert_id
INNER JOIN gestionspectacles.vente
ON billet.Billet_id = vente.Billet_id
INNER JOIN gestionspectacles.spectacle
ON concert.Spectacle_id = spectacle.Spectacle_id
INNER JOIN gestionspectacles.salle
ON spectacle.Salle_id = salle.Salle_id
WHERE salle.Capacite IN (SELECT COUNT(vente.Vente_id) FROM gestionspectacles.vente)
GROUP BY concert.concert_id;