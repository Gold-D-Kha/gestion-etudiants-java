package utils;


import java.util.Scanner;

public class ValidationUtils {
    public static String demanderNomValide(Scanner sc) {
        String nom;
        do {
            System.out.print("👤 Nom : ");
            nom = sc.nextLine();
        } while (nom.trim().isEmpty());
        return nom;
    }

    public static int demanderAgeValide(Scanner sc) {
        int age = -1;
        do {
            try {
                System.out.print("🎂 Âge : ");
                age = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("❌ Entrée invalide.");
            }
        } while (age <= 0 || age > 120);
        return age;
    }

    public static double demanderMoyenneValide(Scanner sc) {
        double moyenne = -1;
        do {
            try {
                System.out.print("📊 Moyenne : ");
                moyenne = Double.parseDouble(sc.nextLine());
            } catch (Exception e) {
                System.out.println("❌ Entrée invalide.");
            }
        } while (moyenne < 0 || moyenne > 20);
        return moyenne;
    }
}