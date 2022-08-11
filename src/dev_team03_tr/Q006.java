package dev_team03_tr;

public class Q006 {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        if (a != b) {
            System.out.println("İkisi eşit değil");
        } else {
            System.out.println("Eşit");
        }
        System.out.println("==================");

        if (!(!(a == b))) {
            System.out.println("Eşit");
        } else {
            System.out.println("İkisi eşit değil");
        }

    }
}
