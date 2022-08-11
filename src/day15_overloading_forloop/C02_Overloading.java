package day15_overloading_forloop;

public class C02_Overloading {
    public static void main(String[] args) {
        /*java da olusturdugumuz methodlsrin isminin yaptigi isler ile uyumlu olmasini siteriz
        mesela bir stringin bir bolumunu almak icin java  2 adet  substring ()methodlari veya
        verilen stringdeki bazi parcalari yenileri ile ddegistrmek icin  2 adet replace()var
        java ayni isimde birden fazla metho varsa hagisini kullanacagina parametre sayisi
        ve paramaetrelerin data turune gore karar verir
         */

        String str="Bu Java ogrenilecek baska yolu yok";
        str.substring(2);
        str.substring(2,4);
        str.replace('c','v');
        str.replace("J","H");
        //str.replace(5,8);

      /*  Ayni isimde ama farkli method'lari olusturmak icin
        degistirebilecegimiz seyler
        1- parametre sayisi
        2- ayni sayida parametreye sahip olsa bile, parametrelerin data turleri
        3- ayni sayida ve ayni data turunde parametreleri olan methodlarda
        parametrelerin siralanisi
         */
    }
}
