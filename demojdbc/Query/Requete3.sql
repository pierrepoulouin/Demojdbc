//Les noms des clients de Lyon ayant acheté un produit pour une quantité supérieure à 180.
SELECT DISTINCT  clients.nomc FROM formation.clients
INNER JOIN formation.ventes
ON clients.nc = ventes.nc
WHERE clients.ville = 'Lyon'
AND qt > 180;

