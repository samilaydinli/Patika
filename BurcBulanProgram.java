package Giris;
/*
Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
 */
import java.util.Scanner;
//www.patika.dev
public class BurcBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String burc = "";

        System.out.println("Doğduğunuz ay : ");
        int month = input.nextInt();

        System.out.println("Doğduğunuz gün : ");
        int day = input.nextInt();

        if((month == 1 && (day >= 22 && day <= 31)) || (month == 2 && (day >= 1 && day <= 19))){
            burc = "Kova";
        } else if ((month == 2 && (day >= 20 && day <= 28)) || (month == 3 && (day >= 1 && day <= 20))) {
            burc = "Balık";
        }else if ((month == 3 && (day >= 21 && day <= 31)) || (month == 4 && (day >= 1 && day <= 20))) {
            burc = "Koç";
        }else if ((month == 4 && (day >= 21 && day <= 30)) || (month == 5 && (day >= 1 && day <= 21))) {
            burc = "Boğa";
        }else if ((month == 5 && (day >= 22 && day <= 31)) || (month == 6 && (day >= 1 && day <= 22))) {
            burc = "İkizler";
        }else if ((month == 6 && (day >= 23 && day <= 30)) || (month == 7 && (day >= 1 && day <= 22))) {
            burc = "Yengeç";
        }else if ((month == 7 && (day >= 23 && day <= 31)) || (month == 8 && (day >= 1 && day <= 22))) {
            burc = "Aslan";
        }else if ((month == 8 && (day >= 23 && day <= 31)) || (month == 9 && (day >= 9 && day <= 22))) {
            burc = "Başak";
        }else if ((month == 9 && (day >= 23 && day <= 31)) || (month == 10 && (day >= 1 && day <= 22))) {
            burc = "Terazi";
        }else if ((month == 10 && (day >= 23 && day <= 31)) || (month == 11 && (day >= 1 && day <= 21))) {
            burc = "Akrep";
        }else if ((month == 11 && (day >= 22 && day <= 31)) || (month == 12 && (day >= 1 && day <= 21))) {
            burc = "Yay";
        }else {
            System.out.println("Lutfen Geçerli Ay(1-12) ve Gün(1-31) Giriniz!");
        }
        System.out.println("Burcunuz = "+burc);
    }
}
