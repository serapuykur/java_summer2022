package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {

        /*
        javada bilgisayarimizdaki bir dosyaya erismek istiyorsak
        FileinputStream claasindan yardim aliriz

        Ayni sekilde Javadan bilgisayarimizdaki bir dosyaya ekleme veya update yapmak istersek
        FileOutputStream clasindan yardim
         */

        FileInputStream fis=new FileInputStream("src/day39_exceptions/Test.txt");

        /*

        goruldugu gibi compile timede altini kirmizi cizen her durum cte degildir.
        javada bazi exceptionlarda compile time exceptiondur.
        ozellikle dosya okuma ve yazma ile ilgili exceptionlar compile time exceptiondur

        Compile Time Exception olustugunda Java cozom icin 2 ihtimal onerir
        1-try- catch ile cevrelemek
        2-method signature`ine throws keywoord ile bekleenen exception turunu yazmak

        throws exception,sadece olayin farkinda oldugumuzun declarasyonudur
        exceptionun handel edilmesinde hicbir rolu yoktur
        yani try catch ile handel(handle )ettigimiz control altina aldigimiz exceptionlarda kod calismaya
        devam ediyordu
        ancak throws exception yazdiguimizda java bir exceptinla karsilasrisa hicbirsey yapmamisiz gibi hata
        mesaji yayinlayip calismayi durdurur.

         */
    }

}
