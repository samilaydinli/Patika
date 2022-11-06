package Giris;
/*
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse
yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */
import java.util.Scanner;
//www.patika.dev
public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password,newPassword, oldPassword = "matrix123";
        int select;
        boolean choice = true;

        System.out.print("Lütfen Şifrenizi Giriniz: ");
        password = input.nextLine();
        
        if(password.equals(oldPassword)){
            System.out.println("Sisteme Başarılı Şekilde Giriş Yapıldı!");
        }else {
            while(choice){
                System.out.print("Girdiğiniz Şifre Hatalı,Şifreyi Sıfırlamak için 1'e , Çıkış Yapmak için 2'ye Basınız : ");
                select = input.nextInt();

                if( select == 1 ){
                    System.out.print("Yeni Şifrenizi Giriniz: ");
                    input.nextLine();
                    newPassword = input.nextLine();

                    while (newPassword.equals(password) || newPassword.equals(oldPassword)){
                        System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz: ");
                        newPassword = input.nextLine();
                    }
                    oldPassword = newPassword;
                    System.out.println("Yeni Şifre Oluşturuldu.Yeni Şifreniz : "+oldPassword);
                    choice=false;
                }
                else if (select == 2){
                    System.out.println("Sistemden Çıkış Yapıldı.");
                    choice=false;
                }
            }
        }
    }
}
