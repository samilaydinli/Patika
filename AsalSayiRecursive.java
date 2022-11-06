package Giris;
//www.patika.dev
public class AsalSayiRecursive {
    public static void main(String[] args) {

        isAsal(7,2);

    }

    static boolean isAsal(int number, int i){
        if(i == number) {
            System.out.println(number + " sayısı ASALDIR.");
            return true;
        }
        else if (number % i == 0){
            System.out.println(number + " sayısı ASAL DEĞİLDİR.");
            return false;
        }
        return isAsal(number,i+1);
    }
}

