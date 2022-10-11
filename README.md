# Kanban Java-Spring

Bravo ! Si tu es là, c'est que tu as retenu notre attention ! On aimerait maintenant voir comment cela se passe avec un exercice pratique.
Bonne chance !

## But de l'exercice

Implémenter une API HTTP qui permet de gérer un kanban : 

![Kanban image](kanban.jpg)

Pour résumer grossièrement, un kanban est une liste de tâches priorisées, avec différents statuts (Todo, In progress...). 
Si tu ne sais pas ce qu'est un kanban, n'hésite pas à demander des explications.

### Que dois-je faire concrètement ?
Rassure-toi tout de suite : le kanban ne sera pas fini en 1h :)   
Le but est donc d'identifier et d'implémenter les fonctionnalités que tu juges les plus importantes pour démarrer. 
Sachant que de nombreuses choses peuvent être imaginées : gérer les priorités, affecter un ou des membres à une tâche, changer le statut d'une tâche, mettre une étiquette, gérer les limites WIP...  

Pour t'aider un peu, voici les 2 premières choses à faire : 
- Faire fonctionner la récupération de la liste de tâches : elle doit être retournée via une requête HTTP GET sur http://localhost:8080/tasks. Il semble que l'implémentation n'ait pas été terminée !
- Ensuite, la première fonctionnalité sera d'ajouter une tâche dans la liste.

Produis le code comme si tu le faisais "en vrai", sauf qu'on se concentre sur le code métier : pas besoin de gérer les logs, base de données, sécurité...

### Que faire si j'ai oublié la syntaxe ?
Pour information, tu as le droit d'utiliser tous les outils que tu veux : Javadoc, Documentation en ligne, StackOverflow, Google... fais en bon usage.

## Prérequis
Java 11 et Maven.
