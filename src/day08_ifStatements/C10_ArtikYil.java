package day08_ifStatements;

import java.util.Scanner;

public class C10_ArtikYil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir yıl giriniz : ");
        int yil = scan.nextInt();

        if (yil % 100 == 0) {
            if (yil % 400 == 0) {
                System.out.println("Artık Yıl");
            } else {
                System.out.println("Artık Yıl Değil");
            }
        } else {
            if (yil % 4 == 0) {
                System.out.println("Artık Yıl");
            } else {
                System.out.println("Artık Yıl Değil");
            }
        }
    }
}
