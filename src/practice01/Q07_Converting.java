package practice01;

import java.util.Scanner;

public class Q07_Converting {
    /*
        galonu litreye ceviren bir java programi yaziniz
            1 gallon = 3.785 litre
        litreyi galona ceviren bir java programi yaziniz
            1 litre = 1/3.785 gallon

        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
        // formül
        // c = (f-32)*5/9
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Litreye çevirilecek galon değerini giriniz : ");
        double galon = scan.nextDouble();
        System.out.println(galon + " Galon = " + (galon * 3.785) + " Litre 'dir");

        System.out.print("Galona çevirilecek litre değerini giriniz : ");
        double litre = scan.nextDouble();
        System.out.println(litre + " Litre = " + (litre / 3.785)+" Galon 'dur");

        System.out.print("Santigrat dereceye çevirilecek fahrenhayt değerini giriniz : ");
        double fahrenhayt = scan.nextDouble();
        System.out.println(fahrenhayt + " Fahrenhayt = " + ((fahrenhayt - 32) * 5 / 9)+" Santigrat 'tır");

    }
}
