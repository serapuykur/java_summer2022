package day17_nestedForloop;

public class C06_NestedForloop {
    public static void main(String[] args) {
        /*verilen Stringi asagisaki gibi yazdoran bir program yaziniz
        input="Deniz";
        D
        D e
        D e n
        D e n i
        D e n i z

         */
        String input="Aankara";
        for (int i = 1; i <= input.length(); i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print(input.substring(j-1,j));

            }
            System.out.println("");
        }

    }
}
