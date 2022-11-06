package Giris;
//wwww.patika.dev
import java.util.Scanner;
public class AtmProjesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName,password;
        int attempt=3;
        int balance =2000;
        int select;

        while(attempt > 0){
            System.out.print("Lütfen Kullanıcı Adınızı Giriniz : ");
            userName = input.nextLine();
            System.out.print("Lütfen Şifrenizi Giriniz : ");
            password = input.nextLine();

            if(userName.equals("angelina") && password.equals("angel321")){
                System.out.println("Merhaba, X Banka Hoşgeldiniz! ");

                do {
                    System.out.println("1-Para Yatırma\n"+
                            "2-Para Çekme\n"+
                            "3-Bakiye Sorgulama\n"+
                            "4-Çıkış Yap");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
                    select = input.nextInt();

                    int amount=0;
                    switch (select){
                        case 1:
                            System.out.print("Yatıracağınız Para Miktarını Giriniz : ");
                            amount = input.nextInt();
                            balance += amount;
                            System.out.println("Güncel Bakiyeniz : "+balance+"\n");
                            break;

                        case 2:
                            System.out.print("Çekmek İstediğiniz Para Miktarını Giriniz : ");
                            amount = input.nextInt();
                            if(amount > balance){
                                System.out.println("Yetersiz Bakiye!\n ");
                            }else {
                                balance -= amount;
                                System.out.println("Güncel Bakiyeniz : "+balance+"\n");
                            }break;

                        case 3:
                            System.out.println("Bakiyeniz : "+balance+"\n");
                            break;
                    }

                }while (select !=4);
                System.out.println("Çıkış Yapılıyor, İyi Günler Dileriz...\n");
                break;
            }else {
                attempt--;
                if(attempt != 0){
                    System.out.println("Hatalı Kullanıcı adı veya Şifre, Lütfen Tekrar Deneyiniz!");
                    System.out.println("Kalan Hakkınız : "+attempt);
                }else System.out.println("Hesabınız Bloke Olmuştur, Lütfen En yakın şubemiz ile iletişme geçiniz!");
            }
        }
    }
}
