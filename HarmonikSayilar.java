package Giris;
import java.util.Scanner;
//www.patika.dev
public class HarmonikSayilar {

    //Harmonik Seri Formülü =  1+(1/2)+(1/3)...+(1/n)

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n Sayısını Giriniz : ");
        int n = input.nextInt();
        double result=0;

        for(double i=1; i<=n; i++){
            result += (1/i);
        }
        System.out.println(result);
    }
}
