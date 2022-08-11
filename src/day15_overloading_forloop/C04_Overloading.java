package day15_overloading_forloop;

public class C04_Overloading {
    public static void main(String[] args) {
        topla(5, 7);//12
        topla(5.2,3);//8.2--->data turune ve siraalanisa bakiyor
        topla(3.4,6.1);//9.5

    }
    //Java hangi methodun calisacagina karar verirken optimizasyon yapar
    //-eger cast yapmadan kullanabilecegi bir method varsa  onu kullanir
    //-eger cast yapmadan kullanabilecegi bir method yoksa en az cast yaparak kullanabilecegi
    //methodu tercih eder

    public static void topla(int sayi1, int sayi2) {
        System.out.println("iki integerin toplami :" + (sayi1 + sayi2));
    }


    public static void topla(double sayi1, int sayi2) {
        System.out.println("iki integerin toplami :" + (sayi1 + sayi2));
    }

    public static void topla(double sayi1, double sayi2) {
        System.out.println("iki integerin toplami :" + (sayi1 + sayi2));
    }


    }

