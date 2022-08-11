package day25Constructor;

public class C01 {
    /*
    java oop o consept kullandigi icin olusturulan her bir clasin
    ihtiyac oldugunda obje uretilmasine uygun dizayn etmis
    ama her classta obje uretilmayeybilir
    bunun icin java ihtyac halinde kullanilmasi icin
    her clasta default bir constructor koymustur.
    ama bu default constructor clastan obje olusturuldugunda
    otomatik olarak calisir
    ornegin bu clasta constructor gorulmamemesine ragmen C02 clasinda
    icinde oldugumuz c01 clasindan bir obje uretebildik

     */
    int sayi;
    public void deneme(){
        System.out.println("Co1 den deneme method calisitir");
    }
}
