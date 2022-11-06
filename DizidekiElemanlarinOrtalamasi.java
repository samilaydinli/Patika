package Giris;
public class DizidekiElemanlarinOrtalamasi {
    public static void main(String[] args) {
        //Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
        //Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
        //Harmonik Seri Formülü =  1+(1/2)+(1/3)...+(1/n)

        int numbers [] = {1,2,3,4,5};
        double sum=0;
        for(int i : numbers) {
            sum += (1.0 / i );
        }
        //System.out.println(sum);

        double harmonicAverage = numbers.length / sum;
        System.out.println("Harmonik Ortalama = " + harmonicAverage);
    }
}
