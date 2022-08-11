package day13_MethodCreation;

public class C04_methodCreation {
    public static void main(String[] args) {
       //input olarak verilen iki integeri toplayip yazdiran 
        //bit method yazdirin
        
        int input1=1;
        int input2=20;
        
        //method 4 adimda olusturulur
        //1. adim method call
        //2.adim argument eklenmesi gerekiyorsa ekleyelim
        //eger methodun return tipi voidden farkli olaacaksa 
        //bir veriable olusturup method call assign edelim
        
        topla(input1,input2);
        

    }

    public static void topla(int input1, int input2) {
        //3.adimmethod declarasyonunda  degistirilmesi gereken
        //bolumleri degistir(access modofier,return type vvb...
        //4.eger return type void disinda birseyse
        //return keywordu ve donecek degeri hesaplamaliyiz

        System.out.println("girilen iki sayinin toplami :"+ (input1+input2));
    }
}
