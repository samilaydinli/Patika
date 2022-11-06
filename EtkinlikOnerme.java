package Giris;
//www.patika.dev
import java.util.Scanner;

//        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
//        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
//        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
//        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
public class EtkinlikOnerme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hava Sıcaklığını Giriniz: ");
        int heat = input.nextInt();

        if(heat < 5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat <=25) {
            if (heat <= 15){
                System.out.println("Sinemaya Gidebilirsiniz.");
            }else{
                System.out.println("Piknik Yapmaya Gidebilirsiniz.");
            }
        }else {
            System.out.println("Yüzmeye Gidebilirsiniz.");
        }
    }
}
