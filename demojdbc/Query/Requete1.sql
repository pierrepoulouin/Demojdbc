//Les num�ros et les noms des produits de couleur rouge et de poids sup�rieur � 2000.
SELECT np, nomp FROM formation.produits
WHERE coul = 'rouge'
AND pds>2000;