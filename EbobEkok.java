package Giris;
//www.patika.dev
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        // EKOK = (n1*n2) / EBOB

        System.out.print("n1 değerini giriniz :");
        int n1 =inp.nextInt();
        System.out.print("n2 değeriniz giriniz : ");
        int n2 =inp.nextInt();

        // EBOB
        int ebob=1;
        int i=1;
        while (i<=n1 && i<=n2){
            if (n1 % i == 0 && n2 % i == 0){
                ebob=i;
            }i++;
        }System.out.println("EBOB("+n1+","+n2+") = "+ebob);

        // EKOK
        int ekok=1;
        int j=n1;
        while (j <= n1 * n2){
            if(j % n1 ==0 && j % n2 ==0){
                ekok = j;
                break;
            }j++;
        }System.out.println("EKOK("+n1+","+n2+") = "+ekok);
    }
}
