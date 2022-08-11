package day24_arrayLists_ForEachList;

import java.util.ArrayList;
import java.util.List;

public class C06_ForeachLoop {
    public static void main(String[] args) {
        int [] arr={2,3,4,6,23,6,8,9,1};
        List<Integer> liste=new ArrayList<>();
        //arraydaki tum elemanlari inceleyelim tek sayi olanlari liste atalim

        for (int each:arr//gelecek datalain turu loop icinde ne isim verdigim ve nereden aldigim
             ) {
           if(each%2==1){
               liste.add(each);
           }
        }
        System.out.println(liste);//[3, 23, 9, 1]
    }
}
