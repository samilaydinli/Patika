package Giris;

import java.util.Scanner;

//www.patika.dev
public class TaksimetreProgrami {
    /*
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
     */
    public static void main(String[] args) {
        int km;
        double perKm = 2.2;
        double startingFare = 10;
        double totalFare;

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç Km Gideceksiniz: ");
        km = input.nextInt();

        totalFare = (km * perKm) + startingFare;
        totalFare = (totalFare < 20) ? (20) : (totalFare);

        System.out.println("Tutar : "+totalFare+" TL");

    }
}
