package day25Constructor;

public class Car {
    /*
    bu clas bizim kaliphanemeiz bir araba olusturmak icin bizim ihtiyacimiz olan variable
    ve methodlari bu clasta belirleriz
    sonra farkli claslarda araba olusturmamiz gerekirse
    bu clastan bir obje olusturup
    burada belirlenen variable ve methodlara gore araba uretir

     */

  public   String marka="Marka belitilmedi";
  public   String model="model belirtilmedi";
   public int  yil;
   public int fiyat;


    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");
    }
    public  void maxHiz(int hiz){
        System.out.println("Bu araba max "+hiz+"km hiz yapar");
    }
}
