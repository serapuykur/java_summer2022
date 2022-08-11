package dev_team03_tr;

import java.util.Scanner;

public class Q002 {
    //  Klavyeden bir boy uzunluğu isteyiniz. 175’e eşit veya küçükse ekrana
    // ‘KISA BOYLUSUNUZ.’, 175’den büyükse ekrana “UZUN BOYLUSUNUZ.’ mesajını
    //  yazdıracak şekilde programı yazınız.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen boyunuzun uzunluğunu giriniz : ");
        int boy = scan.nextInt();

        if (boy <= 175) {
            System.out.println("KISA BOYLUSUNUZ.");
        } else {
            System.out.println("UZUN BOYLUSUNUZ.");
        }

    }
}
