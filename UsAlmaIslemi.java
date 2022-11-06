package Giris;
import java.util.Scanner;
//wwww.patika.dev
public class UsAlmaIslemi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y,result=1;

        System.out.print("Üssü Alınacak Sayıyı Giriniz : ");
        x = input.nextInt();

        System.out.print("Kuvveti Giriniz : ");
        y = input.nextInt();

        for(int i=1; i<=y; i++){
            result *=x;
        }
        System.out.println(x+" üzeri "+y+" = "+result);
    }
}
