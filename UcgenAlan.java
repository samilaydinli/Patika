package Giris;
import java.util.Scanner;
//www.patika.dev
public class UcgenAlan {
    /*
    Ödev
    Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
    Formül
    Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
    𝑢 = (a+b+c) / 2
    Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
     */

    public static void main(String[] args) {
        double kenar1,kenar2,kenar3;
        double cevre,alan,u;

        Scanner x = new Scanner(System.in);

        System.out.println("1.Kenarın Uzunluğunu Giriniz: ");
        kenar1 = x.nextDouble();
        System.out.println("2.Kenarın Uzunluğunu Giriniz: ");
        kenar2 = x.nextDouble();
        System.out.println("3.Kenarın Uzunluğunu Giriniz: ");
        kenar3 = x.nextDouble();

        u = (kenar1+kenar2+kenar3) / 2.0;
        cevre = 2*u;
        alan = Math.sqrt(u * (u-kenar1) * (u-kenar2) * (u-kenar3));

        System.out.println("Üçgenin Çevresi : "+cevre+"cm");
        System.out.println("Üçgenin Alanı : "+alan+"cm2");





    }
}
