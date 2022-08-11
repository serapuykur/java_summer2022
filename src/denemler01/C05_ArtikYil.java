package denemler01;

import java.util.Scanner;

public class C05_ArtikYil {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir yıl giriniz : ");
        int yil = scan.nextInt();





        if (yil %4!= 0) {
            System.out.println("Artık Yıl Değil");
        }else if (yil%100!= 0) {
            System.out.println("Artık Yıl");
        } else if (yil%400== 0) {
            System.out.println("Artık Yıl");
        }else{
            System.out.println("Artık Yıl Değil");
        }
    }
}