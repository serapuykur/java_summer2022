package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C07_Lists {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        //list primitieve data turlerini kabul etmez
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(7);//[5,3,7]
        //sadece add () kullanirsak Java sona eklrr
        sayilar.add(2,10);
        System.out.println(sayilar);//[5, 3, 10, 7]

        //add.(index,element)istedigimiz indexe istedigimiz elementi yerlestirir
       // add methodu eski elementleri silmez veya update etmez yeni element ekler
    }
}
