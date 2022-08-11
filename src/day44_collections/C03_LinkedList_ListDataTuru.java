package day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C03_LinkedList_ListDataTuru {
    public static void main(String[] args) {
        LinkedList<String> ll1=new LinkedList();
        LinkedList ll2=new LinkedList();
        Queue<String> ll3=new LinkedList<>();
        Deque<String>ll4=new LinkedList<>();
        ll2.add("Berk");
        ll2.add("Done");
        ll2.add("Serap");
        ll2.add("Yusuf");
        System.out.println();
        ll2.remove(3);//yusuf
        System.out.println(ll2.remove("Kemal"));//false
        ll2.set(1,"serap");
        System.out.println(ll2);//[Berk ,serap,enes]
        ll1.add("Berk");
        ll1.add("ismail");
        System.out.println(ll1);//[Berk,Ismail]

        ll2.retainAll(ll1);//ll2 deki tum elementlri ll1 ile karsilastirir
                            //ll1 de olmayanlari siler
        System.out.println(ll2);//[Berk]

        System.out.println(ll2.hashCode());//2066939
        ll2.add("fatih");
        System.out.println(ll2.hashCode());//131726141

    }
}
