package day42_abstractClass_interfacess;

public interface I03_Interfaces {

    int SAYI=20;
    /*
    int sayi;
    Interfacelerde tum variableler public static ve finaldir
    dolayisiyla sonradan deger atama sansimiz yoktur
    Bunun icin variable olusturdugumuzda mutlaka deger atamaliyiz

     */

    /*
    Interface icerisindeki her method public ve abstract ozelliklere sahiptir

    public abstracttir
    abstract bir methodun bosysi olmasi mumkun degildir
    Java sonradan developerin istegi uzerine kismi bir update yapmistir
    ......devamini yaz.....

     */

    public  void motor();
    public abstract  void teker();
    public static  void aku(){

    }

}
