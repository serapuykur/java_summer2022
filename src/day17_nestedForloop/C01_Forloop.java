package day17_nestedForloop;

public class C01_Forloop {
    public static void main(String[] args) {
        //verilen Stringdeki verilen harfleri tekrarsiz olarak yazdirip
       // kelimede kullanilan farkli harf sayisini veren bir method yazin

        String input="Java her zaman guzel";
        tekrarsizYap(input);
    }

  public static void tekrarsizYap(String input) {
        String benzersizInput="";
        String islenecekKelime=input.replaceAll("\\w","");//javaherzamanguzel
      System.out.print(islenecekKelime.substring(0,1));//J
      benzersizInput+=islenecekKelime.substring(0,1);//J
      for (int i = 1; i < islenecekKelime.length(); i++) {

        if(!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
            System.out.print(","+islenecekKelime.substring(i,i+1));
            benzersizInput+=islenecekKelime.substring(i,i+1);
        }

      }
      System.out.println("");
      System.out.println("input: "+input);
      System.out.println("benzersizinput :"+benzersizInput);
    }
}
