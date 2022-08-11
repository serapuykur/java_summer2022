package dev_team03_tr;

import java.util.Scanner;

public class Q008 {
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

        if (not >= 50 && katilim < 30){
            System.out.println("Geçtiniz");
        }else if((not < 50 && katilim > 29)){
            System.out.println("Hem devamsızlık hemde Başarısızlıktan kaldınız");
        } else if (not<50){
            System.out.println("Başarısızlıktan dolayı kaldınız");
        }else {
            System.out.println("Devamsızlıktan dolayı kaldınız");
        }
    }
}
