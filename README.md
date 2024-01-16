# MODULE JAVA <br>INTRODUCTION

## Modalités :
- Toute cette partie est à réaliser en solo
- La durée estimée de cette partie est de 2 jours environ

## Objectifs :
Mise en place de l’environnement de développement et passage en revue de la syntaxe
Java de base :
- Types et portées des variables
- Boucles
- Conditions

### 0 – INTRODUCTION
Java est un langage de programmation généraliste orienté objet. Nous n’allons pas
copier Wikipedia ici (voir Java (langage) — Wikipédia ) mais relever un point important,
Java est un langage **statiquement typé et compilé** :

- les variables sont définies avec un type de données (une variable “String” ne
pourra contenir que des valeurs de type "String")
- les fichiers sources devront être compilés (sorte de traduction) en fichiers
“classes” avant d’être exécutés
Cela oblige à bien définir les types des variables et à subir l’étape supplémentaire de
compilation mais apporte plusieurs avantages :
- certaines erreurs sont détectées lors de la compilation et non lors de l’exécution
(le code est plus “sûr”)
- des optimisations plus poussées peuvent être mises en œuvre
- les classes générées sont indépendantes du système.
Cette manière d’opérer s’oppose aux langages dits “interprétés” comme par exemple
JavaScript le code est alors “lu” au fur et à mesure des besoins.

### 1 – INSTALLATION DE L’ENVIRONNEMENT DE DÉVELOPPEMENT
Pour pouvoir utiliser le langage Java (exécuter des programmes Java), il faut avoir
installé l’environnement d’exécution.

Cet environnement apporte la “machine virtuelle” (le programme qui exécute le code
compilé), mais aussi les librairies de base (afficher un texte à l’écran, ouvrir un fichier,
...).

Le JRE (Java Runtime Environment) suffit pour exécuter les programmes Java mais
dans notre cas, comme nous allons également créer des programmes en Java. Nous
aurons donc besoin du JDK (Java Development Kit).

Fort heureusement, vous pouvez tout configurer directement depuis l’éditeur que nous
utiliserons : **IntelliJ**.

Installez IntelliJ et [créez votre premier projet](https://www.jetbrains.com/help/idea/getting-started.html).

**Ressource** : [différence entre la JVM, le JRE et le JDK](https://www.lemondeinformatique.fr/actualites/lire-jvm-jdk-jre-quelle-difference-74633.html)

### 2 – Exercices d’introduction
Nous allons maintenant nous exercer un peu avec Java avec quelques jeux
d’algorithmique pour nous mettre en jambe.

N’oubliez pas d’aller farfouiller dans les ressources disponibles sur internet pour
trouver les fonctions nécessaires à la résolution des exercices.

**Quelques ressources en vrac :**
- https://www.w3schools.com/java/
- https://www.javatpoint.com/java-tutorial

**Conseils importants :**
- Gardez une trace de chacun des exercices.
- Faîtes un mémo des syntaxes utilisées (vous pouvez penser à des solutions
comme [notion](https://www.notion.so/fr-fr) par exemple).

#### 2A – Boucles, conditions et fonctions

##### Exercice 1 – Suites de nombres simples

1. Écrire un programme, en utilisant une boucle **while**, qui affiche tous les
   nombres de 1 à 100.
2. Ré-écrivez le programme précédent avec une boucle **for**.
3. Écrire un programme n’affichant que les nombres pairs entre 0 et 100 (0, 2, 4,
   6, ...).
4. Réécrire (si vous ne l’avez pas fait) les 3 programmes précédents sous forme
   de fonctions :
 - Ces fonctions s’appelleront `enumerate_while`, `enumerate_for` et
   `enumerate_even`.
 - Chacune de ces fonctions prend en paramètre un entier qui sera le
   nombre maximal à afficher.
 - Ces fonctions n’ont pas de valeur de retour, elles affichent directement
 en console.

**Ressource :**
- Modulo→https://www.geeksforgeeks.org/modulo-or-remainder-operator-in-java/
- Comment utiliser le modulo :
https://marcarea.com/weblog/2018/12/31/loperateur-modulo#en_informatique

##### Exercice 2 – Suites de nombres
1. Écrire un programme qui prend un nombre entier en paramètre et retourne le plus
   petit carré supérieur à n.

    Exemple 1 :
    `Paramètre d’entrée : n = 63
    Résultat : 64 (car 36 = 8 x 8)`

    Exemple 2 :
    `Paramètre d’entrée : n = 30
    Résultat : 36 (car 36 = 6 x 6)`


2. Écrire un programme qui prend un nombre entier en paramètre et retourne le plus
   grand carré inférieur à n.

    Exemple 1 :
    `Paramètre d’entrée : n = 30
    Résultat : 25 (car 25 = 5x5)`

    Exemple 2 :
    `Paramètre d’entrée : n = 63
    Résultat : 49 (car 49 = 7 x 7)`

##### Exercice 3 – Suite de Fibonacci

**Définition**
- La suite de Fibonacci est une suite de nombres entiers.
- Chaque terme est la somme des deux entiers précédents.
- Les premiers termes (dits termes “d’initialisation”) sont 0 et 1.
- Les dix premiers termes qui la composent sont donc : 0, 1, 1, 2, 3, 5, 8, 13, 21
et 34. Les nombres en bleu correspondent aux termes d’initialisation.

**Pourquoi cette suite est-elle aussi célèbre ?**

Cette suite nombre peut se représenter visuellement (figure de gauche), et il se
trouve que cette forme géométrique se retrouve très régulièrement dans la nature :

La proportion créée par cette suite est appelée [Nombre d’or](https://fr.wikipedia.org/wiki/Nombre_d%27or) et se note φ (phi). Elle est
connue aussi sous le nom de **section dorée** ou **proportion divine**.
Sa valeur exacte vaut :

`1 + √5 / 2`

Cette valeur compliquée (on dit qu’elle est irrationnelle) vaut environ 1.618033...
Cette valeur est approximée par le rapport entre un nombre de la suite et le précédent

**Exemple:**

En utilisant les 10 premiers nombres de la suite (0, 1, 1, 2, 3, 5, 8, 13, 21). On a donc
plusieurs approximations de plus en plus fines :

- 1 ÷ 1 = 1
- 2 ÷ 1 = 2
- 3 ÷ 2 = 1. 5
- 5 ÷ 3 = 1, 66
- 8 ÷ 5 = 1. 6
- 13 ÷ 8 = 1. 625

**To do :**

1. Écrire une fonction que vous appellerez **fibo**
   - Cette fonction prend en paramètre d’entrée un entier qui correspond au nombre
   d’entiers à afficher.
   - La fonction retourne les nombres de Fibonacci rangés dans un tableau un
   tableau d’entiers.
2. Ecrire une fonction **approximation_fibo** :
   - Cette fonction prend en paramètre d’entrée un nombre flottant epsilon qui
   correspond à l’erreur d’approximation maximale autorisée.
   - La fonction retourne les deux derniers entiers de la suite de Fibonacci **(a et b)**
   qui respectent
   a / b ≤ epsilon

**Exemple:**

Pour **epsilon** = 0.01

Le retour de la fonction est :

- **{13, 8}**
- **car 13/8** = 1,625
- et 1.625 - 1,618033... < epsilon

**Ressources :**
- [Java Math](https://www.w3schools.com/java/java_math.asp) (square root = racine carrée !)

#### 2B – Traitement de chaînes de caractères

##### Exercice 4 – Introduction

1. Écrire une fonction **describe** qui parcourt un [ArrayList](https://www.w3schools.com/java/java_arraylist.asp) contenant des
   prénoms et qui affiche chacun des prénoms avec le nombre de lettres le
   composant.

   **Exemple:**

   ArrayList à analyser : [ “Jean”, “Ahmed”, “Lea”, “Blanca”]

   Résultat en console :

   Jean : 4

   Ahmed : 5

   Lea : 3

   Blanca : 6

**Ressource** : https://www.w3schools.com/java/java_ref_string.asp

2. Réécrire la fonction précédente en utilisant une boucle [for-each](https://www.w3schools.com/java/java_foreach_loop.asp).
3. Écrire une fonction **describe** qui parcourt un [ArrayList](https://www.w3schools.com/java/java_arraylist.asp) contenant des
   prénoms et qui n’affiche que ceux dont la longueur est supérieure ou égale à 4.
4. Écrire une fonction **to_upper_case** qui parcourt un tableau contenant des
   prénoms et qui affiche chacun des prénoms en majuscule.

##### Exercice 5

Vous tombez sur un parchemin en se baladant dans les couloirs du Campus Numérique.

Un message est écrit :

`000T000000000000000000000000000000o0000u00000000000j0o0000000u0000000000r00s0000
c00o0000d00000e000000000000r000000000000000000
00000c0000000000o000m00000000000000m0e000 000000000s00i0000000000 0l000e00000000
g000000000000a00000000000000000r0s0000
000000000000000000000000000q00000u0000000000000000000000000i00000000
000f000i0ni00000r0000000a 000p00000a00000r0000000000000000000000000000000m00000000000000a000in0t000000e00n000000000i00r0000000000000000
00000000000v00000000000o0000000t00r0000000e000000000 0c000o00d000000000e000000000
00e0000000000000000000000000000000000s0t0000000000000000000 0000000000000u0n00000
0000000000000000000000000000000ps00000000y000000000000000000c0h0000000op00000a0t000
0h0e0
000000000000000v00000000000i00000000000000000000000000000000000000o0000l0000en00t
0000000q0u000000000i 00000000sa00000it00000 000où0000000000
000000v0000000o0000000000u000000000000000s000000000000000000
00000v00000000000000i00000000v0000000000000000000000000000e0000000000z0000000
00(000000c0i0000000000000000000ta0ti0o00000000n 000000d000000000000000000e00
00J000o00000000000000h0n00 0W00o000000000000o00000000000d0000000s0000000000)0.`

Ce message est chiffré. Pour le lire, implémenter une méthode decrypt qui prendra en
paramètre cette chaîne de caractères et retournera un String contenant le message
déchiffré.

**To do :**

- Déchiffrer le message.

**Indice :**
- Il semble suffisant d’enlever tous les caractères “ 0 “ (zéro) du message chiffré
pour pouvoir le lire.

**Ressource :**
- Méthodes de la classe String : [W3School](https://www.w3schools.com/java/java_ref_string.asp)