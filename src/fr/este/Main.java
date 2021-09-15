package fr.este;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int nb_eleve = Entree.entier("Nombre d'eleves ?");

        Eleve[] tabEmployes = new Eleve[nb_eleve];
        double tabmoyenne[] ;

        for (int i = 0; i < nb_eleve; i++)
        {
           String nom = Entree.chaine("Nom de l'eleve");
           double note_oral = Entree.reeldouble("Note orale ?");
           double note_ecrit = Entree.reeldouble("Note écrite ?");



            tabEmployes[i] = new Eleve(nom, note_oral, note_ecrit);

        }

        for (int i = 0; i < nb_eleve; i++)
        {

            tabEmployes[i].affich();
        }

    }
}
