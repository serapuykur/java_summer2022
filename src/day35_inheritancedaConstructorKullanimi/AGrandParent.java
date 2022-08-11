package day35_inheritancedaConstructorKullanimi;

public class AGrandParent  {
    protected String isim="Grandpa ismi belirtilmedi";
    protected int yas=10;
    /*
    her clssta gorunmese bile bir constructor vardir bu clastan obje olusturmak
    istedigimizde default construtor devreye girecektir

    default constructoru gozlemleyemeyecegimiz icin onun yerine kullanilabilecek
    parametresiz constructor olusturalim
 AGrandParent

     */

    protected String granpaKlupAdi="Grandpa Klubu";
    AGrandParent (){
        System.out.println("Grandpa constructor calisti");
    }



}
