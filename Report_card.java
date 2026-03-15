package company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Report_card {
    static void main() {
        Scanner t = new Scanner(System.in);
        System.out.println("Making Report Card for Students, Just follow the procedure :");
        System.out.println("Enter your name :");
        String naa = t.next();
        System.out.println("Enter your present class :");
        int clas = t.nextInt();
        System.out.println("Enter your Roll number :");
        int r = t.nextInt();
        System.out.println("Enter your Class section:");
        String section = t.next();
        System.out.println("Enter your school name :");
        String nam = t.next();
        System.out.println("Enter marks in subject 1");
        Scanner scanner = new Scanner(System.in);
        float S1 = scanner.nextFloat();
        System.out.println("Enter marks in subject 2");
        float S2 = scanner.nextFloat();
        System.out.println("Enter marks in subject 3");
        float S3 = scanner.nextFloat();
        System.out.println("Enter marks in subject 4");
        float S4 = scanner.nextFloat();
        System.out.println("Enter marks in subject 5");
        float S5 = scanner.nextFloat();
        //now we make report card
        System.out.println("     Report Card of " + nam + " Public School");
        System.out.println("Student Name : " + naa + "          ");
        System.out.println("Class : " + clas);
        System.out.println("Roll no. : " + r + "          ");
        System.out.println("Section : " + section);
        float per = (S1 + S2 + S3 + S4 + S5) / 500 * 100;
        System.out.println("Percentage : " + per + "%");
        char grade;

        if (per >= 90) {
            grade = 'A';
        } else if (per >= 75) {
            grade = 'B';
        } else if (per >= 60) {
            grade = 'C';
        } else if (per >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Over all Grade : " + grade);
    }
}