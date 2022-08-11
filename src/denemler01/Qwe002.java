package denemler01;

import java.util.Scanner;

public class Qwe002 {
    public static void main(String[] args) {
        //Soru 4) Kullanicidan dikdörtgenin kenar uzunluklarini isteyin ve
        // dikdörtgenin kare olup olmadigini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("kenarı giriniz ");
        int a = scan.nextInt();
        System.out.println("kenarı giriniz ");
        int b = scan.nextInt();
        System.out.println("kenarı giriniz ");
        int c = scan.nextInt();
        if ((a == b) && (a == c)) {
            System.out.println("bu bir eş kenar üçgen");
        } else {
            System.out.println("eş kenar üçgen değil");
        }

    }
}
