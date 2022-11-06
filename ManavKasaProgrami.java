package Giris;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armutKg,elmaKg,domatesKg,muzKg,patlicanKg,toplamTutar;

        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;


        System.out.print("Kaç Kg Armut Aldınız: ");
        armutKg = input.nextDouble();

        System.out.print("Kaç Kg Elma Aldınız: ");
        elmaKg = input.nextDouble();

        System.out.print("Kaç Kg Domates Aldınız: ");
        domatesKg = input.nextDouble();

        System.out.print("Kaç Kg Muz Aldınız: ");
        muzKg = input.nextDouble();

        System.out.print("Kaç Kg Patlıcan Aldınız: ");
        patlicanKg = input.nextDouble();

        toplamTutar = armutKg*armutFiyat + elmaKg*elmaFiyat + domatesKg*domatesFiyat + muzKg*muzFiyat + patlicanKg*patlicanFiyat;
        System.out.println("Toplam Tutar : "+toplamTutar+" TL");
    }
}
