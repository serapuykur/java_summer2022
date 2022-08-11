package sorular;

public class S_001_6 {
    public static void main(String[] args) {
        /*
                Girilen stringin içindeki değerin başındaki ve sonundaki boslukları kaldırın
                string içinde boşluk hariç özel karakter veya sayi varsa uyari versin
                not : bunu daha sonra ad soyad giriniz kısmına ekleyebiliriz. Ad ve soyadda yukarıda dediğimiz yoktur
         */
        String input = "  yunus emre1+.  ";
        input = input.trim();
        input = input.replaceAll(" ", "qwea"); // aradaki boşluk karakteri için yaptigimiz islemlerde silinmesin

        if (input.equals(input.replaceAll("\\d", "").replaceAll("\\W", ""))) {
            System.out.println("Stringimizde sayisal  deger veya ozel karakter yoktur");
        } else {
            System.out.println("Stringimizde sayisal deger veya ozel karakter  vardir");
        }
        input = input.replaceAll("qwea", " ");

        System.out.println(input);
    }
}