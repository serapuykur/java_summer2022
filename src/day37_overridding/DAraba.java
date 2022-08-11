package day37_overridding;

public class DAraba {
    public static void main(String[] args) {
        /*
         Farkli class'larda ayni isim ve signature'da
          method'lar olusturabiliriz
          cunku her bir class kendi icinde calisir
         */
    }
    void ekleme(){
    }
    void ekleme(int sayi){
    }
    void ekleme(String str){
    }
    private void yakit(){
        System.out.println("Tum arabalar yakit kullanir");
        /*
         Parent class'dan override edilmesini istemediginiz method'lari
         private, static veya final yapabilirsiniz
         */
    }
    void marka(){
        System.out.println("Tum arabalarin markasi vardir");
    }
    void motor(){
        System.out.println("Tum arabalarim motoru vardir");
    }

}

