package day32_stringBuilder;

public class C03_reverse {
    public static void main(String[] args) {
        // verilen bir input'u tersine cevirip,
        // bize donduren bir method olusturun
        String input="Hey gidi for loop gunleri";
        String tersInput= tersineCevir(input);
        System.out.println(tersInput);

        String isim="serap";
        String tersSerap=tersHali(isim);
        System.out.println(tersSerap);
    }

   public static String tersHali(String isim) {
        StringBuilder sb1=new StringBuilder(isim);
        return sb1.reverse().toString();
    }

    public static String tersineCevir(String input) {
        StringBuilder sb=new StringBuilder(input);
        return sb.reverse().toString();




    }
}
