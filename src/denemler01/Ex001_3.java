package denemler01;

import java.util.Scanner;

public class Ex001_3 {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Lutfen gun ismini yaziniz");
//        String gun = scan.next().toLowerCase();

        int a = 10;
        int b = 5;

        if (a < b) {
            System.out.println("B büyük A");
        }else if (a == b) {
            System.out.println("B eşit A");
        } else{
            System.out.println("A büyük B");
        }

    }
}
