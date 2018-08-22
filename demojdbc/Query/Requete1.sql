//Les numéros et les noms des produits de couleur rouge et de poids supérieur à 2000.
SELECT np, nomp FROM formation.produits
WHERE coul = 'rouge'
AND pds>2000;