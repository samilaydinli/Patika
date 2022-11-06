package Giris;
//www.patika.dev
import java.util.Scanner;
public class UsAlma_Recursive {
    /*
    2^4 = 2 * 2^3
    2^3 = 2 * 2^2
    2^2 = 2 * 2^1
    2^1 = 2 * 2^0
     */
    static int pow(int x, int y){
        if(y == 0) return 1;
        return x * pow(x , y - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int x = input.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int y = input.nextInt();

        System.out.println("Sonuç : "+pow(x,y));
    }
}

