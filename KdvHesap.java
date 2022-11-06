package Giris;
//www.patika.dev
import java.util.Scanner;
//Ödev
//Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
public class KdvHesap {
    public static void main(String[] args) {
        Scanner para = new Scanner(System.in);

        double miktar, kdvliMiktar;
        double kdvOrani1 = 0.18, kdvOrani2 = 0.08;

        System.out.println("Para Miktarı: ");
        miktar = para.nextDouble();

        double toplamMiktar1 = miktar * kdvOrani1 + miktar;
        double toplamMiktar2 = miktar * kdvOrani2 + miktar;

        kdvliMiktar = miktar < 1000 ? (toplamMiktar1) : (toplamMiktar2);

        System.out.println("Miktar : "+miktar+"\nKdvli'Tutar : "+kdvliMiktar);

        System.out.println("1000 TL'ye kadar KDV Oranı: " + kdvOrani1);
        System.out.println("1000 TL ve sonrası için KDV Oranı: " + kdvOrani2);
    }
}
