package Giris;
//wwww.patika.dev
import java.util.Scanner;
public class YidizlarlaElmasYapimi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int n = input.nextInt();

        //UST UCGEN OLUSTURMA
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int k=1; k <= (2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //ALT UCGEN OLUSTURMA
        for(int i=1; i<n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*n-(2*i+1)); k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
