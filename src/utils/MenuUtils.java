package utils;

import services.GestionnaireEtudiants;
import utils.ValidationUtils;
import java.util.Scanner;

public class MenuUtils {
    public static void afficherMenu() {
        System.out.println("\n🎓 MENU");
        System.out.println("1. Ajouter un étudiant");
        System.out.println("2. Afficher tous les étudiants");
        System.out.println("3. Rechercher un étudiant");
        System.out.println("4. Supprimer un étudiant");
        System.out.println("5. Moyenne générale");
        System.out.println("6. Trier par moyenne");
        System.out.println("7. Trier par âge");
        System.out.println("8. Sauvegarder fichier");
        System.out.println("9. Modifier étudiant");
        System.out.println("0. Quitter");
        System.out.print("👉 Choix : ");
    }

    public static void gererChoix(int choix, Scanner sc, GestionnaireEtudiants gestionnaire) {
        switch (choix) {
            case 1 -> gestionnaire.ajouterEtudiant(
                    new models.Etudiant(
                            ValidationUtils.demanderNomValide(sc),
                            ValidationUtils.demanderAgeValide(sc),
                            ValidationUtils.demanderMoyenneValide(sc)));
            case 2 -> gestionnaire.afficherTous();
            case 3 -> {
                System.out.print("🔎 Nom : ");
                gestionnaire.rechercherParNom(sc.nextLine());
            }
            case 4 -> {
                System.out.print("🗑️ Nom : ");
                gestionnaire.supprimerParNom(sc.nextLine());
            }
            case 5 -> gestionnaire.afficherMoyenneGenerale();
            case 6 -> gestionnaire.trierParMoyenne();
            case 7 -> gestionnaire.trierParAge();
            case 8 -> {
                System.out.print("📁 Nom du fichier : ");
                io.FichierUtils.sauvegarder(sc.nextLine(), gestionnaire.getListe());
            }
            case 9 -> {
                System.out.print("✏️ Nom de l'étudiant : ");
                gestionnaire.modifierEtudiant(sc.nextLine(), sc);
            }
            case 0 -> System.out.println("👋 Fin du programme");
            default -> System.out.println("❌ Choix invalide");
        }
    }
}