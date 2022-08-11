package day26constructor;

public class Kamyon {

    public   String marka="Marka belitilmedi";
    public   String model="model belirtilmedi";
    public int  yil;
    public int fiyat;

    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Kamyon(String marka, String model, int yil, int fiyat) {
       this.marka=marka;
        this.model=model;
        this.yil=yil;
        this.fiyat=fiyat;

        /*Bizim temel amacimiz kamyonarunnerda argument
        olarak grilen degerin
        Kamyon classinda instance variable atanmasi
        ancak scop konusunda ogrendigmiz gibi  kamyon const scopunda marka
        oldugu icin instanceye gitmiyo
        Bu karisikligi gidermek icin instance variableleri belirli hale
        getirmemiz lazim
        JAva bunun icin this keywoordu olusturmustur
        genel kullanim acisindan this keywoordu kodu  herkesin anlamamisini
        kolaylastirdigi icin terch edilir



         */
    }
    public Kamyon(){

    }

    @Override
    public String toString() {
        return
                "\nmarka=" + marka +
                "\n model=" + model +
                "\n yil=" + yil +
                "\n fiyat=" + fiyat ;

    }
}
