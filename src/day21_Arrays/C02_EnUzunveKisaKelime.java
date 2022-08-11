package day21_Arrays;

public class C02_EnUzunveKisaKelime {
    public static void main(String[] args) {
        //verilemn bir string arrayda
        //en uzun ve en kisa stringleri yazdiran bir method yaz


        String[] isimler = {"erdal", "Onur", "Mehmet", "Mihrican"};

        enUzunVeKisayiYazdir(isimler);
    }

    public static void enUzunVeKisayiYazdir(String[] isimler) {

        String enUzunKelime = isimler[0];
        String enKisaKelime = isimler[0];

        for (int i = 1; i < isimler.length; i++) {
            if (isimler[i].length() > enUzunKelime.length()) {
                enUzunKelime = isimler[i];


                if (isimler[i].length() < enKisaKelime.length()) {
                    enUzunKelime = isimler[i];
                }

            }
        }
        System.out.println(enUzunKelime);
        System.out.println(enKisaKelime);
    }
}