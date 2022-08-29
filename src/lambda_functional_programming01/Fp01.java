package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    public static void main(String[] args) {
        /*
        1-Lambda(functional programming) java 8 ile kullanimaya baslanmistir
        2-functional programming de "ne yapilacak (Wat to do)uzerine yogunlasilir.
        Structured programming
        "nasil yapilacak (How to do)2 uzerine yogunlasir
        3-functional programming Arrays ve collections ile kullanilir.
        4-"EntrySet() methodu ile Map Set` e donusturulerek  functional programming de kullanilabilir

         */

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);
        listElemanlariniYazdir(liste);
        System.out.println();
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariyazdirStructured(liste);
        System.out.println();
        System.out.println("Functional");
        ciftElemanlariyazdirFunctional(liste);
        System.out.println("teklerin kareleri");
        tekElemanlarinKareleriniyazdir(liste);
        System.out.println("tekrarsiz kupler");
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);
        tekrarsizCiftElemanlarinKupununCarpimi(liste);
        getMaxEleman01(liste);
        getMaxEleman02(liste);
        getYedidenBuyukCiftMin(liste);
        getYedidenBuyukCiftMin2(liste);
        getYedidenBuyukCiftMin3(liste);
        getTersSiralamaylaTekrarsizElemanlarinYarisi(liste);
    }

    //1) Ardışık list elementlerini aynı satırda
// aralarında boşluk bırakarak yazdıran
// bir method oluşturun.(Structured)
    public static void listElemanlariniYazdir(List<Integer> list) {
        for (Integer w : list) {
            System.out.print(w + " ");
        }
    }

    // Ardışık list elementlerini aynı satırda
// aralarında boşluk bırakarak yazdıran
// bir method oluşturun.(functional)
    public static void listElemanlariniYazdirFunctional(List<Integer> liste) {
        liste.stream().forEach(t -> System.out.print(t + " "));

     /*
     stream methodu collectiondan elemeanleri akisa dahil etmek  icin ve methodlara ulasmak icin
     kullanilir
      */
    }
    // cift  sayi olan list elemanlarini aynı satırda
// aralarında boşluk bırakarak yazdıran
// bir method oluşturun.(structurn)

    public static void ciftElemanlariyazdirStructured(List<Integer> list) {
        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }


    }

    // cift  sayi olan list elemanlarini aynı satırda
// aralarında boşluk bırakarak yazdıran
// bir method oluşturun(Functional

    public static  void ciftElemanlariyazdirFunctional(List<Integer>list){
        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));

    }
    //3) Ardisik  tek list elemanlarinin karelerini  ayni satirda aralarinda bosluk birakarak
    // yazdiran bir method olusturun(fonctional)

    public static void tekElemanlarinKareleriniyazdir(List<Integer>list){
        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));
                //elemanlarin degerleri degisecekse map()methodu kullanilir
    }

   // Ardisik  tek list elemanlarinin kuplerini tekrarsiz  ayni satirda aralarinda bosluk birakarak
    // yazdiran bir method olusturun(fonctional)
    public static  void tekrarsizTekElemanlarinKupunuYazdir(List<Integer>list){
        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
    }
    //5)tekrarsiz cift elemanlarin karelerinin toplamini hesaplayan bir method olusturun

    public  static  void tekrarsizCiftElemanlarinKareToplami(List<Integer>list){
     Integer toplam= list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0,(t,u)->t+u);
        System.out.println(toplam);
    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKupununCarpimi(List<Integer> list){

        Integer carpim = list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)-> t*u);

        System.out.println(carpim);
    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    //1. Yol:
    public static void getMaxEleman01(List<Integer> list){

        Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, (t,u)-> t>u ? t : u );

        System.out.println(max);
    }

    //2. Yol:
    public static void getMaxEleman02(List<Integer> list){

        Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t,u)->u);

        System.out.println("max = " + max);
    }

        //Ödev
        //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)

    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    //1. Yol:
    public static void getYedidenBuyukCiftMin(List<Integer> list){

        Integer min =  list.
                stream().
                distinct().
                filter(t->t%2==0).
                filter(t->t>7).
                reduce(Integer.MAX_VALUE,(t,u)-> t<u ? t : u);

        System.out.println(min);
    }

    //2. Yol:
    public static void getYedidenBuyukCiftMin2(List<Integer> list){

        Integer min = list.
                stream().
                distinct().
                filter(t->t%2==0).
                filter(t->t>7).
                sorted(Comparator.reverseOrder()).
                reduce(Integer.MAX_VALUE,(t,u)->u);

        System.out.println(min);
    }
    //3. Yol:
    public static void getYedidenBuyukCiftMin3(List<Integer> list){

        Integer min = list.
                stream().
                filter(t->t%2==0).
                filter(t->t>7).
                sorted().
                findFirst().
                get();
        System.out.println(min);
    }



//10)ters siralama ile tekrarsizve 5 ten buyuk elemanlarin yari degerlerini (elemanin ikiye bolum sonucunu )
    //bulan bir method yaziniz

    public static  void getTersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer>list){
        List<Double>sonuc=list.stream().distinct().filter(t->t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sonuc);

    }

}