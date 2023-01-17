public class ex3 {
    public static void main(String[] args) {

    }

    public static double newton(int i, int j) {
        if (j >= 1 && (i == 0 || i == j)) {
            return 1;
        } else {
            if (i > 0 && j > i) {
                return newton(i, j - 1) + newton(i - 1, j - 1);
            } else return 0;
        }

    }

}
