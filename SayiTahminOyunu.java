package Giris;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);

        Scanner input = new Scanner(System.in);

        int right = 5;
        int selectedNumber;
        int[] wrongEstimation = new int[5];
        int i = 0;
        boolean isWin = false;
        boolean isMistake = false;

        while(right > 0){
            System.out.print("Lütfen Tahmin Ettiğiniz Sayıyı Giriniz : ");
            selectedNumber = input.nextInt();

            if(selectedNumber < 0 || selectedNumber > 99){
                System.out.println("Lütfen 0-100 arasında bir değer giriniz !");
                if(isMistake){
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + --right);
                }else {
                    isMistake = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir !");
                }
                continue;
            }

            if(selectedNumber == randomNumber){
                System.out.println("Tebrikler, bildiniz. Tahmin Ettiğiniz Sayı : "+ randomNumber);
                isWin = true;
                break;
            }else{
                wrongEstimation[i++] = selectedNumber;
                System.out.println("Yanlış Tahmin Ettiniz !");
                if(selectedNumber > randomNumber){
                    System.out.println(selectedNumber + " sayısı gizli sayıdan büyüktür.Tahmininizi küçültün.");
                }else {
                    System.out.println(selectedNumber + " sayısı gizli sayıdan küçüktür.Tahmininizi büyültün.");
                }
                right--;
                System.out.println("Kalan Hakkınız : "+right);
            }
        }

        if(isWin == false){
            System.out.println("Kaybettiniz !");
            if(isMistake == false){
                System.out.println("Tahminleriniz : " + Arrays.toString(wrongEstimation));
                System.out.println("Gizli Sayı = " + randomNumber +" idi.");
            }
        }
    }
}
