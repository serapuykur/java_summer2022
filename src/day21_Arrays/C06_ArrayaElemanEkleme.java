package day21_Arrays;

import java.util.Arrays;

public class C06_ArrayaElemanEkleme {
    public static void main(String[] args) {
        //Co5 teki methodu kullanarak    arraya  elemean ekleyelim


        String [] takimListesi={"Suleyman","Osman"};

        String eklenecekIsim="Talha";

        takimListesi=C05_ArrayaElementEkleme.elemanEkle(takimListesi,eklenecekIsim);

        System.out.println(Arrays.toString(takimListesi));
    }
}
