package day41_abstractClass_Interface;

public abstract class DAraba {
    public static void main(String[] args) {
        /*

         */
    }
    protected  abstract void yakit();
    protected  abstract  void kaporta();
    protected abstract void motor();
    /*
    sadece child classlarin mecburi tasiyacaklari ozellikleri belirleyen methodlar
    abstract method olur ve abstract methodlarin bodysi olmaz
     */
        public  void klima(){
            System.out.println("Bazi arabalarda klima olabilir");
            /*
            abstract olmayan methodlara concrete (somut)method denir
            abstract bir methodu abstract keywoord ile belirtmek zorunludur
            concrete methodlarda bunun deklare edilmesine gerek yoktur
            biz sadece abstraction ile ilgili ikonustugumuzda
            abstract olmayan methodlardan bahsetmek icn concreete tabirini kullaniriz
             */
        }

}
