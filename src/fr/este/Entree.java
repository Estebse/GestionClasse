package fr.este;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Entree {
    static BufferedReader rep = new BufferedReader(new InputStreamReader(System.in));

    public static int entier(String msg) {
        System.out.println(msg);
        try {
            int valeur = Integer.parseInt(rep.readLine());
            return valeur;
        } catch (NumberFormatException | IOException e) {
            return Entree.entier("Zone absente ou type incorrect, essayez a nouveau");

        }
    }

    public static char caractere(String msg) {
        System.out.println(msg);
        try {
            String valeur = rep.readLine();
            char car = valeur.charAt(0);
            return car;
        } catch (StringIndexOutOfBoundsException | IOException e) {
            return Entree.caractere("Zone absente ou type incorrect, essayez a nouveau");

        }
    }

    public static float flottant(String msg) {
        System.out.println(msg);
        try {
            float valeur = Float.parseFloat(rep.readLine());
            return valeur;
        } catch (NumberFormatException | IOException e) {
            return Entree.flottant("Zone absente ou type incorrect, essayez a nouveau");
        }
    }

    public static double reeldouble(String msg) {
        System.out.println(msg);
        try {
            double valeur = Double.parseDouble(rep.readLine());
            return valeur;
        } catch (NumberFormatException | IOException e) {
            return Entree.reeldouble("Zone absente ou type incorrect, essayez a nouveau");

        }
    }

    public static String chaine(String msg) {
        try {
            System.out.println(msg);
            String valeur = rep.readLine();
            return valeur;
        } catch (NumberFormatException | IOException e) {
            return Entree.chaine("Zone absente ou type incorrect, essayez a nouveau");

        }
    }

}
