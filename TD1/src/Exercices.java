import java.util.ArrayList;

public class Exercices {

    public static void main(String[] args) {
        ex1(4);
        ex2(12.4, 9, 11.5);
        ex3(120, 11, 1.80);
        ex4();
        ex5(4);
        ex6(7);
        ex8();
        ex9(4);
    }

    //carré d'un nombre
    public static void ex1(int nb) {
        System.out.println(nb * nb);
    }

    //moyenne de 3 notes
    public static void ex2(double a, double b, double c) {
        System.out.println("moyenne = " + (a + b + c) / 3);
    }

    //prix du  carburant d'un voyage en fonction : de la distance, de la consommation au 100, prix du carburant au litre.
    public static void ex3(double dist, double consoVehicule, double prixAuLitre) {
        double prix = (dist * consoVehicule) / 100 * prixAuLitre;
        System.out.println("coup total d'essence = " + prix + "euro");
    }

    //affiche les nombres de 1 à 20
    public static void ex4() {
        ArrayList<Integer> nombres = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            nombres.add(i);
        }
        System.out.println(nombres);
    }

    //affiche les 10 nombres suivant celui passé en paramètre
    public static void ex5(int nombre) {
        ArrayList<Integer>nombres = new ArrayList<>();
        nombres.add(nombre);
        for (int i = 1; i <= 10; i++) {
           nombres.add(nombre+i);
        }
        System.out.println(nombres);
    }

    // affiche la table de multiplication du nombre passé en parametre
    public static void ex6(int nombre) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(nombre + "*" + i + " =" + nombre * i);
        }
    }

    public static void ex7() {

    }

    //affiche somme des nombres pairs <=100
    public static void ex8(){
        int somme = 0;
        for (int i = 1; i<=100; i++){
            if(i%2 == 0){
                somme+=i;
            }
        }
        System.out.println(somme + ".");
    }

    //affiche un triangle d'étoiles de la hauteur voulu.
    public static void ex9(int nbLines){
        for (int i = 1; i<=nbLines; i++){
            System.out.println("*");
        }
    }
}