package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {
        //tek katli arryalarda arrayi direk yazdiramiyorduk
        //cunku array non primitieve data turudur ve her non primitive data direk yazdirilamayabilir
        //ancak arrayin icerisindeki elementleri direk yazdirabiliyorduk
        //cunku genelde primitive data turu veya string elementler kullaniliyordu
        //multi -dimensioniyel arraylada en dikkat edecegimiz konu ulasmak istedigimmiz elemnentin
        //bir aaay mi yoksa primitive data mi oldugudur


        int[][] sayilar={{1,2,4,5},{3,4}};

        System.out.println(sayilar[0]);//[I@7699a589
        System.out.println(Arrays.toString(sayilar[0]));//[1, 2, 4, 5]

        System.out.println(sayilar[0][1]);//2
        System.out.println(sayilar[1][0]);//3

        System.out.println(Arrays.toString(sayilar));//[[I@7699a589, [I@58372a00]
        System.out.println(Arrays.deepToString(sayilar));//[[1, 2, 4, 5], [3, 4]]

        /*
        arrayi iki sekilde deklare edebiliyorduk
        1.sinde elemanlari direk yazabiliyorduk

        2.outer ve inner arraylarin uzunluklarini belirleyerek olusturebiliriz

        ancak 2. yontemle yaptigimizd ainner arraylarin farkli uzunlukta kalma ihtimali olmaz
        bu ornek icin outr arrayin 3 tane inner arrayi vardir
        herbirn inner arrayin ise 4 er elemani vardir
        eger inner arraylari farkli uzunluklarda olusturmak istiyorsaniz mecburen
         */

    }
}
