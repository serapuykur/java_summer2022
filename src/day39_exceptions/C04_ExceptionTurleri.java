package day39_exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) throws InterruptedException {
        String str;
        /*
        System.out.println(str);
        deger atamasi yapmadan bir variableyi kullanmaya calisirsaniz java compile time de farkeder
        ve size izin vermez

         */
        str=null;
        System.out.println(str);//calisir ve konsolda null yazar
        //System.out.println(str.length());//nulPointerException aliriz bu da RUNtime exception

        Object obj="Java Java Java";
        Integer sayi=(Integer)obj;//classCastException
        /*
        String str2="hava civa";
        Integer sayi2=str2;

        Java bazi casting islemlerine compile timede izin vermez
        Ancak bazen syntex uygun olabilir
        bu durumda java kodun calsimasina itiraz etmez
         */

        Thread.sleep(5000);

    }
}
