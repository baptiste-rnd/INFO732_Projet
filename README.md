# README - Application Campus de Gestion de Groupes et Partage

## Présentation
Cette application est conçue pour faciliter la collaboration et la communication au sein de la communauté universitaire. Elle permet aux étudiants de partager des ressources, de participer à des groupes de travail et de publier des annonces, tout en utilisant des patrons de conception comme Singleton, Observateur et Façade pour assurer une architecture propre et évolutive.

## Fonctionnalités

### 1. **Classe `Campus` (Patron Façade)**
- **Description** : Centralise et gère toutes les classes (groupes, utilisateurs, annonces).
- **Fonctionnalités** : Contient tous les groupes, notamment le groupe général où tout le monde est automatiquement membre, et permet la suppression des annonces.

### 2. **Groupe Campus (Patron Singleton)**
- **Description** : Représente la communauté du campus.
- **Fonctionnalités** :
  - Tous les utilisateurs en sont membres par défaut.
  - Possibilité de poster des annonces visibles par toute la communauté.

### 3. **Groupe de Travail (Patron Observateur)**
- **Description** : Facilite le travail collaboratif avec des notifications et un chat intégré.
- **Fonctionnalités** :
  - Notifications pour chaque nouveau message.
  - Chat de groupe et possibilité de joindre des documents.
  - Gestion des membres par l'administrateur du groupe.

### 4. **Chat**
- **Description** : Outil de communication interne.
- **Fonctionnalités** :
  - Liste et affichage des messages.
  - Possibilité de modifier ou supprimer ses propres messages.

### 5. **Utilisateur**
- **Description** : Participe aux activités de l'application.
- **Fonctionnalités** :
  - Rejoindre et créer des groupes.
  - Créer, modifier et partager des documents.
  - Poster des messages dans le chat de groupe et gérer ses propres messages.

### 6. **Admin de Groupe (Hérite de Utilisateur)**
- **Description** : Gère et modère un groupe.
- **Fonctionnalités** :
  - Supprimer des messages/documents.
  - Gérer les membres (inviter/exclure).

### 7. **Documents**
- **Propriétés** : Titre, contenu, format, propriétaire unique, état de partage et liste des éditeurs autorisés.

### 8. **Annonces**
- **Propriétés** : Titre, contenu et créateur de l'annonce.

## Auteurs
Développé par :
- **Maxens Soldan** 
- **Baptiste Renand** 
- **Arno Wilhelm** 
- **Corentin Degouey** 
- **Thomas Bercier**

## Installation et Utilisation

1. **Cloner le dépôt** :
   ```bash
   git clone https://github.com/baptiste-rnd/INFO732_Projet.git
   cd INFO732_Projet
   ```

2. **Installer les dépendances** :
   ```bash
   npm install
   ```

3. **Lancer l'application** :
   ```bash
   npm start
   ```

4. **Accéder à l'application** :
   Ouvrez `http://localhost:3000` dans votre navigateur.

## Objectifs Futurs
- Développement d'une application mobile.
- Amélioration de la sécurité avec une authentification renforcée.
- Intégration d'une planification d'événements et d'autres fonctionnalités communautaires.
