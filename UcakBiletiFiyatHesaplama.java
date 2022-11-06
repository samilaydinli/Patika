package Giris;
//www.patika.dev
import java.util.Scanner;
public class UcakBiletiFiyatHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int distance,age,tripType;
        double costperKm=0.10, twoWay=0.20;
        double ageDiscountRate;
        double normalPrice, ageDiscount, discountPrice, finalPrice;

        boolean isRun = true;

        while(isRun){
            System.out.print("Mesafeyi Km Türünden Giriniz: ");
            distance = input.nextInt();

            System.out.print("Yaşınızı Giriniz : ");
            age = input.nextInt();

            System.out.print("Yolculuk Tirini Giriniz (1 => Tek Yön , 2 => Gidiş Dönüş) : ");
            tripType = input.nextInt();

            if((tripType == 1 || tripType ==2) && (age > 0 && distance > 0)){
                if(age < 12 ) ageDiscountRate = 0.50;
                else if (age <=24 ) ageDiscountRate = 0.10;
                else if( age >=65 ) ageDiscountRate = 0.30;
                else ageDiscountRate = 0;

                normalPrice = distance * costperKm;
                ageDiscount = normalPrice * ageDiscountRate;
                discountPrice = normalPrice - ageDiscount;
                finalPrice = discountPrice;

                if(tripType == 2){
                    double twoWayDiscount = discountPrice * twoWay;
                    finalPrice = (discountPrice - twoWayDiscount) * 2;
                }
                System.out.println("Ticket Cost = "+finalPrice + " TL");
                isRun = false;
            }else System.out.println("Unvalid data entry!, Please Try Again \n");
        }
    }
}
