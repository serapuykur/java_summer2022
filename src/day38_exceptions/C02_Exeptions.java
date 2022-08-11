package day38_exceptions;

public class C02_Exeptions {
    public static void main(String[] args) {
        int a=100;
        int b=50;
        int sayac=1;
        while (sayac<1000){
            //try bblogu yapmaya calistigimiz ama risk oldugunu dusundugumuz
            // islemleri yazmak icin kullanilir
            //catch den sonraki parantez karsilasmayi bekledigimiz exeptions turunu
            //javaya soylemek icin kullanilir
           // catch blogu: javaya soyledigimiz exeptions (istisnai durum gerceklesurse
           // javann yapmasini istedigimiz islem

           try {
               System.out.println(a / b);
           }catch (ArithmeticException e){
               System.out.println("payda 0 oldu ,dikkatli ol");
           }
            b--;
            sayac++;
        }


    }
}
