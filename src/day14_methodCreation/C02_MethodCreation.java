package day14_methodCreation;

import day13_MethodCreation.C04_methodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {

        //verieln 3 basamakli bir sayinin
        // rakamlari toplamini yazdiran bir method olusturalim

        int input=423;
        rakamlariTopla(input);
        C04_methodCreation.topla(6,3);


    }

    public static void rakamlariTopla(int input) {

        int birlerBasamagi=0;
        int rakamlartoplami=0;
        int girilenSayi=input;//int temp de denebilir

        birlerBasamagi=input%10;
        rakamlartoplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlartoplami+=birlerBasamagi;
        input/=10;


        birlerBasamagi=input%10;
        rakamlartoplami+=birlerBasamagi;
        input/=10;

        System.out.println("Girdiginiz"+ input+" sayisinin rakamlar toplami :" +input);


    }
}