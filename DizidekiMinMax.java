package Giris;
import java.util.Arrays;
import java.util.Scanner;

public class DizidekiMinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list = {15,12,788,1,-1,-778,2,0};
        int min = list[0];
        int max = list[0];

        System.out.print("Sayı Giriniz : ");
        int number = input.nextInt();

        Arrays.sort(list);
        for(int i : list){
            if(i < number){
                min = i;
            }
            if(i > number){
                max = i;
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı = " +min);
        System.out.println("Girilen sayıdan büyük en yakın sayı = " +max);
    }
}
