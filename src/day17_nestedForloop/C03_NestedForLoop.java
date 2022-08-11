package day17_nestedForloop;

public class C03_NestedForLoop {

    public static void main(String[] args) {
        //verilen en ve boy degerine gore yildizlardan olusan bir dikdortgen yapin
       // yukseklik=3
        //boyu=4
      //  ****
       // ****
       // ****


        int yukseklik=4;
        int boy=8;

        for (int i =1; i <=yukseklik ; i++) {
            for (int j = 1; j <=boy ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
