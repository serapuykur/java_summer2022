package practice01;

import java.util.Scanner;

public class Q09_Scanner02 {
    // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
    // ve yasadiklari yeri seviyorlarsa
    // bu bilgiyi yazdirin

    // next() only can read the first word
    // nextLine() can read the whole line
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("adinizi giriniz :");
        String isim = scan.nextLine();

        System.out.println("memleketinizi giriniz :");
        String memleket = scan.nextLine();

        System.out.println("neredesiniz giriniz :");
        String konum = scan.nextLine();

        System.out.println("yasinizi giriniz :");
        int yas = scan.nextInt();

        System.out.println("boyunuzu giriniz :");
        double boy = scan.nextDouble();

        scan.nextLine();

        System.out.println("yasadiginiz yeri seviyormusunuz? ");
        String sev = scan.nextLine();

        if (sev.equals("evet")) {
            System.out.println("isim = " + isim);
            System.out.println("memleket = " + memleket);
            System.out.println("konum = " + konum);
            System.out.println("yas = " + yas);
            System.out.println("boy = " + boy);
        }
    }
}
