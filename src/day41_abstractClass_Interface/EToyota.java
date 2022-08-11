package day41_abstractClass_Interface;

public abstract class EToyota extends DAraba{


    @Override
    protected void motor() {
        System.out.println("Toyota arabalar cevreci motor kullanir");
        /*
        parent clastaki standart belirleyici classlar yani abstract claslarin
        tamami child class tarafindan override edilmelidir
        concrete methodlar override edilme mecburuyeti yoktur
        istersek override edebiliriz istersek override edriz  istemezsek etmeyiz

        Aslinda toyota clasi da obje uretecegimiz bir class degil
        bu durumda eger proje tasarimi yapiyorsaniz toyota clasini da abstract ypmaniz guzel olur
         */
    }
}
