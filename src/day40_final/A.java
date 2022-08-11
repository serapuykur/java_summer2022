package day40_final;

 public class A {
        String isim = "Cuneyt";
      final static   String okul = "Yildiz Koleji";
      /*
      bir variable final olarak tanimlandiysa baska klaslardan
      yada icinde oldugumuz clastan bu variableye baska bir deger atanmasi mumkun degildir

      madem ki degeri degistirilemiyor
       genelde static de yaparak
       birr variable esirim kolaylastirilabilir

       ve genelde static final olarak belirlenen variable isimleri BUYUK HARFLE yazilabilir

       */
    final void finalMethod(){
        System.out.println("final methodlar override  edilemez");
        //bir methodu final olarak isaretleniz
        //bu method degistirilemez demektir
        //(override edilemez)
    }

}