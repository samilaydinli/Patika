package Giris;
import java.util.Scanner;
//www.patika.dev
public class GirilenSayiyaKadarKuvvetAlma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int number = input.nextInt();

        System.out.print("4'ün katları : ");
        for(int i=1; i<=number; i*=4){
            System.out.print(i + " - ");
        }

        System.out.print("\n5'in katları : ");
        int j=1;
        while (j <= number){
            System.out.print(j+" - ");
            j*=5;
        }
    }
}
