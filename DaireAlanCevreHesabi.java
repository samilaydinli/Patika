package Giris;

import java.util.Scanner;

//www.patika.dev
public class DaireAlanCevreHesabi {
    /*
Alan Formülü : π * r * r;
Çevre Formülü : 2 * π * r;
Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
𝜋 sayısını = 3.14 alınız.
Formül : (𝜋 * (r*r) * 𝛼) / 360
     */
    public static void main(String[] args) {
        int r,𝛼;
        double 𝜋 = 3.14;
        String ad;

        Scanner input = new Scanner(System.in);

        System.out.println("Yarıçapı Giriniz: ");
        r = input.nextInt();

        System.out.println("Daire Diliminin Açısını Giriniz: ");
        𝛼 = input.nextInt();



        double alan = (𝜋 * (r*r) * 𝛼) / 360.0 ;
        System.out.println("Alan: "+alan);


    }
}
