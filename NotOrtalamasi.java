package Giris;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner not = new Scanner(System.in);

        //Ders Notları
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Değer Al
        System.out.println("Matematik Notunuz: ");
        mat = not.nextInt();

        System.out.println("Fizik Notunuz: ");
        fizik = not.nextInt();

        System.out.println("Kimya Notunuz: ");
        kimya = not.nextInt();

        System.out.println("Türkçe Notunuz: ");
        turkce = not.nextInt();

        System.out.println("Tarih Notunuz: ");
        tarih = not.nextInt();

        System.out.println("Müzik Notunuz: ");
        muzik = not.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double ortalama = toplam / 6.0 ;
        System.out.println("Ortalamanız : "+ortalama);

        String kosul = (ortalama >= 60) ? "Tebrikler,Geçtiniz!" : "Üzgünüz,Kaldınız!";
        System.out.print(kosul);
    }
}
