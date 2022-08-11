package day10_stringManipulation;

public class C04_equalsIgnoreCase2 {
    public static void main(String[] args) {
        String s1 = "Ali";
        String s2 = "ALI";
        String s3 = "ALİ";
        System.out.println(s1 + " " + s1.equalsIgnoreCase(s2) + " " + s2);  // Ali true ALI
        System.out.println(s1 + " " + s1.equalsIgnoreCase(s3) + " " + s3);  // Ali true ALİ


    }
}
