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


- Programmer une séance : 
- Vendre un billet :
- Démarrer la séance :
- Finir la séance :
- Nettoyage :
- Places restantes :
- Taux de remplissage :
- Recette :
- État de la salle :
- Salles libres :
- Séances du jour :
- Recette du jour :
- Nombre de projections :

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