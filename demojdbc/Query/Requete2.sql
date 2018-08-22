// Les représentants ayant vendu au moins un produit.
SELECT representants.nomr FROM formation.representants
INNER JOIN formation.ventes
ON representants.nr = ventes.qt
WHERE qt > 1;
