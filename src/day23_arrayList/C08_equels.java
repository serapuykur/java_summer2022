package day23_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C08_equels {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        List<String> urunler2=new ArrayList<>();
        urunler2.add("ikram");
        urunler2.add("nutella");
        urunler2.add("cay");
        urunler2.add("cekirdek");

        System.out.println(urunler.equals(urunler2));//false
        Collections.sort(urunler);
        Collections.sort(urunler2);//true



    }
}
