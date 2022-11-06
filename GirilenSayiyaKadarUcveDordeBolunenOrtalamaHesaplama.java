package Giris;
//www.patika.dev
import java.util.Scanner;

public class GirilenSayiyaKadarUcveDordeBolunenOrtalamaHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Sayı Giriniz : ");
        number = input.nextInt();

        int sum=0,counter=0;

        for(int i=1; i<=number; i++){
            if(i%3==0 && i%4==0){
                sum += i;
                counter++;
            }
        }

        double average = sum / counter;
        if(sum != 0){
            System.out.println("Ortalama : "+average);
        }else System.out.println(number + " sayisina kadar 3 ve 4'e bölünebilen sayı yoktur!");
    }
}
