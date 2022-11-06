package Giris;

import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int toplam=0, dersSayisi=0;
        int matematik,fizik,turkce,kimya,muzik;

        System.out.println("Matematik Notunuz: ");
        matematik = input.nextInt();
        if(matematik < 0 || matematik > 100){
            System.out.println("Bu Not Hesaplamaya dahil edilmeyecektir!");
        }else{
            toplam = toplam + matematik;
            dersSayisi++;
        }

        System.out.println("Fizik Notunuz: ");
        fizik = input.nextInt();
        if(fizik < 0 || fizik > 100){
            System.out.println("Bu Not Hesaplamaya Dahil Edilmeyecektir!");
        }else {
            toplam = toplam + fizik;
            dersSayisi++;
        }

        System.out.println("Türkçe Notunuz: ");
        turkce = input.nextInt();
        if(turkce < 0 || turkce> 100){
            System.out.println("Bu Not Hesaplamaya dahil edilmeyecektir!");
        }else{
            toplam = toplam + turkce;
            dersSayisi++;
        }

        System.out.println("Kimya Notunuz: ");
        kimya = input.nextInt();
        if(kimya < 0 || kimya > 100){
            System.out.println("Bu Not Hesaplamaya Dahil Edilmeyecektir!");
        }else {
            toplam = toplam + kimya;
            dersSayisi++;
        }

        System.out.println("Müzik Notunuz: ");
        muzik = input.nextInt();
        if(muzik < 0 || muzik > 100){
            System.out.println("Bu Not Hesaplamaya Dahil Edilmeyecektir!");
        }else {
            toplam = toplam + muzik;
            dersSayisi++;
        }

        double ortalama = toplam / dersSayisi;
        if(ortalama < 55){
            System.out.println("Kaldınız !");
        }else{
            System.out.println("Geçtiniz Tebrikler !");
        }

        System.out.println("Ortalamanız : "+ortalama);
    }
}
