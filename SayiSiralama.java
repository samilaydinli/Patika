package Giris;
//www.patika.dev
import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {

        int a, b, c;

        Scanner number = new Scanner(System.in);

        System.out.print("a = ");
        a = number.nextInt();

        System.out.print("b = ");
        b = number.nextInt();

        System.out.print("c = ");
        c = number.nextInt();

        if((a > b) && (a > c)){
            if (b > c){
                System.out.println("a > b > c");
            }else {
                System.out.println("a > c > b");
            }
        } else if ((b > a) && (b > c)) {
            if(a > c){
                System.out.println("b > a > c");
            }else {
                System.out.println("b > c > a");
            }
        }else {
            if(a > b){
                System.out.println("c > a > b");
            }else {
                System.out.println("c > b > a");
            }
        }
    }
}
