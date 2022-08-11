package day34_inheritance;

public class Personel {
    /*
    eger parent class olacak sekilde tasarladiginiz bir class varsa veya ilerde  bu clasi parent
    yapmak isteyenelr olabilir derseniz o za,mn variable ve metodlari  access modifierini PROTECTED
    yapabilirsiniz
     */

   protected int persNo;
   protected String isim="isim belirtilmedi";
   protected String departman="Deparman belirtilmedi";

   protected   void maas(){
        System.out.println("Tum personelin maasi vardir");
    }

    protected  void mesai(){
        System.out.println("Tum personel statusune gore mesai yapar");
    }

    protected  void fazlaMesaiUcreti(){
        System.out.println("personel fazla mesai ucretini statusune gore alir");
    }
}
