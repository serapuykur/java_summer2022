package day15_overloading_forloop;

public class C08_Factoryel {
    public static void main(String[] args) {
        /* input olarak verilen bir tamsayi icin factoryel hesaplayayip yazdiran bir method yazdirin
        verilen sayi   ,negatif veya  20 den buyukse
        girilen sayinin factoryeli hesaplanamaz uyarisi yazdirin
         */

        int input = 10;
        faktoryelHesapla(input);
    }

    public static void faktoryelHesapla(int input) {
        int faktoryel=1;

        if(input<0 || input>20){
            System.out.println("girilen sayinin factoryeli hesaplanamaz ");
        }else if(input==0){
            System.out.println("0!=1`dir");
        }else{
            for (int i = 1; i <=input ; i++) {
                faktoryel*=i;

            }
            System.out.println("faktoryel degeri :"+faktoryel);
        }

    }
}
