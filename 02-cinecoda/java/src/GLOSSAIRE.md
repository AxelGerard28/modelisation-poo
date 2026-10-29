# Glossaire CineCoda
 ___

## Les Entités :

- **Cinema** : Le bâtiment en lui meme, il a plusieurs salles.


- **Salle** : L'emplacement ou les films sont projetés, elle a un nombre 
de places limitée et un seul type de projecteur


- **Séance** : Le moment où le film est projeté, elle a une horaire et une durée, 
et est assignée à une salle.


- **Projecteur** : C'est l'équipement qui permet de projeter les films, il est soit :
  - numérique : lis les fichiers numériques.
  - argentique : lis les pellicules 35mm.


- **Film** : Le film en lui-même, possède un titre et une durée.


- **Support** : Sous quelle forme le cinema reçoit le film, 
  - numérique.
  - 35mm.


- **Billet** : Permet l'accès à une séance unique pour un film donné, a un tarif parmi :
  - Plein tarif.
  - Tarif étudiant.
  - Tarif enfant.


## Les comportements : 


- **Programmer une séance** : Programmer la projection d'un film dans une salle, a une heure donnée, avec un tarif donné.


- **Vendre un billet** : Vendre un billet pour une séance donnée.


- **Démarrer la séance** : Vérifier si la séance peut être lancée, notamment en vérifiant si la salle est libre, si c'est le bon projecteur, si la date n'est pas passée ou qu'il n'y a pas d'usure, et apres, on peut lancer la séance.


- **Finir la séance** : Fin de la séance, on lance le nettoyage.


- **Nettoyage** : On nettoie la salle, puis elle bascule en libre.


- **Places restantes** : Combien de place reste-t-il, nombre de places total moins nombre de billets vendu.


- **Taux de remplissage** : Quel est le taux de remplissage de la séance, billets vendus divisé par le nombre de places dans la salle.


- **Recette** : Combien d'argent a-t-on gagné sur la séance, cumule des billets


- **État de la salle** : La salle est-elle libre, en séance ou en nettoyage.


- **Salles libres** : Liste des salles libres.


- **Séances du jour** : Liste des séances prévue à une date donnée.


- **Recette du jour** : Combien d'argent a-t-on gagné sur l'ensemble des séances d'une journée, cumule des recettes de séance


- **Nombre de projections** : Combien de fois cette copie 35mm a-t-elle été projetée.

## Les états :


## Les règles :

- **Cycle des salles** : 
  - Une séance ne peut démarrer que lorsque la salle est libre. 
  - Durant la séance, la salle est en séance.
  - A la fin de la séance, la salle doit etre nétoyée. 
  - Apres nettoyage, elle redevient libre.


- **Compatibilité projecteur** :
  - Un projecteur numérique ne peut projeter qu'un film en fichier numérique.
  - Un projecteur argentique ne peut projeter qu'un film en copie 35 mm.


- **Validité de la clé numérique** : Un fichier numérique a une date de validité, si celle-ci 
est dépassée, le film ne peut pas être projeté.


- **Limite d'usure argentique** : Une copie 35mm a une limite de projection, au-delà de 50, elle devient inutilisable.


- **Limite vente de billet** : One ne peut pas vendre plus de billet qu'il n'y a de place dans la salle.