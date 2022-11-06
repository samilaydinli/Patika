package Giris;

import java.util.Scanner;

//www.patika.dev
public class HesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner input = new Scanner(System.in);

        System.out.println("İlk Sayıyı Giriniz: ");
        n1 = input.nextInt();

        System.out.println("İkinici Sayıyı Giriniz: ");
        n2 = input.nextInt();

        System.out.println("[1]-Toplama\n[2]-Çıkarma\n[3]-Çarpma\n[4]-Bölme");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplama İşleminizin Sounucu : "+(n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma İşleminizin Sounucu : "+(n1-n2));
                break;
            case 3:
                System.out.println("Çarpma İşleminizin Sounucu : "+(n1*n2));
                break;
            case 4:
                System.out.println("Bölme İşleminizin Sounucu : "+(n1/n2));
                break;
            default:
                System.out.println("Lütfen Geçerli Seçim Yapınız!");
        }



    }
}
