package Giris;

import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int number = input.nextInt();

        int basamakSayisi=0;
        int tempNumber = number;
        int basamakValue;
        int result=0;
        int basamakPow;


        //önce basamak sayisini buldum.
        while(tempNumber != 0){
            tempNumber = tempNumber / 10;
            basamakSayisi++;
        }

        //sonra kullanıcıdan aldıgım sayıyı kaybetmeme için gecici bir sayı tanımladım ve mod işlemi ile tek tek basamaklardaki sayıları aldım
        //ve her basamagı aldıgımda basamaksayısı kadar kuvvetini aldım.
        tempNumber = number;
        while (tempNumber != 0 ){
            basamakValue = tempNumber % 10;
            basamakPow=1;
            for(int i=1; i<=basamakSayisi; i++){
                basamakPow *= basamakValue;
            }
            result += basamakPow;
            tempNumber = tempNumber / 10;
        }
        if(result == number) {
            System.out.println(number+" sayısı bir Armstrong sayıdır.");
        }else System.out.println(number+" sayısı bir Armstrong sayı değildir.");
    }
}
