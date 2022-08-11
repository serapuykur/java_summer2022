package day26constructor;

import day25Constructor.Car;

public class ArabaRunner {
    public static void main(String[] args) {
        //bir onceki car clasindan obje olusturralim
        //farkli bir packagedeki
        Car car1=new Car();
        System.out.println(car1.fiyat);
        //araba clasindan bir obje olusturdugumuzda  eger default

        Araba araba1=new Araba();
       araba1.fiyat=100000;
       araba1.marka="Mercedes";
       araba1.yil=2010;
       araba1.model="C180";
        System.out.println(" Araba1 bilgileri\nMarka : "+araba1.marka +"\nModel:"+
                araba1.model+"\nYil:"+araba1.yil+"\nFiyat"+araba1.fiyat);

        Araba araba2=new Araba("BMV","5.20",2011,15000);
        /*
        eger bir objeyi olustururken bazi ozelliklerini argument olarak belirtip o ozelliklerde bir ob
        obje olusturmak istersek java itiraz eder
        cunku; her classta default contrutor vardir ama o da paramaetresidir
        bizim yeni ve parametreli contruvctorlara ihtiyacimiz var.
         */
        System.out.println(" Araba2 bilgileri\nMarka : "+araba2.marka +"\nModel:"+
                araba2.model+"\nYil:"+araba2.yil+"\nFiyat"+araba2.fiyat);

        Araba araba3=new Araba("Opel","Astra",2015,78000);
        System.out.println(" Araba3 bilgileri\nMarka : "+araba3.marka +"\nModel:"+
                araba3.model+"\nYil:"+araba3.yil+"\nFiyat"+araba3.fiyat);

        Araba araba4=new Araba("Audi","A5",2020,50000);
        System.out.println(" Araba4 bilgileri\nMarka : "+araba4.marka +"\nModel:"+
                araba4.model+"\nYil:"+araba4.yil+"\nFiyat"+araba4.fiyat);

    }
    }

