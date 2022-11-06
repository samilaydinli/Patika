package Giris;
//www.patika.dev
import java.util.Scanner;
public class MinMaxDegerBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        int count = input.nextInt();

        int max=0,min=0;

        for (int i=1; i<=count; i++){
            System.out.print(i+".Sayıyı Giriniz : ");
            int number = input.nextInt();

            if(i==1){
                min = number;
                max = number;
            }
            if(number > max) max = number;
            if(number < min) min = number;
        }
        System.out.println("En Büyük Sayı = "+max);
        System.out.println("En Küçük Sayı = "+min);
    }
}
