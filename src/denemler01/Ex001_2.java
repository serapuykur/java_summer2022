package denemler01;

import java.util.Scanner;

public class Ex001_2 {
    public static void main(String[] args) {
        double a = 15;
        double b = 20;
        double dene = 0;
        dene = (a = a + b * 4) / 3;
        System.out.println("a : " + a + " b : " + b + " dene : " + dene);

    }
}
