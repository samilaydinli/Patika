package Giris;
//www.patika.dev
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DizidekiElemanlarinFrekansi {
    public static void main(String[] args) {
        int [] array = {10, 20, 20, 10, 10, 20, 5, 20};
        List<Integer> frequency = new ArrayList<>();
        int counter = 0;

        System.out.println("Dizi : "+ Arrays.toString(array));
        System.out.println("Tekrar Sayıları");

        //Olusturdugum dizideki tekrar eden sayıları bulmak için 'i' adında bir degisken atıyorum.
        //ve her indisteki sayıyı digerleri ile karsılastırıyorum.
        for(int i=0; i<array.length; i++){
            for(int j=0; j< array.length; j++){
                if(array[i] == array[j]){
                    counter++;
                }
            }

            //! koyuyorum çünkü zaten kontrol ettiğim sayıyı bir daha kontrol etmesini istemiyorum.
            if(!(frequency.contains(array[i])) && counter >0 ){
                frequency.add(array[i]);
                System.out.println(array[i] + " sayısı " + counter + " kere tekrar edildi.");
            }
            counter = 0;
            //her sayıdan sonra sayacı 0 lıyorum.
        }
    }
}
