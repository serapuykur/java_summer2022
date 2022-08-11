package day25Constructor;

public class C03 {

    /*
    proje olustururken bazi claslar run etmek degil veriable
    ve method olusturup
    bunlari baska claslardan kullanmak icin olusturulur
    Default constructor parametresizdir goremezsek bile
    ihtiyac oldugund calsir
    Class icerisinde parametreli veya parametresiz herhangi bir construtor
    olustrurusak java default constractoru siler
     */
    C03(){

    }
    /*
    olustrudugumuz parametresiz bu  constroctur default const ile
    birebir aynidirama biz olusturdugumuz icin buna default const demeyiz
    parametresiz contructor deriz
     */
    String isim="Etka;";
    public void method1(){
        System.out.println("C03 method calisti");
    }

}
