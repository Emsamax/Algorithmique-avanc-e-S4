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
        for (int entier : tabTest) {
            System.out.print(entier + "|");
        }
        System.out.println();

        System.out.println("==================== test findTab ===========");
        int tabTest2[] = {1, 2, 3, 4, 5};
        System.out.println(findInTab(tabTest2, 3));
/*
        System.out.println("==================== test insertListe ===========");
        int tabTest3[] = {1, 2, 3, 4, 5};
        System.out.println("avant");
        for (int entier : tabTest3) {
            System.out.print(entier + "|");
        }
        System.out.println("apres");
        insertList(tabTest3, 0, findInTab(tabTest3, 0));
        for (int entier : tabTest3) {
            System.out.print(entier + "|");
        }
        System.out.println("");
*/
        System.out.println("==================== test decalDroite ===========");
        int[] tabTest4 = {7, 2, 10, 9, 5};
        for (int entier : tabTest4) {
            System.out.print(entier + "|");
        }
        System.out.println("\n==========");

        decaleDroite(tabTest4, 0, 4);
        for (int entier : tabTest4) {
            System.out.print(entier + "|");
        }
        System.out.println();

        System.out.println("==================== test fastSort(seulement pour pivot) ===========");
        int[] tabTest5 = {7, 2, 10, 9, 5};
        for (int entier : tabTest5) {
            System.out.print(entier + "|");
        }
        System.out.println("\n==========");

        fastSort(tabTest5);
        for (int entier : tabTest5) {
            System.out.print(entier + "|");
        }

        System.out.println("\n==================== test fastSort(algo entier) ===========");
        int[] tabTest6 = {7, 2, 10, 9, 5};
        for (int entier : tabTest6) {
            System.out.print(entier + "|");
        }
        System.out.println("\n==========");

        recursiveFastSort(fastSort(tabTest6));
        for (int entier : tabTest6) {
            System.out.print(entier + "|");
        }
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
    public static int[] insertBlanc(int[] tab, int i) {
        tab[i] = 0;
        for (int j = tab.length; j < tab.length - i; j--) {
            tab[j] = tab[j - 1];
        }
        return tab;
    }

    //insert un element voulu dans le tableau avec appel de insersionBlanc.
    public static int[] insertList(int[] tab, int element, int n) {
        insertBlanc(tab, n);
        tab[n] = element;
        return tab;
    }

    public static int findInTab(int tab[], int n) throws Exception {
        //parcour le tableau et sélectionne la case ou inserer l'element.
        // on part du principe que le tableau en parametre est trié.
        int i = 1;
        while (n < tab[i]) {
            i++;
        }
        return i;
    }

    public static int[] insertionSort(int[] tab) throws Exception {
        int result[] = new int[tab.length];
        result[0] = tab[0];
        for (int i = 1; i < tab.length; i++) {
            insertList(result, tab[i], findInTab(result, tab[i]));

            //ecriture du tableau a chaque iteration;
            for (int entier : result) {
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
    public static ArrayList<Integer> fusionFusionSort(ArrayList<Integer> array1, ArrayList<Integer> array2) {
        return array1;
    }

    //algorithme de tri par fusion fonction de tri.
    // recursif.
    public static ArrayList<Integer> triFusionSort(ArrayList<Integer> tab) {
        if (tab.size() <= 1) {
            return tab;
        } else {
            //création des listes distincts
            ArrayList<Integer> array1 = new ArrayList<>();
            ArrayList<Integer> array2 = new ArrayList<>();
            for (int i = 0; i < tab.size(); i++) {
                if (i <= tab.size() / 2) {
                    array1.add(i);
                } else array2.add(i);

            }
            return fusionFusionSort(triFusionSort(array1), triFusionSort(array2));
        }
    }

    public static int[] fastSort(int[] tab) {
        //le pivoit ne doit pas etre en doublon ?
        //on désigne le 1er element de la liste comme pivot.
        //pour tout elements : plus grand que le pivot bouge pas, plus petit va a gauche du pivot.
        int posPivot = 0;
        int pivot = tab[posPivot];
        //parcour du tableau une fois.
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < pivot) {
                decaleDroite(tab, posPivot, i);
                posPivot++;
            }

        }
        return tab;
    }

    //décale les elements d'un tableau vers la droite, commence depuis la position pivot et met l'element n derriere le pivot.
    public static int[] decaleDroite(int[] tab, int posPivot, int posN) {
        int temp = tab[posN];
        for (int i = posN; i > posPivot; i--) {
            tab[i] = tab[i - 1];
        }
        tab[posPivot] = temp;

        return tab;
    }

    //divise le tableau en 2 pus petit tableaux pour trier récursivement.
    public static int[] recursiveFastSort(int[] tab) {
        if (tab.length == 1) {
            return tab;
        } else if (tab.length == 2) {
            if (tab[0] > tab[1]) {
                int temp = tab[1];
                tab[1] = tab[0];
                tab[0] = temp;
            }
            return tab;

        } else {
            //utilisation des arrayList car on ne connait pas la taille du tableau.
            ArrayList<Integer> childArray1 = new ArrayList<>();
            ArrayList<Integer> childArray2 = new ArrayList<>();
            for (int i = 0; i < tab.length; i++) {
                if(i < tab.length/2){
                    //ajout de l'element du tableau dans la liste correspondante;
                   childArray1.add(tab[i]);
                } else childArray2.add(tab[i]);
            }
            int[] childTab1 = convertArrayToTab(childArray1);
            int[] childTab2 = convertArrayToTab(childArray2);
            return recursiveFastSort(childTab1);// recursiveFastSort(childTab2);
        }
    }

    //converti une arrayList<Integer> en tableau.
    public static int[] convertArrayToTab(ArrayList<Integer> array){
        int[] tab = new int[array.size()];
        for(int i = 0; i< array.size(); i++){
            tab[i] = array.get(i);
        }
        return tab;
    }
}
