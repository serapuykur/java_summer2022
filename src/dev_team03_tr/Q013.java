package dev_team03_tr;

import java.util.Scanner;

public class Q013 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("lütfen bir yazı giriniz : ");
        String isim = scan.nextLine();

        System.out.print("yazının kaçıncı karakterini yazdıralım : ");
        int i = scan.nextInt();

        if (isim.length() - 1 < i) {
            System.out.println("girdiğimiz yazı bu uzunlukta değil");
        } else {
            System.out.println(isim.charAt(i-1));
        }

    }
}
