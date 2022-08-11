package day25Constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {
    public static void main(String[] args) {

        C01 obj1=new C01();
       // C01:class adi
        //    obj1= objenin adi
        //new= keywoord
        //C01()=constructor==>yapici

        Scanner scan=new Scanner(System.in);
        Random rnd=new Random();
        List<String> list= new ArrayList<>();

        /*
        Javad a bir obje olusturmak icin mutlaka constractor kullanmalisiniz
         */
        System.out.println(obj1.sayi);//0==>default deger atadi javav
        obj1.deneme();//C01 den deneme method calisir
    }
}
