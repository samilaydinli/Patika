package Giris;
//www.patika.dev
import java.util.Scanner;
public class MatrisTranspozeBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Satır Sayısı : ");
        int row = input.nextInt();

        System.out.print("Sütun Sayısı : ");
        int column = input.nextInt();

        int[][] matris = new int[row][column];
        int[][] transpoze = new int[column][row];

        //Tek tek matri'i gezerek kullanıcıdan değer alıp tanımladıgım matris'E atıcam
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print("["+i+"]["+j+"]. Eleman = ");
                matris[i][j] = input.nextInt();
            }
            System.out.println();
        }

        //Matrisi Ekrana Yazdırma
        System.out.println("Matris : ");
        for(int i[] : matris){
            for(int j : i){
                System.out.print(j + "\t");
            }
            System.out.println();
        }

        //Transpozu Alıp Ekrana Yazdırma
        //Matris ters döndüğü için i sütun sayısını alıyor ,j satır sayını alıyor
        System.out.println("\nTranspoze : ");
        for(int i=0; i<column; i++){
            for(int j=0; j<row; j++){
                transpoze[i][j] = matris[j][i];
                System.out.print(transpoze[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
