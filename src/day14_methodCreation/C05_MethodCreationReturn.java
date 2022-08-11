package day14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {

        /*eger bir classin icersinde herhangi bir hesaplama yapip bunu da kalici olarak saklmak
        istersek kodumuzu sade ve anlasilir tutmaak icin islemi bir methodda yaapip sonucunu main
        methoda dondurebiliriz
        bu durumda return type`i void olmayan bir methodun sonucunu main methodda
        bir veriableye atama yaparsak
        programin geri kalaninda bu yeni degeri kullanma sansimiz olur


         */
        //kullanicidan sehir ismini  ve dogum tarihini alip
        //bunlari programda kullanacagimiz formatda bize donduren bir method olusturun
        //sehir ismini programimizda buyuk harf olarak
        // tarihi ise 2022-06-30 seklinde kullanmak istiyoruz

        String sehir=sehirAl();
        String tarih=tarihAl();

        System.out.println("Girdiginiz sehir :"+sehir);//ANKARA
        System.out.println("Girdiginiz tarih :"+tarih);//2020-05-03
    }

    public static String sehirAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("sehir giriniz");
        String sehirAdi=scan.nextLine().toUpperCase();
        return  sehirAdi;

    }

    public static String tarihAl() {

        String tarih = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("yil giriniz");
        int yil = scan.nextInt();
        if (yil < 1900 && yil < 2100) {
            tarih = yil + "-";
        } else {
            System.out.println("yil icin gecerli bir sayi yazmalisinzi(1900-2100");

        }
        System.out.println("Kacinci ay oldugunu tamsayi olarak yaziniz");
        int ay = scan.nextInt();
        if (ay <= 0 || ay > 12) {
            System.out.println("Ay no 1-12 arasinda olmalidir");
        } else if (ay < 10) {
            tarih = tarih + "0" + ay + "-";
        } else {
            tarih = tarih + ay + "-";
        }
        System.out.println("Lutfn ayin kacinci gunu oldugunu tamsayi olarak giriniz");
        int gun = scan.nextInt();
        if (gun <= 0 || gun > 31) {
            System.out.println("gun no olarak 1-31 arasinda sayi  girilmelidir");
        } else if (gun < 10) {
            tarih = tarih + "0" + gun;
        } else {
            tarih = tarih + gun;
        }
        return tarih;



        }




    }