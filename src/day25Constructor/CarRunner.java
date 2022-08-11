package day25Constructor;

public class CarRunner {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.fiyat=150000;
        car1.yil=2020;
        car1.marka="Toyota";
        System.out.println(" Car1 bilgileri\nMarka : "+car1.marka +"\nModel:"+
                car1.model+"\nYil:"+car1.yil+"\nFiyat"+car1.fiyat);


        Car car2=new Car();
        System.out.println(" Car2 bilgileri\nMarka : "+car2.marka +"\nModel:"+
                car2.model+"\nYil:"+car2.yil+"\nFiyat"+car2.fiyat);
        /*
        herhangi bir obje uzerinden bir variable yazdirmaya calistigimizda
        java degeri  su siralama ile arar
        1-o obje olusturulduktan sonra bir deger atandi mi?
        2-objenin olusturuldugu clasta variableye bir deger atanmis mibakar
        3- ozaman data turune gore java default degeri atar.
         */

    }
}
