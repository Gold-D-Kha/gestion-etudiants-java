package main;

import java.util.Scanner;
import services.GestionnaireEtudiants;
import utils.MenuUtils;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestionnaireEtudiants gestionnaire = new GestionnaireEtudiants();

        int choix;
        do {
            MenuUtils.afficherMenu();
            try {
                choix = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                choix = -1;
            }
            MenuUtils.gererChoix(choix, sc, gestionnaire);
        } while (choix != 0);
        sc.close();
    }
}
