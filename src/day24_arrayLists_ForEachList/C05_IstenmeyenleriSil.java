package day24_arrayLists_ForEachList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_IstenmeyenleriSil {
    public static void main(String[] args) {
        //4) Verilen bir array'de istenmeyen harf iceren kelimeleri silip,
// kalan elementleri yeni bir array yapin

        String[] sehirler={"Istanbul","Anlara","mersin","Konya","Kastamonu"};
        String istenmeyenHarf="a";
        List<String> kalanlar=new ArrayList<>();

        for (int i = 0; i < sehirler.length; i++) {
            if(!sehirler[i].contains(istenmeyenHarf)){
                kalanlar.add(sehirler[i]);
            }

        }
        //loop bittiginde istenmeyen harf icermeyen sehirler listeye eklenmis olacak
        System.out.println(kalanlar);
        //yeni bir array olusturup lisyeyi ona aktar

        String[]kalanlarArrayi=new String[kalanlar.size()];
        for (int i = 0; i < kalanlarArrayi.length; i++) {
            kalanlarArrayi[i]=kalanlar.get(i);


        }
        //sehirler arryinin yeni degerini atayalm
        sehirler=kalanlarArrayi;
        System.out.println("sehirlr arrayinin son hali: "+ Arrays.toString(sehirler));// [mersin]
    }
}
