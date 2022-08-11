package day42_abstractClass_interfacess;

public class K_ChildClassOfInterfaces implements I02_Interfaces,I03_Interfaces{
    /*
    Bir classi bir interfaceye child yapmak icin implemen keywoord kullanilir
    Implement dedikten sonra , virgul kullanarak istedigimiz kadar interface ekleyebiliriz

    bir interface bir clasi parent edinemez
     */
    public static void main(String[] args) {
        System.out.println(I03_Interfaces.SAYI);
        System.out.println(I02_Interfaces.SAYI);
        System.out.println(ISIM);//Yildiz koleji
    }


    @Override
    public void motor() {

    }

    @Override
    public void teker() {

    }
}
