# En utilisant  Eclipse et le code Java approprie récupérer de données
(exprimer les requêtes suivantes en SQL en utilisant le code java).
[Les etapes:      1. chargement du Driver ,      2. creation d un statement ,      3. definition de requete,      4. execution de requete]

1. Tous les détails de tous les clients.
2. Les numéros et les noms des produits de couleur rouge et de poids supérieur à 2000.
3. Les représentants ayant vendu au moins un produit.
4. Les noms des clients de Lyon ayant acheté un produit pour une quantité supérieure à 180.
5. Les noms des représentants et des clients à qui ces représentants ont vendu un produit de couleur rouge pour une quantité supérieure à 100.

Exercice #2 : Niveau de difficulté : 3

Enoncé de l'exercice
Un organisme de gestion de spectacles, de salles de concert et de vente de billets de spectacles gère une base de données dont le schéma relationnel est le suivant :

Spectacle(Spectacle_ID, Titre, DateDéb, Durée, Salle_ID, Chanteur)
Concert (Concert_ID, Date, Heure, Spectacle_ID)
Salle (Salle_ID, Nom, Adresse, Capacité)
Billet (Billet_ID, Concert_ID, Num_Place, Catégorie, Prix)
Vente (Vente_ID, Date_Vente, Billet_ID, MoyenPaiement)

Les attributs soulignés sont les attributs appartenant à la clé primaire. Ils sont de type entier.
L'attribut Salle_ID de la relation Spectacle est une clé étrangère qui fait référence à l'attribut de même nom de la relation Salle. L'attribut Spectacle_ID de la relation Concert est une clé étrangère qui fait référence à l'attribut de même nom de la relation Spectacle. L'attribut Concert_ID de la relation Billet est une clé étrangère qui fait référence à l'attribut de même nom de la relation Concert.
L'attribut Billet_ID de la relation Vente est une clé étrangère qui fait référence à l'attribut de même nom de la relation Billet.

Exprimez, lorsque cela est possible, les requêtes suivantes en SQL.

1. Quelles sont les dates du concert de Corneille au Zenith ?
2. Quels sont les noms des salles ayant la plus grande capacité ?
3. Quels sont les chanteurs n'ayant jamais réalisé de concert à la Cygale ?
4. Quels sont les dates et les identificateurs des concerts pour lesquels il ne reste aucun billet invendu ?


Exercice # 3 : Niveau de difficulté : 5.5

Enoncé de l'exercice
On suppose qu'une bibliothèque gère une base de données dont le schéma est le suivant 
(les clés primaires des relations sont soulignées) :

Emprunt(Personne, Livre, DateEmprunt, DateRetourPrevue, DateRetourEffective)
Retard(Personne, Livre, DateEmprunt, PenalitéRetard)


Exprimer, lorsque cela est possible, les requêtes suivantes en SQL.

1. Quelles sont les personnes ayant emprunté le livre "Recueil Examens BD" ?
2. Quelles sont les personnes n'ayant jamais rendu de livre en retard ?
3. Quelles sont les personnes ayant emprunté tous les livres (empruntés au moins une fois) ?
4. Quels sont les livres ayant été empruntés par tout le monde (i.e. tous les emprunteurs) ?
5. Quelles sont les personnes ayant toujours rendu en retard les livres qu'elles ont empruntés ?

