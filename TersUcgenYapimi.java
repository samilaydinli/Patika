package Giris;
import java.util.Scanner;
//www.patika.dev
public class TersUcgenYapimi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısı : ");
        int n = input.nextInt();

        for(int i=0; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=(2*n-(2*i+1)); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
