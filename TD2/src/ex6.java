public class ex6 {

    public static void main(String[] args) {
        System.out.println("=============1============");
        iterative1(4);
        System.out.println("\n===========2=============");
        iterative2(4);
        System.out.println("\n===========3=============");
        recursif1(4, 10);
        System.out.println("\n===========4=============");
        recursif2(4);
        System.out.println("\n===========5=============");
        recursif3(4);

    }

    public static void iterative1(int n) {
        while (n != 0) {
            System.out.print("*");
            n--;
        }
    }

    public static void iterative2(int n) {
        for (int i = 0; i < n; i++) {
            iterative1(n);
            System.out.println("");
        }
    }

    public static void afficheLine(int n){
        //affichage d'une ligne de longueur n;
        if(n == 1){
            System.out.print("*");
        }else{
            System.out.print("*");
            afficheLine(n-1);
        }
    }
    public static void recursif1(int h, int n) {
        if (h > 0) {
            afficheLine(n);
            System.out.println("");
            recursif1(h-1, n);
        }

    }

    public static void recursif2(int n){
        if(n > 0){
            afficheLine(n);
            System.out.println("");
            recursif2(n-1);
        }
    }

    public static void recursif3(int n){

        if(n > 0){
            afficheLine(n);
            System.out.println("");
            recursif3(n-1);
        }
    }
}
