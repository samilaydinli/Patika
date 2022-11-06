package Giris;
import java.util.Scanner;
//www.patika.dev
public class DordeBolunenSayiTopla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,counter=0,sum=0;
        boolean isRun = true;


        while(isRun){
            System.out.print("Sayı Giriniz : ");
            number = input.nextInt();

            if(number % 2 != 0){
                System.out.println("Tek Sayı Girdiniz,Program Kapanıyor...");
                isRun=false;
            } else if (number % 4 == 0) {
                sum += number;
                counter++;
            }
        }
        System.out.println(counter+" sayının toplamı = "+sum);
    }
}
