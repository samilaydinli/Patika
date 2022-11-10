import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;              // Kullanıcıdan satır sayısı aldık. MineSweeper metotu için
    int columnNumber;           // Kullanıcıdan sütun sayısı aldık. MineSweeper metotu için
    String [][] mineMap;        // Mayınları atayacağım harita.
    String [][] gameMap;        // Kullanıcının oynacağı harita.
    int mineNumber;             // Mayın Sayısı


    // Main Constructor oluşturduk
    MineSweeper(int rowNumber, int columnNumber) {
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.mineMap = new String [rowNumber][columnNumber];
        this.gameMap = new String [rowNumber][columnNumber];
        this.mineNumber = (rowNumber * columnNumber) / 4;
    }

    //Kullanıcının her round göreceği boş bir map oluşturduk.
    void printMap(){
        for(int i = 0; i < rowNumber; i++){
            for(int j = 0; j < columnNumber; j++){
                System.out.print(this.gameMap[i][j] +  " ");
            }
            System.out.println();
        }
    }

    //Kullanıcı için gameMap olusturduk.
    void gameMap(){
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                this.gameMap[i][j] = "-";
            }
        }
    }

    //Random Sayı ürettik ve mineMap[][] dizisine mayınları atadık ve ekrana yazdırma işlemini gerçekleştirdik.
    public void plantedMine() {
        Random rand = new Random();
        for(int i = 0; i < mineNumber; i++){
            int randomRow = rand.nextInt(rowNumber);         //rastgele satırlara mayın koymak için sayı üretiyoruz.
            int randomColumn = rand.nextInt(columnNumber);   //rastgele sütunlara mayın koymak için sayı üretiyoruz.

            if( this.mineMap[randomRow][randomColumn] != "*") {     //rastgele satır ve sütunlarda * bulunmadıgı için * ataması yaptık.
                this.mineMap[randomRow][randomColumn] = "*";
            }else {
                i--;
            }
        }

        //mayınlı yerlere çizgi koyuyar görmeyelim diye
        for(int i = 0; i < rowNumber; i++){
            for(int j = 0; j < columnNumber; j++){
                if(this.mineMap[i][j] != "*"){
                    this.mineMap[i][j] = "-";
                }
                System.out.print(this.mineMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    //boş mayın map
    void printMineMap(){
        for(int i = 0; i < rowNumber; i++){
            for(int j = 0; j < columnNumber; j++){
                System.out.print(this.mineMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    void run(){
        int totalMove = (rowNumber * columnNumber) - mineNumber;
        Scanner input = new Scanner(System.in);

        gameMap();
        System.out.println("Mayınların Konumu");
        plantedMine();
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz");

        while(totalMove > 0) {
            int mineCounter = 0;

            System.out.println("===========================");
            System.out.println("Kalan Hamle Hakkınız : " + totalMove);
            printMap();

            System.out.print("Satır Giriniz : ");
            int row = input.nextInt();

            System.out.print("Sütun Giriniz : ");
            int col = input.nextInt();


            if ((row < 0 || row >= rowNumber) || (col < 0 || col >= columnNumber)) {
                System.out.println("Hatalı Giriş Yaptınız, Lütfen doğru index numarası giriniz !");
                continue;
            } else {
                if (this.mineMap[row][col] == "*") {
                    System.out.println("Game Over!!");
                    printMineMap();
                    break;
                }if( ! this.gameMap[row][col].equals("-") ){
                    System.out.println("Bu hamleyi zaten yaptınız !");
                    continue;
                }else{
                    int minusRow = (row - 1), plusRow = (row + 1);
                    int minusCol = (col - 1), plusCol = (col + 1);

                    if ( (minusRow < 0) || (minusCol < 0) ){
                        minusRow = 0;
                        minusCol = 0;
                    }
                    if( (plusRow >= rowNumber) || (plusCol >= columnNumber) ){
                        plusRow = row;
                        plusCol = col;
                    }
                    for(int i = minusRow; i <= plusRow; i++){
                        for (int j = minusCol; j<= plusCol; j++){
                            if(this.mineMap[i][j] == "*"){
                                mineCounter++;
                            }
                        }
                    }
                    String convertMineCounter = String.valueOf(mineCounter);
                    this.gameMap[row][col] = convertMineCounter;
                    totalMove--;
                }
            }
        }
        if(totalMove == 0){
            System.out.println("Oyunu Kazandınız  !");
            printMap();
        }
    }
}
