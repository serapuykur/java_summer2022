package day16_forloop;

public class C02_ForloopHatalar {
    public static void main(String[] args) {
        //baslangic noktasindan  sonra sonra bitis sartina yaklasmiyorsak sonsuz loop olusur
       // for (int i =0; i >=-10 ; i++) {
         //   System.out.println(i);


        //eger ilk deger icin bile bitis sarti saglanmiyorsa  for loop calisir
        //ama loop body si hicbir zaman devreye girmez (calismaz)
        for (int i =0; i >5; i++) {//0>5loop broken
            System.out.println(i);

        }

        }
    }

