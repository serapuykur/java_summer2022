package day17_nestedForloop;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        /*verilen inputa gore yildizlardan olusan bir ucgen olusturun
        ornek input=4 ise
            *
            * *
            * * *
            * * * *

         */

        int input=4;
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
