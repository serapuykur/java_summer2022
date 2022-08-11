package day17_nestedForloop;

public class C10_WhileLoop {
    public static void main(String[] args) {

        boolean dogruMu=false;
        int sayi=10;

        while(!dogruMu){
            if(sayi>20){
                System.out.println("Bu islem tamam");
                dogruMu=true;

            }else
                System.out.println("istenen sart saglanamadi"+sayi);
            sayi++;
        }
    }
}
