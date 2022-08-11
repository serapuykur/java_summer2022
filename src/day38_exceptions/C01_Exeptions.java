package day38_exceptions;

public class C01_Exeptions {
    public static void main(String[] args) {
        /*

        //bir sorunla karsilsmayi beklediginiz noktalalrda if else ile
        sorunu yakalayip onunla ilgili cozum uretebilirsiniz
        Ama sorunu herzaman  if else ile cozemeyecegimizden
        java try- catch bloklari olusturmustur
        int a=10;
        int b=0;//aritmaticexaption
        System.out.println(a/b);


         */
        int a=100;
        int b=50;
        int sayac=1;
        while (sayac<1000){
            if(b==0){
                System.out.println("islem yapilirken payda 0 oldu dikkat etmelisiniz");
            }else{
                System.out.println(a/b);
            }
            System.out.println(a/b);
            b--;
            sayac++;
        }

    }
}
