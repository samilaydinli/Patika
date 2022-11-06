package Giris;
//www.patika.dev
public class Fibonacci {
    public static void main(String[] args) {

        fibonacci(2);

    }

    static void fibonacci(int n){
        int x1=0, x2=1, x3;
        for(int i=2; i<=n; i++){
            x3 = x2 + x1;
            System.out.println(x1 + " + " + x2 + " + " + " = " + x3);
            x1 = x2;
            x2 = x3;
            System.out.println();
        }
    }
}
