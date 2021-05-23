
/**
 * AGSchool7
 */
import java.util.*;

public class AGSchool7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AGSchool7 ag = new AGSchool7();
        int n;
        System.out.println("Enter the number of students for whom the details are to be entered");
        n = sc.nextInt();
        Student[] st = new Student[n];
        char[] grade = new char[n];
        for (int i = 0; i < n; i++) {
            st[i] = new Student();
            st[i].setName("Hello");
            st[i].setRollnumber(1);
            st[i].setMaths(0);
            st[i].setScience(0);
            st[i].setEnglish(0);
            st[i].setLanguage(0);
            st[i].setSocialstudies(0);
        }
        ag.topScorer(n, st);
        ag.average(n, st);
        ag.grades(n, st);
        ag.reportCard(n, st);
        ag.histogram(n, st);
    }

    public void topScorer(int n, Student[] st) {
        int index = 0;
        System.out.println("-------------------------------------------");
        System.out.println("\t\tTOP SCORER");
        System.out.println("-------------------------------------------");
        float top = st[0].getTotalmarks();
        for (int i = 1; i < n; i++) {
            if (top < st[i].getTotalmarks()) {
                top = st[i].getTotalmarks();
                index = i;
            }
        }
        System.out.println(st[index].getRollnumber() + "\t" + st[index].getName());
    }

    public void average(int n, Student[] st) {
        System.out.println("-------------------------------------------");
        System.out.println("\t\tPASSED STUDENTS");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < n; i++) {
            if (st[i].getAveragemarks() > 35 && st[i].getMaths() > 35 && st[i].getScience() > 35
                    && st[i].getEnglish() > 35 && st[i].getLanguage() > 35 && st[i].getSocialstudies() > 35)
                System.out.println(st[i].getRollnumber() + "\t" + st[i].getName());
        }
        System.out.println("-------------------------------------------");
        System.out.println("\t\tFAILED STUDENTS");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < n; i++) {
            if (st[i].getAveragemarks() < 35 && st[i].getMaths() < 35 && st[i].getScience() < 35
                    && st[i].getEnglish() < 35 && st[i].getLanguage() < 35 && st[i].getSocialstudies() < 35)
                System.out.println(st[i].getRollnumber() + "\t" + st[i].getName());
        }
    }

    public void grades(int n, Student[] st) {
        System.out.println("-------------------------------------------");
        System.out.println("\t\tGRADES OF STUDENTS");
        System.out.println("-------------------------------------------");
        System.out.println("rollnumber\tname\ttotal marks\taverage\tgrade");
        for (int i = 0; i < n; i++)
            System.out.println(st[i].getRollnumber() + "\t\t" + st[i].getName() + "\t" + st[i].getTotalmarks() + "\t"
                    + st[i].getAveragemarks() + "\t" + st[i].getGrade());
    }

    public void reportCard(int n, Student[] st) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll number for which you want to get the details");
        int roll = sc.nextInt();
        System.out.println("-------------------------------------------");
        System.out.println("\t\tREPORT CARD");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < n; i++) {
            if (st[i].getRollnumber() == roll) {
                System.out.println(
                        "NAME\tROLL NUMBER\tMATHS\tSCIENCE\tENGLISH\tLANGUAGE\tSOCIAL STUDIES\tTOTAL MARKS\tAVERAGE MARKS\tGRADE");
                System.out.println(st[i].getName() + "\t" + st[i].getRollnumber() + "\t\t" + st[i].getMaths() + "\t\t"
                        + st[i].getScience() + "\t\t" + st[i].getEnglish() + "\t\t" + st[i].getLanguage() + "\t"
                        + st[i].getSocialstudies() + "\t" + st[i].getTotalmarks() + "\t" + st[i].getAveragemarks()
                        + "\t" + st[i].getGrade());
            }
        }
    }

    public void histogram(int n, Student[] st) {
        int i, j;
        System.out.println("-------------------------------------------");
        System.out.println("\t\tHISTOGRAM");
        System.out.println("-------------------------------------------");
        for (i = 9; i >= 1; i--) {
            for (j = 0; j < n; j++) {
                if (st[j].getAveragemarks() >= i * 10) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
        for (i = 1; i <= n; i++) {
            System.out.print(i + "\t");
        }
    }
}