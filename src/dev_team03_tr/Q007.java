package dev_team03_tr;

import java.util.Scanner;

public class Q007 {
    public static void main(String[] args) {
        //devamsizliktan dolayi kalan ogrenciler not yuzunden kalan
        // ogrenciler ve her iki turlu kalan ogrenciler
        //kalma notu 50 alti
        //devamsizlik maksimum 30 gun olabilir gecmsei icin

        Scanner scan = new Scanner(System.in);
        System.out.print("Notunuzu giriniz: ");
        int not = scan.nextInt();
        System.out.print("Devamsızlığınızı giriniz: ");
        int katilim = scan.nextInt();

        if (not >= 50 && katilim < 30) {
            System.out.println("Geçti Tebrikler");
        } else {
            if (katilim > 29) {
                System.out.println("Devamsızlıktan kaldı");
            } else {
                System.out.println("Başarısızlıktan kaldı");
            }
        }
    }
}
