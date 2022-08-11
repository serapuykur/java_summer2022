package day39_exceptions;

import java.util.Scanner;

public class C05_illegalArgumentException {
    public static void main(String[] args) {
        //kullanicidan yasini isteyiniz
        //kodunuzu kullanici sifirdan kucuk bir sayi girerse
        //exception verecek sekilde yazin

        Scanner scan=new Scanner(System.in);
        System.out.println("yasinizi giriniz");
        int yas=scan.nextInt();


        try {
            if(yas<0){
                throw new IllegalArgumentException();
            }else{
                System.out.println("yasiniz :"+yas);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println("yas negatif olamaz");

        }
    }
}
