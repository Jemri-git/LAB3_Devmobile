# LAB3_Devmobile
Une application Android native développée en **Java** permettant de saisir des informations utilisateur, de sélectionner une ville via un menu déroulant, et d'afficher un récapitulatif sur un second écran.

## 🚀 Fonctionnalités

* **Formulaire de saisie** : Nom, Email, Téléphone, et Adresse via des `EditText`.
* **Liste déroulante (Spinner)** : Sélection de la ville avec un composant `Spinner` dynamique.
* **Validation de données** : Vérification sommaire des champs obligatoires avant l'envoi.
* **Passage de données (Intents)** : Transfert sécurisé des informations entre `MainActivity` et `MainActivity2`.
* **Affichage sécurisé** : Utilisation d'une méthode utilitaire pour gérer les valeurs nulles ou vides avec un affichage propre (`—`).

## 🛠️ Technologies utilisées

* **Langage** : Java
* **IDE** : Android Studio
* **Composants UI** : 
    * `ScrollView` (pour la compatibilité avec les petits écrans)
    * `LinearLayout` (organisation verticale)
    * `Spinner` (liste déroulante)
    * `Intent` (navigation entre écrans)

## 📸 Aperçu de la structure

Le projet repose sur deux activités principales :

1.  **MainActivity** : Contient le formulaire et la logique de récupération des saisies.
2.  **MainActivity2** : Récupère les "Extras" de l'Intent et affiche le résumé des données.

## ⚙️ Installation

1.  Clonez ce dépôt ou téléchargez les fichiers sources.
2.  Ouvrez le projet dans **Android Studio**.
3.  Laissez Gradle synchroniser les dépendances.
4.  Lancez l'application sur un émulateur ou un appareil physique (API 21 minimum recommandé).

## 📝 Code remarquable

Voici la méthode utilitaire utilisée pour garantir un affichage propre sur l'écran récapitulatif :

```java
private String safe(String str) {
    return (str == null || str.trim().isEmpty()) ? "—" : str.trim();
}
```
<img width="400" height="500" alt="screen2_view" src="https://github.com/user-attachments/assets/65fdb129-c226-40a0-abca-0bec46b7193c" />

## 📸 Démonstration visuelle

L'application est divisée en deux étapes fluides pour garantir une expérience utilisateur simple et intuitive.
1. Écran de Saisie (MainActivity)
* C'est ici que l'utilisateur remplit ses informations.
<img width="400" height="500" alt="screen1" src="https://github.com/user-attachments/assets/e39ab1b0-6068-40a9-ac9f-ef083a9fd41d" />

* Validation des données : 
<img width="400" height="500" alt="screen1_case" src="https://github.com/user-attachments/assets/37259b6f-2781-458b-967d-aa2c0dc3ce7b" />

* Email invalide
<img width="400" height="500" alt="email_invalide" src="https://github.com/user-attachments/assets/97790ad9-b18c-466e-ad5b-064561bf00fa" />

2. Écran Récapitulatif (MainActivity2)
* Une fois les données validées, elles sont transmises via un Intent vers cet écran.
<img width="400" height="500" alt="screen2" src="https://github.com/user-attachments/assets/c4e5e377-934b-4009-bac9-9c1cc3da4cda" />

* Partager les informutions 
<img width="400" height="500" alt="partage" src="https://github.com/user-attachments/assets/abb5c247-ae16-44e7-8dbd-6a56e67554e8" />

<img width="400" height="500" alt="partage2" src="https://github.com/user-attachments/assets/8b143349-b1f7-42a2-bdaf-1665346ae981" />

## Une vidéo démonstarative est disponible dans la section `Démonstration`


