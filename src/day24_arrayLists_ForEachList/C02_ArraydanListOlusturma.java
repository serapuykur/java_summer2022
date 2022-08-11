package day24_arrayLists_ForEachList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydanListOlusturma {
    public static <Ramdom> void main(String[] args) {
        /*
        soru= icinde 200 tane 100 den kucuk pozitif tam sayi olan bir list olusturun
         ve kullanicidan bir sayi isteyip listede
        var olup olmadigini kullaniciya yazalim
         */

        Random rnd = new Random();//0 ile 1 arasinda sayi uretir.
        int sayi = 0;
        List<Integer> sayiListesi = new ArrayList<>();

        while (sayiListesi.size() < 200) {
            sayi = rnd.nextInt(1000);
            if (!sayiListesi.contains(sayi)) {
                sayiListesi.add(sayi);
            }

        }
        System.out.println(sayiListesi);

        Boolean bildiMi = false;
        int tahminSayisi = 1;
        Scanner scan = new Scanner(System.in);

        while (!bildiMi) {//bildi mi ==false
            System.out.println("Lutfen bir sayi tahmininde bulunun");
            sayi = scan.nextInt();
            if (sayiListesi.contains(sayi)) {
                System.out.println("tebrikler" + tahminSayisi + " adet tahminde listeden bir sayi buldunuz ");
                bildiMi = true;
            } else {
                System.out.println(tahminSayisi + "adet sayi soylediniz hicbiri listede yok");
                tahminSayisi++;
            }
        }
    }
}