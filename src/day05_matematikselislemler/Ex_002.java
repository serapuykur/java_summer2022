package day05_matematikselislemler;

import java.util.Scanner;

public class Ex_002 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("4 basamaklı pozitif bir sayı giriniz : ");

        int sayi = scan.nextInt();

        // 1453  sayısı için örnek olsun
        int birler = sayi % 10;     // 3
        int a = sayi / 10;          // 145

        System.out.println(a + "  " + birler);

        // a sayı 145 oldu
        int onlar = a % 10;         // 5
        int b = a / 10;             // 14

        System.out.println(b + " " + onlar);

        // b sayı 14 oldu
        int yuzler = b % 10;        // 4
        int binler = b / 10;          // 1

        System.out.println(binler + " " + yuzler);

        int toplam = binler + yuzler + onlar + birler;
        System.out.println("Girilen sayının rakamları toplamı : " + toplam);

    }
}
