package sorular;

import java.util.Scanner;

public class S_001_1 {
    public static void main(String[] args) {
        /*
            String değişkenine "Java Exercises!" değerini atayalım ve ekrana aşağıdaki gibi çıkartalım
                0. karakter J dir
                10. karakter i dir
         */
        String str = "Java Exercises!";

        int a = str.charAt(10);

        System.out.println("0. karakter " + str.substring(0, 1) + " dir"); // 0. karakter J dir
        System.out.println("10. karakter " + (char) (a) + " dir");  // 10. karakter i dir
    }
}
