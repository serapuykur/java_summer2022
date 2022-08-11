package day35_inheritancedaConstructorKullanimi;

public class FMemur  extends  EMuhasebe{

    /*
    Extend keywoord kullanilan classlarda
    ister default constructor bulunsun
    isretsek de biz yeni constructor lar olusturalim
    Java contructorin ilk satirina super() call yazar

    super();constructor call default contructora benzer
    gorunmese de orada vardir ve calisir
    ancak biz ilk satirafarkli bir contructor call yazarsak
    java super()i siler


    Eger biz mudahale edip kendi cont call olusturmazsak javanin default olark olusturudugu
    const call herzaman parametresizdir
    super()
     */

    FMemur(){
        System.out.println("Memur parametresiz cons");
    }
    FMemur(String isim){
        System.out.println("Memur parametreli cons");
    }
    public static void main(String[] args) {
        FMemur mmr1=new FMemur("ali");
    }




}
