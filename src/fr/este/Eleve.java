package fr.este;

public class Eleve {

    private String nom;
    private double note_oral, note_ecrit;

    public Eleve(String nom, double note_oral, double note_ecrit) {
        this.nom = nom;
        this.note_oral = note_oral;
        this.note_ecrit = note_ecrit;
    }


    private double moyenne_eleve() {
        return (2 * note_ecrit + note_oral) / 3;
    }

    private void meilleur(double moyenne[], int nb_eleve, String nom[]) {

        double moyenneHaute = 0d;
        double moyenneElv = 0d;
        String nomElv = "";


        for (int i = 0; i < nb_eleve; i++) {
            double elv_pre = moyenne[i - 1];
            double elv = moyenne[i];
            if (elv_pre < elv) {
                moyenneHaute = moyenne[i];
            }

        }
        System.out.println("Nom : " + nomElv);
        System.out.println("Moyenne : " + moyenneElv);
    }

    public void affich() {
        System.out.println("Nom : " + nom);
        System.out.println("Moyenne : " + moyenne_eleve());
    }

}
