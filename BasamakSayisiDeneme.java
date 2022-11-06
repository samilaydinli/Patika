package Giris;
//www.patika.dev
import java.util.Scanner;
public class BasamakSayisiDeneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int number = input.nextInt();
        int basNumber=0;
        int basValue;
        int basSum=0;

        int tempNumber = number;
        while(tempNumber != 0){
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while(tempNumber != 0){
            basValue = tempNumber % 10;
            basSum = basSum + basValue;
            tempNumber /= 10;
        }
        System.out.println(number+" sayısının basamakları toplamı = "+basSum);
    }
}
