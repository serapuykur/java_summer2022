package dev_team03_tr;

public class Q011 {
    public static void main(String[] args) {
        int y = 8;
        System.out.println((y > 5) ? (y < 10 ? 2 * y : 3 * y) : (y > 10 ? 2 + y : 3 + y));  //16
        y = 12;
        System.out.println((y > 5) ? (y < 10 ? 2 * y : 3 * y) : (y > 10 ? 2 + y : 3 + y));  //36
        y = 5;
        System.out.println((y > 5) ? (y < 10 ? 2 * y : 3 * y) : (y > 10 ? 2 + y : 3 + y));  //8

    }
}
