package day08_ifStatements;

import java.util.Scanner;

public class C09_ArtikYil {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir yıl giriniz : ");
        int yil = scan.nextInt();

        if (((yil % 4 == 0) && (yil % 100 != 0)) || (yil % 400 == 0)) {
            System.out.println("ARTIK YIL");
        } else {
            System.out.println("ARTIK YIL DEĞİL");
        }
    }
}
