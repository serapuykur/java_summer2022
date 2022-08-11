package day45_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataTuru {
    public static void main(String[] args) {

        /*

        Collections  <data turunu> nu object secmeniz durumunda Collectiona farkli data turlerinden
        objeler koymamiza izin verir
        Bu depolama acisindan bize esneklik saglar
        ancak islem yaparken tum objeleri Object olarak tanimladigimizdan
        cok fazla casting yapmamiz gerekebilir.
         */
        List<String> liste=new ArrayList<>();
        //liste.add(5);//eklenmez
        //liste.add(true);//olmaz

        List<Object>list=new ArrayList<>();
        list.add(5);//eklenmez
        list.add(true);//olmaz
        list.add('s');//olmaz
        list.add("Ali");//olmaz
        System.out.println(list);//[5,s,true,Ali]
        list.set(0,list.get(3)+"Can");
        list.set(2,!(Boolean)list.get(2));

        // list.set(0,list.get(0)+5);
        list.set(0,(Integer)list.get(0)+5);
        System.out.println(list);

        System.out.println(list);

        Set<Object> set1=new HashSet<>();
        set1.add(5);
        set1.add(true);
        set1.add('5');
    }
}
