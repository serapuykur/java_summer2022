package day04_datacasting;

public class Decrement {
    public static void main(String[] args) {
        int a = 5;
        int i = 0;
        System.out.println("a = " + a + "   i = " + i); //

        i = ++a;
        System.out.println("a = " + a + "   i = " + i); //

        i = a++;
        System.out.println("a = " + a + "   i = " + i); //

        a = ++a;
        System.out.println("a = " + a + "   i = " + i); //

        i = ++a + a++;
        System.out.println("a = " + a + "   i = " + i); //

        i = ++a + ++a;
        System.out.println("a = " + a + "   i = " + i); //

        a = ++a + ++a;
        System.out.println("a = " + a + "   i = " + i); //

        i = ++a + ++a + a++;
        System.out.println("a = " + a + "   i = " + i); //

        i = a++ + ++a + ++a;
        System.out.println("a = " + a + "   i = " + i); //

        a = ++a + ++a + a++;
        System.out.println("a = " + a + "   i = " + i); //

    }
}
