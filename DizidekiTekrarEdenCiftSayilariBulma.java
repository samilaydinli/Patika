package Giris;
public class DizidekiTekrarEdenCiftSayilariBulma {

    static boolean isFind(int[] arr, int value){

        for(int i : arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {2, 5, 6, 1, 2, 4, 6, 4, 6, 6, 2, 8, 8, 5, 7, 7};
        int[] evenNumber = new int[list.length];
        int startIndex = 0;

        for(int i=0; i < list.length; i++){

            for(int j=0; j < list.length; j++){

                if(i != j && list[i]==list[j] ){
                    if( !isFind(evenNumber , list[i] )){
                        evenNumber[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        for(int value : evenNumber){
            if(value !=0 && value % 2 == 0 ){
                System.out.println( value );
            }
        }
    }
}
