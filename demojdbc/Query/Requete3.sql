//Les noms des clients de Lyon ayant achet� un produit pour une quantit� sup�rieure � 180.
SELECT DISTINCT  clients.nomc FROM formation.clients
INNER JOIN formation.ventes
ON clients.nc = ventes.nc
WHERE clients.ville = 'Lyon'
AND qt > 180;

