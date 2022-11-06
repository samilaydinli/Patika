package Giris;
//wwww.patika.dev
import java.util.Scanner;
public class BasamakSayisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz:");
        int number = input.nextInt();
        int basValue,basSum=0;

        while(number != 0){
            basValue = number % 10;
            basSum += basValue;
            number /= 10;
        }
        System.out.println(number+" sayısının basamakları toplamı = "+basSum);
    }
}
