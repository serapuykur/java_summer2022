package sorular;

import java.util.Scanner;

public class S_001_4 {
    public static void main(String[] args) {
        /*
            Verilen iki kelimenin büyük ve küçük olma durumunu bulan program yazınız
            örnegin   "elmas" "elma" dan büyüktür yani sozlukte alt sıralardadır
            ( String içindeki kelimeleri değiştirerek test ediniz)
            isterseniz büyük küçük harf duyarlılığını iptal edebilirsiniz (elma  Elma.. aynı değil)
        */
        String str1 = "elmas";
        String str2 = "elmas";
        int i = 0;
        i = str1.compareTo(str2);
        System.out.println(str1 + " ?? " + str2);
        if (i == 0) {
            System.out.println(str1 + " =  " + str2);
        }
        if (i > 0) {
            System.out.println(str1 + " >  " + str2);
        }
        if (i < 0) {
            System.out.println(str1 + "  < " + str2);
        }
        System.out.println("i = " + i);
    }
}
