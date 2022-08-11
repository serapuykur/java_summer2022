package day43_interfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {

    void motor();
    public  void yakit();
    public  abstract String aku();
    /*
    normal bir clasta oldugumuzu dusunursek
    iki tane access modifier kullanma ihtimali olmaz
    Asagidaki method`da goreceginiz gibi interfacede istisnai olarak bodysi olan methodlar olusturulabilir
    bu ozellik java 8 den sonra kullanilmaya baslanmistrie
     bir interfaceye yeni bir method eklememiz gerektiginde
     eskiden beri bu interfaceyi implement eden tum claslara gidip yeni eklenen methodu override etmemiz gerekirdi

      Bu ozellik sayesinde basina defailt veya static keywoord ekleyerek interfacede yeni ve bodysi olan bir method
      olusturursak bu methodun child classlar tarafindan override edilme mecburuyeti olmaz
      ve eskiden implement etmis claslari degistirmemiz gerekmez

      Bu istisnai bir durumdur ve interface icin olusturulan genenl kurallari bozmaz

      bu methodlarin bodyesi olsa da bunlara concrete method denmez ama override edilme mecburuyetlerui yoktur

      buradaki  default kelimesi acces modoifiar degil istisnai durumun belirtilmesi cindir

      O zaman nicin iki keyword(static ve default )tanimlanmistir?
      Bu iki kelimenin farkli amaci
      child claslardan bu methoda nasil erisilebilecegini belirlemek iindir
      static keywoord kullanilirsa child classtan bu methoda erismek icin InterfaceAdi.methodAdi yeterliolur
      defaultkeywoord kullanilirsa methoda erisemk icin obje olusturulmalidir


     */

    public default void teker(){
        System.out.println("tum arabalarin tekeri vardir");

    }
    public static  void direksiyon(){
        System.out.println("tum arabalarin direksiyonu vardir");
    }

}
