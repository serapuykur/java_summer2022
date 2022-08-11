package day42_abstractClass_interfacess;

import java.util.ArrayList;
import java.util.List;

public interface I02_Interfaces {
    /*
    interface bir clas degildir
    Abstract claslar Javada abstraction yani( soyutlastirma/kural koyma) islemini yapiyordu
    ancak abstract bir clasta abstract olmayan methodlar da olmayabilir
    bu da full abstraction yapmaya izin vermez

    Eger java da icinde hic concrete method olmasin dedigimiz bir clas olusturmak
     istiyorsaniz bunu clas degil
    interface yapmalisiniz
   1- ***interfaceler de concrete method OLMAZ
   2-*** interfaceler full abstraction yaptigindan Interfacelerden obje olusturulamaz

   hatirladiginiz gibi interface olan listten direk obje olusturamiyorduk.
   List<String> liste =new List<>();
   bunun yerine constractoru listin childi olan
   Arraylist` den seceriz

    List<String>list2=new ArrayList<>();
    3-*** Claslarda bir chil birden fazla parent edinemez
    Ancak interfacelerde concrete method olmadigindan
     biz her methodu child classda override etmk zorundayiz
     Override ederken kimin soyledigini override ettigimizin onemi yok
     4-*** interfaceler neyin yapilmasi gerektigini soyler
     ama nasil yapillacagina karismaz

     */
    int SAYI=30;
    String ISIM ="Yildiz koleji";


}
