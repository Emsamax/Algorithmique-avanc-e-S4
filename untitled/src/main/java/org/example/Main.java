package org.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("================ selectionSort ===========");
        int tab[] = {20, 6, 1, 3, 1, 7};
        selectionSort(tab);
        System.out.println("================ insertionSort ===========");
        int tab2[] = {20, 6, 1, 3, 1, 7};
        insertionSort(tab2);
        System.out.println("================ bubbleSort ===========");
        int tab3[] = {20, 6, 1, 3, 1, 7};
        bubbleSort(tab3);

        System.out.println("==================== test insertBlanc ===========");
        int tabTest[] = {1, 2, 3, 4, 5};
        insertBlanc(tabTest, 3);
        for (int entier : tabTest){
            System.out.print(entier + "|");
        }
        System.out.println();

        System.out.println("==================== test findTab ===========");
        int tabTest2[] = {1, 2, 3, 4, 5};
        System.out.println(findInTab(tabTest2, 3));

        System.out.println("==================== test insertListe ===========");
        int tabTest3[] = {1, 2, 3, 4, 5};
        System.out.println("avant");
        for (int entier : tabTest3){
            System.out.print(entier + "|");
        }
        System.out.println("apres");
        insertList(tabTest3, 0, findInTab(tabTest3, 0));
        for (int entier : tabTest3){
            System.out.print(entier + "|");
        }
        System.out.println();

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

    //crée une case vide à l'indice voulu et décale toutes les cases suivantes vers la droite.
    public static int[] insertBlanc(int[] tab, int i){
        tab[i] = 0;
        for (int j = tab.length; j < tab.length-i; j--) {
            tab[j] = tab[j-1];
        }
        return tab;
    }

    //insert un element voulu dans le tableau avec appel de insersionBlanc.
    public static int[] insertList(int[] tab, int element, int n){
        insertBlanc(tab, n);
        tab[n] = element;
        return tab;
    }

    public static int findInTab(int tab[], int n ) throws Exception {
        //parcour le tableau et sélectionne la case ou inserer l'element.
        // on part du principe que le tableau en parametre est trié.
        int i = 0;
       while(n < tab[i]){
           i++;
       }return i;
    }

    public static int[] insertionSort(int []tab) throws Exception {
         int result[]= new int[tab.length];
         result[0] = tab[0];
        for (int i = 1; i < tab.length; i++) {
            insertList(result, tab[i],  findInTab(result, tab[i]));

            //ecriture du tableau a chaque iteration;
            for (int entier : result){
                System.out.print(entier + "|");
            }
            System.out.println("");
        }
        return result;
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


