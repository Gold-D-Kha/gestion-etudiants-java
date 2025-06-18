package models;

public class Etudiant {
    private String nom;
    private int age;
    private double moyenne;

    public Etudiant(String nom, int age, double moyenne) {
        this.nom = nom;
        this.age = age;
        this.moyenne = moyenne;
    }

    public String getNom() { return nom; }
    public int getAge() { return age; }
    public double getMoyenne() { return moyenne; }

    public void setAge(int age) { this.age = age; }
    public void setMoyenne(double moyenne) { this.moyenne = moyenne; }

    public String toCSV() {
        return nom + "," + age + "," + moyenne;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                ", moyenne=" + moyenne +
                '}';
    }
}

