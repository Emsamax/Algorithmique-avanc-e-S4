public class ex2 {

    public static void main(String[] args) {

    }

    public static double sc1(int n) {
        return (Math.pow(n, 2) * Math.pow(n + 1, 2)) / 4;
    }

    public static double sc2(int n) {
        double res = 1;
        for (int i = 1; i <= n; i++) {
            res = res + Math.pow(i, 3);
        }
        return res;
    }

    public static double sc3(int n) {
        if (n == 1) return 1;
        else {
            return (Math.pow(n, 3) + sc3(n - 1));
        }
    }

    public static double sc4(int n) {
        return Math.pow(SE(n), 2);
    }

    public static double SE(int n) {
        if (n == 1) return 1;
        else {
            return n + SE(n - 1);
        }
    }
}
