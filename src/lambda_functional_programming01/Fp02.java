package lambda_functional_programming01;

import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {

    /*
  1)  t-> "Logic",(t,u)->"Logic"
    bu yapiya Lambda expession

  2)  Functional programming kapsaminda Lambda expession kullanilabilir ama  onerilemz
  Lambda expession yerine "method reference " tercih edilir

  3)"method reference " kullanimi "Class Name :: Method Name"

  Ayni zamanda kendi claslarinizi da kullanabilirsiniz
  ornegin bir Animal classiniz var ve bu class  "eat()"methoduna sahip ==>

     */
    public static void main(String[] args) {
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
        listElemanlariniYazdirFunctional(liste);

        ciftElemanlariniYazdirFunctional(liste);
        System.out.println();
        TekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsiztekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsiztekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami1(liste);
        tekrarsizCiftElemanlarinKareToplami2(liste);
        tekrarsizCiftElemanlarinKuplerinincarpimi(liste);
        getMaxEleman(liste);
        System.out.println();
        getMinEleman(liste);//2
        yedidenBuyukCiftMin(liste);
        tersSiralamaylaTekrarsizElemanlarinYarisi(liste);//[65.5, 5.0, 4.5, 4.0]

    }

    //1)ardisik list elemanlarini ayni satirda aralarinda bosluk birakacak
    public static void listElemanlariniYazdirFunctional(List<Integer> list) {
        list.stream().forEach(Utils::ayniSatirdaBosluklayazdir);
    }
//2)Ardisik cift list elemanlarini aynisatirda aralarinda bosluk birakarak yazdiran bir method olusturun(functional

    public static void ciftElemanlariniYazdirFunctional(List<Integer> list) {

        list.stream().filter(Utils::ciftElemaniSec).forEach(Utils::ayniSatirdaBosluklayazdir);

    }
    //3)Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.(Functional)

    public static void TekElemanlarinKareleriniYazdir(List<Integer> list) {
        list.stream().filter(Utils::tekElemaniSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklayazdir);

    }

//4) //Ardışık tek list elemanlarının küplerini tekrarsız olarak aynı satırda
// aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekrarsiztekElemanlarinKupunuYazdir(List<Integer> list) {
        list.stream().distinct().filter(Utils::tekElemaniSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklayazdir);
    }
    //5)tekrrsiz cift elemanlarin karelerinin toplamini hesaplayan bir method olusturun

    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list) {
        Integer toplam = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(0, Math::addExact);
        System.out.println(toplam);
    }

    //2.yol
    public static void tekrarsizCiftElemanlarinKareToplami1(List<Integer> list) {
        Integer toplam = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(Math::addExact).get();
        System.out.println(toplam);
    }

    // 3.yol
    public static void tekrarsizCiftElemanlarinKareToplami2(List<Integer> list) {
        Integer toplam = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(0, Integer::sum);
        System.out.println(toplam);

    }

    //6)) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKuplerinincarpimi(List<Integer>list){
     Integer carpim=list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::kupunuAl).reduce(1,Math::multiplyExact);
        System.out.println(carpim);
    }
    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    public static void getMaxEleman(List<Integer>liste){
       Integer max= liste.stream().distinct().reduce(Math::max).get();
        System.out.println(max);

    }
    ///Ödev
    //    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)
    public static void getMinEleman(List<Integer>liste){
        Integer min= liste.stream().distinct().reduce(Math::min).get();
        System.out.println(min);

    }

    ////9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    public static void yedidenBuyukCiftMin(List<Integer>liste){
        Integer min=liste.stream().distinct().filter(t->t>7).filter(Utils::ciftElemaniSec).reduce(Math::min).get();
        System.out.println(min);
    }
    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public static void tersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer>list){
        List<Double>sonuc =list.
                stream().//gerekli methodlari kullanmamizi saglar
                distinct().//tekrarli olanlari almaz
                filter(t->t>5).//kosula gore filtreleme yapar
                map(Utils::yarisiniAl).//her bir elemanin degerini degistirmeye yarar
                sorted(Comparator.reverseOrder()).//dogal siralama yapar
                collect(Collectors.toList());//elemanlari collectiona ceviririr
        System.out.println(sonuc);
    }


}


