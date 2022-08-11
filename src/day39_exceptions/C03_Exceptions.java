package day39_exceptions;

public class C03_Exceptions {
    public static void main(String[] args) {
        String str="12345";
        int sayi= 0;
        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Yazdiginiz degr sdece rakamlardan  olusmalidir");
        }catch (Exception e) {
            System.out.println("ongorulemeyen bir hata olustu");
        }
        System.out.println("sayinin karesi :"+sayi*sayi);

        String str1="123a5";
        int sayi1=Integer.parseInt(str);
        System.out.println("sayinin karesi :"+sayi*sayi);
        //kullanicidan string olarak bir deger aliyor ve bunu integere ceviriyorsak
        //numberformatexception karsilasabilecegimiizi ongoruruz
       // nfe aldigimizda kodun durmamasini istiyorsak try catch ile cevreleyeblilirz
        //eger bilmedigim bir exception dah aolusursa kodum durmasin istiyorsak bir kere daha catch cumlesi
        //ekleyip ona da en genis exceptionu yazabiliriz
    }
}
