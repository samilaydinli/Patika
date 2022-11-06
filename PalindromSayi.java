package Giris;
//www.patika.dev
public class PalindromSayi {

    static boolean isPalindromic(int number){
        int temp = number;
        int reverseNumber=0, lastNumber;

        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if(number == reverseNumber) {
            System.out.println(number + " bir Palindrom Sayıdır.");
            return true;
        }else {
            System.out.println(number + " bir Palindrom Sayı Değildir.");
            return false;
        }
    }

    public static void main(String[] args) {
        isPalindromic(1661);
    }
}
