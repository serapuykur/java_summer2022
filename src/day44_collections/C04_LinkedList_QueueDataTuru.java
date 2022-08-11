package day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDataTuru {
    public static void main(String[] args) {


        Queue<String> ll3 = new LinkedList<>();
        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("Hpolat");
        ll3.add("Kadir");

        //Queue kuyruk demektir sira onemlidir gelen sona gelir giden bastan gider

        System.out.println(ll3);//[Adem,zeynep,hpolat,kadir]
        System.out.println(ll3.remove());//adem
        System.out.println(ll3);//[zeynep,Hpolat,kadir
        System.out.println(ll3.remove("hpolat"));//true
        System.out.println(ll3);//[zeyneep,Kadir]
        System.out.println(ll3.element());//zeynep
        System.out.println(ll3.peek());//zeynep

        Queue<String> ll4 = new LinkedList<>();
        //System.out.println(ll4.element());//hata verdi throw exception  Nosucheelememt
        System.out.println(ll4.peek());//null

        //peek ve element silmeden ilk elementi bize dondurur
        //aralarindaki fark bos liste olursa  peek null element exception firlstir

        ll3.offer("Ahmet");
        System.out.println(ll3);//[zeynep,kadir,ahmet
        ll3.offer("sefa");
        System.out.println(ll3);//[zeynep ,kadir,ahmet]
        System.out.println(ll3.poll());//zeynep
        System.out.println(ll3);//[kadir,ahmet,sefa]

        //System.out.println(ll4.remove());//excetion bos element
        System.out.println(ll4.poll());//null


    }
}