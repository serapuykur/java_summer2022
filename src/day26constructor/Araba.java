package day26constructor;

public class Araba {
    public   String marka="Marka belitilmedi";
    public   String model="model belirtilmedi";
    public int  yil;
    public int fiyat;

  

     public Araba(String markaR, String modelR, int yilR, int fiyatR) {


            marka = markaR;
            model = modelR;
            yil = yilR;
            fiyat = fiyatR;
        }


    public Araba() {

    }


    /*
    biz herhangi bir const olusturdugumuzda
    java default contructoru siler
    eger biz projemizde bir sorun yasanmasini istemiyorsak mutlaka
    default contructor yerine parametresiz bir cont olusturmaliyiz
     */


    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");
    }
    public  void maxHiz(int hiz){
        System.out.println("Bu araba max "+hiz+"km hiz yapar");


    }
}
