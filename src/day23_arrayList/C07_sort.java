package day23_arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C07_sort {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        Collections.sort(urunler);//collections urunleri siralar
        System.out.println(urunler);//[cay, cekirdek, ikram, nutella]//sozluk gibi siralar

        //list ile gelen sort methodunda siralama ozelligini girmek gerekiyor
        // bunun yerine collactions classindan sort methodunu kullaniyiruz
        //bu method listemizi naturel ordere gore yani dogal siralar

    }
}
