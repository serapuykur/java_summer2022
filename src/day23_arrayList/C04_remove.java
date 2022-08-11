package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        /* remove() iki sekilde kullanilir
        1-objeyi yazip silmesini istersek bize boolean sonuc doner true/false
        2-index girersek bu defada o indexteki elemani siler ve bize silinen elemani dondurur
         */

        System.out.println(urunler);//[nutella, ikram, cekirdek, cay]
        System.out.println(urunler.remove("ikram"));//true
        System.out.println(urunler);

        System.out.println(urunler.remove("Hobby"));//false
        System.out.println(urunler);//[nutella, cekirdek, cay]

        //ikinci yontemde index metodu girelim

        System.out.println(urunler.remove(1));//cekirdek
        System.out.println(urunler);//[nutella,cay]

        //olmayan bir indexi silmeye calisirsak

        System.out.println(urunler.remove(3));//rte==>olmayan index
    }

}
