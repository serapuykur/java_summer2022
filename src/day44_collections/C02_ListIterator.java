package day44_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {
    public static void main(String[] args) {
        //soru4=Bir listeki elementleri iterator kullanarak
        //sondn basa dogru yaziniz
        List<Integer> liste=new ArrayList<>() ;
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);
       //sonran basa gelebilmek icin
        //once sona gitmek lazim
        ListIterator lis1= liste.listIterator();
        System.out.println(liste);//[2,13,56,23,45,14,40]

        while(lis1.hasNext()){
            lis1.next();
         //bu loop bizi sona goturur
        }
        while (lis1.hasPrevious()){
            System.out.println(lis1.previousIndex()+" ");
        }
    }
}
