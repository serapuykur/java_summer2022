package dev_team03_tr;

import java.util.Scanner;

public class Q009 {
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
        if (not >= 50) {
            if (katilim < 30) {
                System.out.println("Tebrikler Geçtiniz");
            } else {
                System.out.println("Devamsızlıktan kaldınız");
            }
        } else {
            if (katilim < 30) {
                System.out.println("Başarısızlıktan kaldınız");
            } else {
                System.out.println("Hem devamsızlık hemde Başarısızlıktan kaldınız");
            }
        }
    }
}
