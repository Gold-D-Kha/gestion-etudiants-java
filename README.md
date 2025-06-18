
# 🎓 Application Java – Gestion des Étudiants

Une application console Java permettant de gérer une liste d'étudiants avec les fonctionnalités suivantes : ajout, suppression, recherche, tri, sauvegarde dans un fichier CSV, et plus encore.

---

## 🗂️ Fonctionnalités

- Ajouter un étudiant avec validation
- Afficher tous les étudiants
- Rechercher un étudiant par nom
- Supprimer un étudiant
- Calculer la moyenne générale de la classe
- Trier les étudiants par moyenne ou par âge
- Modifier les informations d’un étudiant
- Sauvegarder la liste dans un fichier CSV
- Charger les étudiants depuis un fichier CSV

---

## 🔧 Architecture du Projet

```
src/
├── main/
│   └── Main.java
├── models/
│   └── Etudiant.java
├── services/
│   └── GestionnaireEtudiants.java
├── utils/
│   ├── MenuUtils.java
│   └── ValidationUtils.java
├── io/
│   └── FichierUtils.java
```

---

## ✅ Technologies utilisées

- Java Standard Edition (Java SE)
- Java I/O (BufferedReader, BufferedWriter)
- Collections (ArrayList, List)
- Structuration en packages

---

## ▶️ Lancer le projet

### 1. Compiler

Depuis le dossier `src` :

```bash
javac main/Main.java
```

### 2. Exécuter

```bash
java main.Main
```

---

## 💾 Format de fichier CSV attendu

```csv
Nom,Âge,Moyenne
Sarah,22,15.5
Yassine,23,17.2
```

---

## 📚 Aide et Navigation

- Menu interactif dans le terminal
- Validations automatiques sur les champs (âge, moyenne, etc.)
- Système simple, modulaire, évolutif

---

## 📈 Améliorations possibles

- Interface graphique avec JavaFX ou Swing
- Persistance via base de données (JDBC, SQLite, etc.)
- Export PDF / impression
- API REST avec Spring Boot

---

## 👨‍💻 Auteur

Khalil M. – Développeur Java passionné

---

## 📄 Licence

Ce projet est open source et libre d’utilisation à des fins éducatives.
