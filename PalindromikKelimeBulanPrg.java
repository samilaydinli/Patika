package Giris;
//www.patika.dev
public class PalindromikKelimeBulanPrg {
    //metodun içine girdiğimiz kelimenin ilk ve son harfini kıyaslamaya baslıyoruz eğer eşit değil ise false, tüm harfler eşit ise true döndüren bir kod blogu.
    //METHOD 1
    static boolean isPalindrome(String word){
        int first = 0;
        int last = word.length() - 1;

        while(first < last){
            if( word.charAt(first) != word.charAt(last) ){
                return false;
            }
            first++; last--;
        }
        return true;
    }

    //METHOD 2
    //reverse adında boş bir string değişken tanımladım,sonrasında metoda girdiğim kelimeyi tersten yazıp eşit mi diye kontrol ettim.
    static boolean isPalindrome2(String word){
        String reverse = "";
        for(int i=word.length()-1; i>=0; i--){
            reverse += word.charAt(i);
        }
        return word.equals(reverse);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("kayak"));
        System.out.println(isPalindrome2("kayak"));
    }
}
