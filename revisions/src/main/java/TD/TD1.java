package TD;

import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;

public class TD1 {


    public static void main(String[] args) {

        System.out.println("=====TEST recursive1======");
        System.out.println(recursive1(2));
        System.out.println(recursive1(3));

        System.out.println("=====TEST recursive2======");
        System.out.println(recursive1(2));
        System.out.println(recursive1(3));

        System.out.println("=====TEST somme1======");
        System.out.println(somme1(2));
        System.out.println(somme1(3));

        System.out.println("=====TEST somme2======");
        System.out.println(somme2(2));
        System.out.println(somme2(3));

        System.out.println("=====TEST somme3======");
        System.out.println(somme3(2));
        System.out.println(somme3(3));

        System.out.println("=====TEST somme4======");
        System.out.println(somme4(2));
        System.out.println(somme4(3));

        System.out.println("=====TEST paire======");
        System.out.println(paire(2));
        System.out.println(paire(3));

        System.out.println("=====TEST impaire======");
        System.out.println(impaire(2));
        System.out.println(impaire(3));

        System.out.println("=====TEST paire2======");
        System.out.println(paire2(2));
        System.out.println(paire2(3));

        System.out.println("=====TEST impaire2======");
        System.out.println(impaire2(2));
        System.out.println(impaire2(3));

        System.out.println("=====TEST nbtrajets======");
        System.out.println(nbChemins(1, 1, 4));

        System.out.println("=====TEST afficheEtoilesIteratif======");
        afficheEtoilesIteratif(4);
        System.out.println("");

        System.out.println("=====TEST afficheEtoilesRecursif======");
        afficheEtoilesRecursif(4);
        System.out.println(" ");

        System.out.println("=====TEST afficheEtoilesIteratif2======");
        afficheEtoilesIteratif2(4);
        System.out.println(" ");

        System.out.println("=====TEST affEtoilesRectangleRecursif======");
        affEtoilesRectangleRecursif(5, 6);

        System.out.println("=====TEST affTriangleRecursif======");
        affTriangleRecursif(4);

        System.out.println("=====TEST affTriangleRecursif======");
        affTriangleRecursif2(4, 0);

    }

    //EX1
    public static int recursive1(int n) {
        if (n == 1) {
            return 1;
        } else return 3 * recursive1(n - 1) + 2;
    }

    public static int recursive2(int n) {
        if (n == 1) return 1;
        else if (n == 2) return 2;
        else return 2 * recursive2(n - 1) - recursive2(n - 2);
    }


    //EX2

    public static double somme1(int n) {
        return ((Math.pow(n, 2) * Math.pow(n + 1, 2)) / 4);
    }

    public static int somme2(int n) {
        int somme = 0;
        for (int i = 1; i <= n; i++) {
            somme += Math.pow(i, 3);
        }
        return somme;
    }

    public static double somme3(int n) {
        if (n == 1) return 1;
        else return Math.pow(n, 3) + somme3(n - 1);
    }

    public static double somme4(int n) {
        return Math.pow(SE(n), 2);
    }

    public static int SE(int n) {
        if (n == 1) return 1;
        else return n + SE(n - 1);
    }

    //EX3

    public static boolean paire(int n) {
        if (n == 0) return true;
        else if (n == 1) return false;
        else return paire(n - 2);
    }

    public static boolean impaire(int n) {
        if (n == 0) return false;
        else if (n == 1) return true;
        else return impaire(n - 2);
    }

    public static boolean paire2(int n) {
        if (n == 0) return true;
        else return impaire2(n - 1);
    }

    public static boolean impaire2(int n) {
        if (n == 0) return false;
        else if (n == 1) return true;
        else return paire2(n - 1);
    }

    //EX5

    // i = nb de colonnes
    //j = nb de lignes
    //n =taille du tableau carré
    public static int nbChemins(int i, int j, int n) {
        if (i == n && j == n) return 1;
        else if (j == n && i < n) {
            return nbChemins(i - 1, j, n);
        } else if (j < n && i == n) return nbChemins(i, j + 1, n);
        return -1;
    }

    //EX6

    public static void afficheEtoilesIteratif(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public static void afficheEtoilesRecursif(int n) {
        if (n == 1) {
            System.out.print("*");
        } else {
            System.out.print("*");
            afficheEtoilesRecursif(n - 1);
        }
    }

    public static void afficheEtoilesIteratif2(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(" ");
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
        }
    }

    //h = hauteur n = longueur
    public static void affEtoilesRectangleRecursif(int n, int h) {
        if (h > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
            affEtoilesRectangleRecursif(n, h - 1);
        }
    }

    public static void affTriangleRecursif(int n) {
        if (n == 1) System.out.print("*");
        else {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
            affTriangleRecursif(n - 1);
        }
    }

    public static void affTriangleRecursif2(int n, int i) {

    }
}

