package day36_inheritanceDateTypeKullanimi;

public class APersonel {
    String isim="isim belirtilmedi";
    String soyisim="Soyisim belirtilmedi";
    String departmant="departman belirtilmedi";

    protected  void maas (){
        System.out.println("tum personelimiz maas alir");
    }
    protected  void sigorta(){
        System.out.println("tum personelimiz sigorta yapilir");
    }
}
