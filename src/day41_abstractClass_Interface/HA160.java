package day41_abstractClass_Interface;

import java.util.*;

public class HA160 extends FMercedes{
    /*
    absttract parent silsilesinden gelen ilk concrete class
     parenti olan tum clastaki abstract methodlari
     concrete hale donusturmek(override)zorundadir

      bu kuralin istisnasi parent claslardan herhangi
       birinde concrete hale donusturulmus abstract methodlardir
     */
    public static void main(String[] args) {
        HA160 araba1=new HA160();
        //concrete bir clastan istedigimiz objeyi  uretebiliriz


        FMercedes arb2=new FMercedes();
        //mercedes de concrete old icin obje olusturabildik

       // EToyota arb3=new EToyota()

         //abstract claslar  constractor barindirir ama obje uretemezler

       // List<String> list=new List<String>() {
        List<String>list2=new ArrayList<>();
        //abstract bir clasin ozelliklerini tasiyan bir obje olusturmak istedigimizde
        //data turunu istedigimiz abstract classconstructoru ise
        // child olan concrate bir clastan seceriz

    }
}
