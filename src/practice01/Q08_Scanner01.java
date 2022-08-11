package practice01;

import java.util.Scanner;

public class Q08_Scanner01 {
    // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Toplama için 1. sayıyı giriniz = ");
        int sayi1 = scan.nextInt();

        System.out.println("Toplama için 2. sayıyı giriniz = ");
        int sayi2 = scan.nextInt();

        int toplam = sayi1 + sayi2;

        System.out.println("Toplam Sonucu = " + toplam);

    }
}
