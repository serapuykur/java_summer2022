package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste);//[10,20,30]
        //listedeki tum elementleri Index kullanmadan 3 arttirin

        for (Integer each : liste
        ) {
            each += 3;
            System.out.println(each + " ");

        }
        System.out.println(liste);//[10,20,30]

        /*
        java index yapisi olmayan collectionlardaki elementlere ilasmak veya degistirmek icin iterator
        interfacesini olusturmustur

        *** Iterator interface oldugundan ondan obje uretemeyiz
        bunun yerine bize iteratir donduren Liste.iterator()methodunu kullaniyoruz
         */
        System.out.println(liste);//[10,20,30]

        Iterator it1 = liste.iterator();

        System.out.println(it1.next());//10
        System.out.println(it1.next());//20
        System.out.println(it1.next());//30
        // System.out.println(it1.next());//30 dan sonra element kalmadigindan nex()methodu RTE verir

        /*
        iteratorde geri donus yok adim adim sona ulastiktan sonra
        basa donmek istiyorsaniz yeniden bir iterator olusturmaniz gerekir
         */
        //[10,20,30]
        Iterator it2 = liste.iterator();
        //yeni it2 yi kullanarak listenin tum elementlerini degistirelim
        // it2.remove();//exception aldik cunkucunku iteratore bir eleemnt yuklemeliyiz bosta oldugu icin excp firtlatt
        it2.next();
        it2.remove();
        System.out.println(liste);//[20,30]
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();

        System.out.println(liste);//iterator ile elementleri gezip remove yapinca
        //liste kalici olarak degisti

    liste.add(10);
    liste.add(20);
    liste.add(30);
        System.out.println("yeniden liste "+liste);
        Iterator it3= liste.iterator();

        while (it3.hasNext()){
            it3.next();
            it3.remove();
        }
        System.out.println("looptan sonra liste"+liste);//[]

        /*
        goruldugu gibi Iterator kullanarak yapabildigim
        1-tum collection elementlerini yazdirmak
        2-tum collection elementlerini silmek
        bu da bize yetmez
         */


}
    }

