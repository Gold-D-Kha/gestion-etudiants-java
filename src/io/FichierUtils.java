package io;


import models.Etudiant;
import java.io.*;
import java.util.*;

public class FichierUtils {
    public static void sauvegarder(String nomFichier, List<Etudiant> etudiants) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomFichier))) {
            writer.write("Nom,Âge,Moyenne\n");
            for (Etudiant e : etudiants) {
                writer.write(e.toCSV() + "\n");
            }
            System.out.println("✅ Données sauvegardées dans " + nomFichier);
        } catch (IOException e) {
            System.out.println("❌ Erreur : " + e.getMessage());
        }
    }
}

