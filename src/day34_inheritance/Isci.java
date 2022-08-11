package day34_inheritance;

public class Isci extends Personel {

    /*

    normal hayatimizda parent cocuk sahibi olmaya karar verebilir
    Javada ise child classlar ozelliklerini inherit etmek istedikleri clasi
    kendilerine parent edinirler

    mesela isci clasini olusturunca nelere ihtiyaci var diye dusunsek personel
    clasindakitum variable ve metodlara ihtiyaci oldugunu gorebiliriz.bu  durumda yeniden
    o variable ve metodlari olusturmak yerine oersonel clasini kmdimize
    parent ediniriz.

    bir classi parent edinmek icin ne yapmaaliyiz extends keywoordunu kullanmaliyiz

    ===> Vir class baska bir clasi parent edindiginde
    1=parent clastaki tum ozelliklere(variable = method)otomatik olarak sahip olur
    2= parent classtaki ozelliklerden bazilarini kendine uyarlayabilir
    3= parent classta olmayan bazi yeni ozellikler olusturabilir( variable+ method gibi)
    Not= parent clastaki ozelliklerden hicbirini reddedemez ama degistirebilir
     */
    int personelNo=1001;
    public static void main(String[] args) {

        Isci isci1=new Isci();
        System.out.println(isci1.isim);//isim belirtilmedi kendi clasimizda isim variablesi yok onu icin
        // parente gidiyoruz
        //
        isci1.isim="Selim";
        System.out.println(isci1.isim);

        System.out.println(isci1.personelNo);//1001 yazar kendi clasimizda varsa onu kullaniriz
        //parent clasa gitmeye gerek yok
        isci1.maas();//Isciler minimum 15 euro saat ucreti alirlar"
       isci1.mesai();
        isci1.ozelSigorta();
    isci1.fazlaMesaiUcreti();
    }
    public  void maas(){
        System.out.println("Isciler minimum 15 euro saat ucreti alirlar");
    }

    public void ozelSigorta(){
        System.out.println("iscilerden isteyene %50 indirimli ozel sigorta yaptirilir");
    }

    public void mesai(){
        System.out.println("isciler 5 saat calisr");
    }


}
