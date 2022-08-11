package day34_inheritance;

public class ToyotaCorolla  extends Toyota{

    public static void main(String[] args) {
        ToyotaCorolla arb1=new ToyotaCorolla();
        System.out.println(arb1.marka);//toyota
       // System.out.println(arb1.model);//parent classalri private yapinca o ozelligi kullanamayiz
        //chil classtan parent clasa erisimde acces modifier kurallarini bypass edemeyiz
        //onegin=parent clastaki private class uyelerini child classtan kullanamayiz
        // ayni sekilde parent ve chil farkli packajelerde ise parent clastaki default access modofieri
        //olan class uyelerini child classdan kullanamayiz
    arb1.motor();

    arb1.benzin();

    }
    public void benzin(){
        System.out.println("Corolla benzinlidir");
    }
    public void motor(){
        System.out.println("corolla motoru gucludur");
    }

}
