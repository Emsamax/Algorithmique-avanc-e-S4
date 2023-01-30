package org.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("================ selectionSort ===========");
        int tab[] = {20, 6, 1, 3, 1, 7};
        selectionSort(tab);
        //insersionSort(tab);
        System.out.println("================ bubbleSort ===========");
        int tab3[] = {20, 6, 1, 3, 1, 7};
        bubbleSort(tab3);
    }

    public static void selectionSort(int tab[]) {
        // parcour du tableau 1 fois , permet de repeter les iterations autant de fois que de cases du tableu.
        for (int i = 0; i < tab.length; i++) {

            //tri d'une case par permutation avec le minimum.
            for (int j = i; j < tab.length; j++) {
                if (tab[j] <= tab[i]) {
                    int temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
                for (int ent : tab) {
                    System.out.print(ent + "|");
                }
                System.out.println("");
            }
        }
    }

    public static void insersionSort(int tab[]) {
        //parcour le tableau et sélectionne l’élément à insérer.
        for (int i = 0; i < tab.length; i++) {


        }
    }


    public static void bubbleSort(int tab[]) {
        for (int j = 0; j < tab.length; j++) {
            //parcour du tableau jusqu'a tab.lenght-j-1 pour eviter index out of bound + ne pas retrier les elements deja triés
            //car trie les elements de la droite vers la gauche(plus grand au plus petit).
            for (int i = 0; i < tab.length - j - 1; i++) {
                //couche de tri. met le plus grand élément de la liste à ca place.
                if (tab[i + 1] < tab[i]) {
                    //System.out.println(i +"  " + tab.length);
                    int temp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = temp;
                }


                for (int ent : tab) {
                    System.out.print(ent + "|");
                }
                System.out.println("");
            }
        }

    }

    //algorithme de tri par fusion fonction de fusion.
    public static ArrayList<Integer> fusionFusionSort(ArrayList<Integer> array1, ArrayList <Integer>array2) {
        return array1;
    }

    //algorithme de tri par fusion fonction de tri.
    // recursif.
    public static ArrayList<Integer> triFusionSort(ArrayList<Integer> tab) {
        if (tab.size() <= 1) {
            return tab;
        } else{
            //création des listes distincts
            ArrayList<Integer> array1 = new ArrayList<>();
            ArrayList<Integer> array2 = new ArrayList<>();
            for (int i = 0; i < tab.size(); i++) {
                if (i <= tab.size() / 2) {
                    array1.add(i);
                }else array2.add(i);

            }
            return fusionFusionSort(triFusionSort(array1), triFusionSort(array2));
        }



    }
}


