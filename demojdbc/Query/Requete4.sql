//Les noms des repr�sentants et des clients � qui ces repr�sentants ont vendu un produit de couleur rouge pour une quantit� sup�rieure � 100.
SELECT DISTINCT representants.nomr, clients.nomc FROM (((formation.ventes
INNER JOIN formation.produits ON ventes.np = produits.np)
INNER JOIN formation.representants ON ventes.nr = representants.nr)
INNER JOIN formation.clients ON ventes.nc = clients.nc)
WHERE produits.coul = 'Rouge'
AND ventes.qt > 100;
