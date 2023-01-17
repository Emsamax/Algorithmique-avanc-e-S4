public class ex4 {

    public static void main(String[] args) {
        System.out.println(pair(4));
        System.out.println(pair(5));
        System.out.println(impaire(4));
        System.out.println(impaire(5));
    }

    public static boolean pair(int n){

        if(n == 0)  return true;
        else if(n==1)return false;
        else{
            return pair(n-2);
        }
    }

    public static boolean impaire(int n){

        if(n == 0)  return false;
        else if(n==1)return true;
        else{
            return impaire(n-2);
        }
    }

    public static boolean paire2(int n){
        if(n == 0);
        return true;
    }
}
