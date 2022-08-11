package day04_datacasting;

public class Z01_DataCasting {
    public static void main(String[] args) {
        /*
            02 Data Turleri ve data kullanimi.pdf
            Sayfa 23 Sorular
        */

        // 1-  byte veri tipinde bir değişken oluşturun, short, int, float ve
        //     double data tiplerinde birer değişken oluşturup adım adım widening yapın ve yazdırın

        byte byt1 = 125;
        System.out.println("Byte tipi değişken :" + byt1);
        short sayi1 = byt1;
        System.out.println("Short tipi değişken :" + sayi1);
        int sayi2 = sayi1;
        System.out.println("Integer tipi değişken :" + sayi2);
        float sayi3 = sayi2;
        System.out.println("Float tipi değişken :" + sayi3);
        double sayi4 = sayi3;
        System.out.println("Double tipi değişken :" + sayi4);

        System.out.println("==========================");

        // 2- int veri türünde bir değişken oluşturun ve adım adım narrowing yapın ve yazdırın

        int s1 = 34567;
        System.out.println("Integer tipi değişken :" + s1);
        short s2 = (short) s1;
        System.out.println("Short tipi değişken :" + s2);
        byte s3 = (byte) s2;
        System.out.println("Byte tipi değişken :" + s3);

        System.out.println("==========================");

        // 3 - Float data türünde bir variable oluşturun ve yazdırın

        float pi = (float) 3.1415;
        System.out.println("Pi sayısı : " + pi);

        System.out.println("==========================");

        // 4- double 255.36 sayısını int’a ve sonra da oluşturduğunuz int sayıyı byte’a çevirip yazdırın

        double say1 = 255.36;
        System.out.println("Double tipi değişken :" + say1);
        int say2 = (int) say1;
        System.out.println("Integer tipi değişken :" + say2);
        byte say3 = (byte) say2;
        System.out.println("Byte tipi değişken :" + say3);

        System.out.println("==========================");

        // 5- int 2 sayıyı birbirine böldürün ve sonucu yazdırın

        int a = 15;
        int b = 7;
        int c = a / b;
        System.out.println("Bölme sonucu :" + c);

        System.out.println("==========================");

        // 6- int bir sayıyı double bir sayıya bölün ve sonucu yazdırın

        a = 16;
        double d = 4;
        System.out.println("Bölme sonucu :" + (a / d));

        System.out.println("==========================");

        // 7- Farklı data tipleri ile işlem yapıp, sonuçlarını yazdıralım




    }
}
