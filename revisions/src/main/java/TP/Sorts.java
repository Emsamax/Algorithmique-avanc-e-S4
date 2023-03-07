package TP;

public class Sorts {

    public static void main(String[] args) {
        int []tab = {1, 2, 3};
        write(tab);

        System.out.println("======== Test Bubble sort========");
        int []tabTest1 = {6,8,46,9,7,4,2,7,1};
        write(tabTest1);
        bubbleSort(tabTest1);

        System.out.println("======== Test insertion sort========");
        int []tabTest2 = {6,8,46,9,7,4,2,7,1};
        write(tabTest2);
        bubbleSort(tabTest1);

    }

    public static int[] bubbleSort(int tab []){
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length-i-1; j++) {
                if(tab[j+1] < tab[j]){
                    //permutation
                    int temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                    write(tab);
                }

            }
        }
        return  tab;
    }

    /*public static int[] insertionSort(int []tab){
        for (int i = 0; i < tab.length; i++) {

            for (int j = 0; j < tab.length; j++) {

            }
        }
    }*/

    // n = numero de la case.
   /* public static int[] moveR(int []tab, int n)throws Exception{
        if(n > tab.length){
            throw new Exception("impossible n trop grand");
        }

    }*/

    public static void write(int tab[]){
        System.out.print("|");
        for (int i: tab) {
            System.out.print(i + "|");
        }
        System.out.println("");
    }
}
