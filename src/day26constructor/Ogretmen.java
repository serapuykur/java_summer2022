package day26constructor;

public class Ogretmen {

    String isim="isim belirtilmedi";
    String soyisim="Soyisim belirtilmedi";
    String dogumTarihi="tarih girilmedi";
    String brans="Brans belirtilmedi";
    String yanBrans="Yan brans belirtilmedi";

    public Ogretmen() {
    }

    public Ogretmen(String isim, String soyisim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;


    }

    @Override
    public String toString() {
        return
                "isim:" + isim +
                "\n soyisim:" + soyisim +
                "\n dogumTarihi='" + dogumTarihi +
                "\n brans='" + brans +
                "\n yanBrans=" + yanBrans ;

    }

    public Ogretmen(String isim, String soyisim, String dogumTarihi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;

    }
}
