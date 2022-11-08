package Giris;
import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin Boyutu : ");
        int sizeArray = input.nextInt();
        int temp=0;

        System.out.println("Dizinin Elemanlarını Giriniz :");

        if(sizeArray > 0){
            int array[] = new int[sizeArray];
            for(int i=0; i < sizeArray; i++){
                System.out.print((i+1)+". Eleman : ");
                array[i]= input.nextInt();
            }
            //System.out.println("Dizi = "+ Arrays.toString(array));

            for(int i=0; i < sizeArray; i++){

                for(int j=i+1; j < sizeArray; j++){

                    if(array[i] > array[j]){
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            System.out.println("Sıralama : " + Arrays.toString(array));
        }
    }
}
