-- Donner le nombre de films de 1960 par genre.

SELECT genre, COUNT(*) AS NombreFilm
FROM film
WHERE annee = 1960
GROUP BY genre; 