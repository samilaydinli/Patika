package Giris;

import java.util.Scanner;

//www.patika.dev
public class CinZodYagiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year,residual;

        System.out.print("Doğum Yılınızı Giriniz : ");
        year = input.nextInt();

        residual = year % 12;
        String sign="";
        switch (residual){
            case 0:
                sign = "Maymun";
                break;
            case 1:
                sign = "Horoz";
                break;
            case 2:
                sign = "Köpek";
                break;
            case 3:
                sign = "Domuz";
                break;
            case 4:
                sign = "Fare";
                break;
            case 5:
                sign = "Öküz";
                break;
            case 6:
                sign = "Kaplan";
                break;
            case 7:
                sign = "Tavşan";
                break;
            case 8:
                sign = "Ejderha";
                break;
            case 9:
                sign = "Yılan";
                break;
            case 10:
                sign = "At";
                break;
            case 11:
                sign = "Koyun";
                break;
        }
        System.out.println("Çin Zodyağı Burcunuz : "+sign);
    }
}
