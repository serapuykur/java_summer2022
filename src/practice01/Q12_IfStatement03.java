package practice01;


import java.util.Scanner;

public class Q12_IfStatement03 {
    /*
    Print "Lutfen is unvaninizi girin
    jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
    Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
    Eger jobTitle  qa ise print is unvaniniz Quality Analyst
    test data:
    qa ise print Quality Analyst
    dev ise print Developer
    ba ise print Business Analyst
    pm ise print Project Manager
   */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen is unvaninizi girin");
        String jobTitle = scan.nextLine().toLowerCase();

        if (jobTitle.equals("qa")) {
            System.out.println("Quality Analyst");
        } else if (jobTitle.equals("dev")) {
            System.out.println("Developer");
        } else if (jobTitle.equals("ba")) {
            System.out.println("Business Analyst");
        } else if (jobTitle.equals("pm")) {
            System.out.println("Project Manager");
        }

    }
}

