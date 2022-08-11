package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        System.out.println(urunler);
        System.out.println(urunler.indexOf("Ikram"));//1
        System.out.println(urunler);

        //indexof methodu bize bilgi donduren bir methoddur.Listemizi degistirmez

        System.out.println(urunler.lastIndexOf("Ikram"));//1
        //indexof methodu urunu aramaya 0. indexten
        //lastindexof methodu ise aramaya son indexten baslar
        //arama bitip urum bulundugunda
        //ikisi de bulunan urunun indexini verir

        urunler.add("Ikram");
        System.out.println(urunler);//[nutella, ikram, cekirdek, cay, Ikram]
        System.out.println(urunler.indexOf("Ikram"));//4
        System.out.println(urunler.indexOf("Ikram"));//4

        System.out.println(urunler.indexOf("hobby"));//-1
        System.out.println(urunler.indexOf("hobby"));//-1



    }
}
