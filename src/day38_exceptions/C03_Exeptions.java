package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exeptions {
    public static void main(String[] args) {
        //marketteki tum urunleri bir arrayda tuutgunuzu varsayalim
        //kullaniciya index sorup o indexteki urunu yazdiran bir prog yazdiralim
        //  Kullanici urun sayiisindan buyuk bir index girerse
        //exeption vermesini  onune gecelim

        String[] urunler = {"Nutella", "Cokokrem", "Sut", "Cay", "Findik"};

        Scanner scan;
        System.out.println("Istediginiz urunun sira nosunu giriniz");
        int istenenSira=0;
        boolean kontrol=true;
        while (kontrol){


        try{
            scan=new Scanner(System.in);
            istenenSira= scan.nextInt();
            new Scanner(System.in);
            kontrol=false;
        } catch (InputMismatchException deneme) {
            System.out.println("urun indexi icin bir tam sayin girimeniz gerekli");
            System.out.println("deneme");
        }
        }
        /*
          Marketteki tum urunleri bir array'de tuttugumuzu varsayalim
          Kullaniciya index sorup, o index'deki urunu yazdiran bir
          program hazirlayalim
          Kullanici urun sayisindan buyuk bir index girerse
          exception vermesinin onune gecelim

         */


        try {
            System.out.println("Aradiginiz urun : "+urunler[istenenSira-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz sira listemizde bulunmuyor"+
                    "sira numarasi en fazla 5 olabilir");

        }
    }
}