package sorular;

import java.util.Scanner;

public class S_001_7 {
    public static void main(String[] args) {
        /*
                2 sayı gir ve sayıları toplayıp sonucu ekrana yazdırınız
                karakter girerse "karakter girdiniz"
                string girerse "string girdiniz "
                özel karakter girerse "özel karakter girdiniz " yazısını ekrana çıkarsın
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen birinci sayiyi giriniz : ");
        String str1 = scan.nextLine();
        System.out.print("Lutfen ikinci sayiyi giriniz : ");
        String str2 = scan.nextLine();



        /*
            int sayi1 = Integer.parseInt(str1);
            int sayi2 = Integer.parseInt(str2);
            int toplam = sayi1 + sayi2;
            System.out.println(sayi1 + " + " + sayi2 + " = " + toplam);
        */
    }
}