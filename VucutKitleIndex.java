package Giris;

import java.util.Scanner;

public class VucutKitleIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double boy,kilo,index;

        System.out.print("Lütfen Boyunuzu cm cinsinden Giriniz : ");
        boy = input.nextDouble() / 100;

        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kilo = input.nextDouble();

        index = kilo / (boy * boy);
        System.out.println("Vücut Kütle İndeksiniz : "+index);
    }
}
