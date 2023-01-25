public class ex1 {

    public static void main(String[] args) {

    }

    //ex1 récursif
    //U0 = 1;
    //Un = 3*Un-1 +2;
    public static double Un(int n) {
        if (n == 0) return 1;
        else return 3 * Un(n - 1) + 2;
    }

    //ex1 en itératif (avec boucles).
    public static double UnIteratif(int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            res = 3 * res + 2;
        }
        return res;
    }

    //ex2
    //V1 = 1, V2 = 2.
    //Vn =2*Vn-1 - Vn-2 pour tout n>2
    public static double Vn(int n) {
        if (n == 1) return 1;
        else if (n == 2) return 2;
        else {
            return 2 * Vn(n - 1) - Vn(n - 2);
        }
    }

    //ex2 itératif
    public static double VnIteratif(int n) {
        if (n == 1) return 1;
        else if (n == 2) return 2;
        else {
            int res = 0;
            int v1 = 1;
            int v2 = 2;
            for (int i = 3; i <= n; i++) {
                res = 2 * v1 - v2;
                v2 = res;
                v1 = v2;
            }
            return res;
        }
    }

}
