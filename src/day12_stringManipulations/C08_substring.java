package day12_stringManipulations;

public class C08_substring {
    public static void main(String[] args) {
        String isim="sedat";

        String isimIlkHarf= String.valueOf(isim.toUpperCase().charAt(0));

        char ch = isim.toUpperCase().charAt(0);
        String a= String.valueOf(ch);


        System.out.println(isimIlkHarf+a);

    }
}
