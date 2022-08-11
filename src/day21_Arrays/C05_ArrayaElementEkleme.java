package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayaElementEkleme {
    public static void main(String[] args) {
        //verilen bir arraya yeni bir element ekleyen method olusturun

        String[] sinifListesi={"Ali Can"};
       String EklenecekIsim="Murat Babayigit";

       sinifListesi=elemanEkle(sinifListesi,EklenecekIsim);
        System.out.println(Arrays.toString(sinifListesi));
    }

 public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {

        String[] yeniSinifListesi=new String[sinifListesi.length+1];//[null,null]

     //eski listeden 1 eleman fazla uzunlukta yeni bir array olusturdum
     for (int i = 0; i <sinifListesi.length ; i++) {

         yeniSinifListesi[i]=sinifListesi[i];

     }
     //oncelikle eski listedeki tum elemanlari yeni listeye ekledim
     yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekIsim;


        //son indexe ise eklenecek ismi atadim
        return yeniSinifListesi;
    }
}
