public class Main {

    public static void main(String[] args) {
        int tab[] = {20, 6, 1, 3, 1, 7};
        selectionSort(tab);
    }

    public static void selectionSort(int tab[]){
        // parcour du tableau 1 fois , permet de repeter les iterations autant de fois que de cases du tableu.
        for (int i = 0; i < tab.length; i++) {
            //tri d'une case par permutation avec le minimum.
            for (int j = i; j < tab.length; j++) {
                if (tab[j] < tab[i]){
                    int temp = tab[i];
                    tab[j] = tab[i];
                    tab[i] = temp;
                }
                System.out.println(tab);
            }
        }
    }

}