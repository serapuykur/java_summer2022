package day15_overloading_forloop;

public class C01_ReturnMethod {
    public static void main(String[] args) {
        //verilen iki sayiyi carpip sonucu bize donduren bir method yapin//return ve ya dondursun derlerse baska
        //yazdiran derse void
        //return edilen sey bir veriableye atanmali
        int sayi1=10;
        int sayi2=5;
        int sonuc=carpGetir(sayi1,sayi2);
        System.out.println("illa da sonucu goreyim diyenlere :"+sonuc);//50-->burda soutta yazip alsak da olur yazmasak da




    }

    public static int carpGetir(int sayi1, int sayi2) {
        int sonuc=sayi1*sayi2;
        //return sonuc;//return boyle de yapilabilir

        return sayi1*sayi2;//return kelimesi elde edilen sonucu main metoda return eder ,dondurur

    }
}
