package day17_nestedForloop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {
        /*Kullanicidan toplanmak uzere sayilar alin
        sayilarin toplami 500`u gecince (500 dahil)
        sayilarin toplamini ve kac sayi toplamdigini
        su sekilde yazdirim

        13 sayi girdiniz ve toplamlari 567

         */
        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int sayi=0;
        int sayac=0;

        while (toplam<500){//&& sayac<10 da yazilabilir
            System.out.println("Lutfen toplamak icin sayi girin");
             sayi=scan.nextInt();
             toplam+=sayi;
             sayac++;
        }
        System.out.println(sayac + "sayi giridniz ve toplamlari :"+toplam);
    }
}
