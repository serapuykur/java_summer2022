package day48_maps_TheEnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_NestedMaps {
    public static void main(String[] args) {
        /*

        eger bir elementle

        ornek olarak dunku mapimizi bir map olarak olusturalim
         */

        Map<String,String> ogr101=new HashMap<>();
        ogr101.put("isim","enes");
        ogr101.put("soyisim","cem");
        ogr101.put("brans","tester");

        Map<String,String> ogr102=new HashMap<>();
        ogr102.put("isim","taha");
        ogr102.put("soyisim","emre");
        ogr102.put("brans","jDev");

        Map<String,String> ogr103=new HashMap<>();
        ogr103.put("isim","derya");
        ogr103.put("soyisim","deniz");
        ogr103.put("brans","Devops");

        Map<Integer,Map<String,String>>ogrencinestedMap=new HashMap<>();
        ogrencinestedMap.put(101,ogr101);
        ogrencinestedMap.put(102,ogr102);
        ogrencinestedMap.put(103,ogr103);

        Set<Map.Entry<Integer,Map<String,String>>> ogrenciEntrySeti=ogrencinestedMap.entrySet();

        for (Map.Entry each:ogrenciEntrySeti
             ) {
            System.out.println(each);

        }
        //102 nolu kisinin ismini yazdiralim

        System.out.println(ogrencinestedMap.get(102).get("isim"));//taha



    }
}
