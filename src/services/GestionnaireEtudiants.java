package services;

import models.Etudiant;
import java.util.ArrayList;
import java.util.Comparator;

import java.util.List;
import java.util.Scanner;

public class GestionnaireEtudiants {
    private List<Etudiant> liste = new ArrayList<>();

    public void ajouterEtudiant(Etudiant e) {
        liste.add(e);
        System.out.println("✅ Étudiant ajouté : " + e);
    }

    public void afficherTous() {
        if (liste.isEmpty()) {
            System.out.println("❌ Aucun étudiant à afficher.");
            return;
        }
        liste.forEach(System.out::println);
    }

    public void rechercherParNom(String nom) {
        boolean trouve = false;
        for (Etudiant e : liste) {
            if (e.getNom().equalsIgnoreCase(nom)) {
                System.out.println("🔍 Étudiant trouvé : " + e);
                trouve = true;
            }
        }
        if (!trouve) System.out.println("❌ Aucun étudiant trouvé.");
    }

    public void supprimerParNom(String nom) {
        boolean supprime = false;
        for (int i = liste.size() - 1; i >= 0; i--) {
            if (liste.get(i).getNom().equalsIgnoreCase(nom)) {
                liste.remove(i);
                supprime = true;
            }
        }
        System.out.println(supprime ? "🗑️ Étudiant(s) supprimé(s)." : "❌ Aucun étudiant trouvé à supprimer.");
    }

    public void afficherMoyenneGenerale() {
        if (liste.isEmpty()) {
            System.out.println("⚠️ Aucun étudiant enregistré.");
            return;
        }
        double somme = liste.stream().mapToDouble(Etudiant::getMoyenne).sum();
        System.out.printf("📊 Moyenne générale : %.2f\n", somme / liste.size());
    }

    public void trierParMoyenne() {
        liste.sort(Comparator.comparing(Etudiant::getMoyenne));
        afficherTous();
    }

    public void trierParAge() {
        liste.sort(Comparator.comparing(Etudiant::getAge));
        afficherTous();
    }

    public void modifierEtudiant(String nom, Scanner sc) {
        for (Etudiant e : liste) {
            if (e.getNom().equalsIgnoreCase(nom)) {
                System.out.print("🔁 Nouvel âge (laisser vide) : ");
                String age = sc.nextLine();
                if (!age.isEmpty()) e.setAge(Integer.parseInt(age));

                System.out.print("🔁 Nouvelle moyenne (laisser vide) : ");
                String moyenne = sc.nextLine();
                if (!moyenne.isEmpty()) e.setMoyenne(Double.parseDouble(moyenne));

                System.out.println("✅ Étudiant modifié : " + e);
                return;
            }
        }
        System.out.println("❌ Étudiant non trouvé.");
    }

    public List<Etudiant> getListe() {
        return liste;
    }
}