package sorular;

import java.util.Scanner;

public class S_001_5 {
    public static void main(String[] args) {
        /*
            Klavyeden adımızı ve soyadınız girmemiz istenmekte ( tek seferde ) eğer ve adımızın ilk harfi büyük
            diğer harfleri küçük olsun, soyadımız tamamen büyük olsun istenmektedir. Değilse bu şekle dönüştürsün
            Eğer ismimiz iki isimli ise kontrol edip ikisinide aynı sekilde yapsın
         */

            Scanner scan = new Scanner(System.in);
            System.out.print("Adinizi ve Soyadinizi giriniz: ");
            String ad = scan.nextLine();
            int ara = ad.indexOf(" ");
            int index = ad.lastIndexOf(" ");

            if (ara != index) {
                ad = ad.substring(0, 1).toUpperCase() + ad.substring(1, ara).toLowerCase() +
                        ad.substring(ara, ara + 2).toUpperCase() + ad.substring(ara + 2,index).toLowerCase()+
                        ad.substring(index).toUpperCase();
            } else {
                // ad = ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase();
                ad = ad.substring(0, 1).toUpperCase() + ad.substring(1, ara).toLowerCase() +
                        ad.substring(ara).toUpperCase();
            }

            System.out.println(ad);
        }
}
