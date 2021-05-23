
/**
 * AGSchool6
 */
import java.util.*;

public class AGSchool6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AGSchool6 ag = new AGSchool6();
        int n;
        System.out.println("Enter the number of students for whom the details are to be entered");
        n = sc.nextInt();
        float[] average = new float[n];
        Student[] st = new Student[n];
        char[] grade = new char[n];
        for (int i = 0; i < n; i++) {
            st[i] = new Student();
            st[i].details();
            average[i] = st[i].totalmarks / 5;
        }
        ag.topScorer(n, st);
        ag.average(n, st, average);
        ag.grades(n, average, grade, st);
        ag.reportCard(n, st, average, grade);
        ag.histogram(n, average);
    }

    public void topScorer(int n, Student[] st) {
        int index = 0;
        System.out.println("-------------------------------------------");
        System.out.println("\t\tTOP SCORER");
        System.out.println("-------------------------------------------");
        float top = st[0].totalmarks;
        for (int i = 1; i < n; i++) {
            if (top < st[i].totalmarks) {
                top = st[i].totalmarks;
                index = i;
            }
        }
        System.out.println(st[index].rollnumber + "\t" + st[index].name);
    }

    public void average(int n, Student[] st, float[] average) {
        System.out.println("-------------------------------------------");
        System.out.println("\t\tPASSED STUDENTS");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < n; i++) {
            if (average[i] > 35 && st[i].maths > 35 && st[i].science > 35 && st[i].english > 35 && st[i].language > 35
                    && st[i].socialstudies > 35)
                System.out.println(st[i].rollnumber + "\t" + st[i].name);
        }
        System.out.println("-------------------------------------------");
        System.out.println("\t\tFAILED STUDENTS");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < n; i++) {
            if (average[i] < 35 && st[i].maths < 35 && st[i].science < 35 && st[i].english < 35 && st[i].language < 35
                    && st[i].socialstudies < 35)
                System.out.println(st[i].rollnumber + "\t" + st[i].name);
        }
    }

    public void grades(int n, float[] average, char[] grade, Student[] st) {
        for (int i = 0; i < n; i++) {
            if (average[i] >= 91 && average[i] <= 100)
                grade[i] = 'A';
            else if (average[i] >= 81 && average[i] <= 90)
                grade[i] = 'B';
            else if (average[i] >= 71 && average[i] <= 80)
                grade[i] = 'C';
            else if (average[i] >= 61 && average[i] <= 70)
                grade[i] = 'D';
            else if (average[i] >= 51 && average[i] <= 60)
                grade[i] = 'E';
            else
                grade[i] = 'F';
        }
        System.out.println("-------------------------------------------");
        System.out.println("\t\tGRADES OF STUDENTS");
        System.out.println("-------------------------------------------");
        System.out.println("rollnumber\tname\ttotal marks\taverage\tgrade");
        for (int i = 0; i < n; i++)
            System.out.println(st[i].rollnumber + "\t\t" + st[i].name + "\t" + st[i].totalmarks + "\t" + average[i]
                    + "\t" + grade[i]);
    }

    public void reportCard(int n, Student[] st, float[] average, char[] grade) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll number for which you want to get the details");
        int roll = sc.nextInt();
        System.out.println("-------------------------------------------");
        System.out.println("\t\tREPORT CARD");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < n; i++) {
            if (st[i].rollnumber == roll) {
                System.out.println(
                        "NAME\tROLL NUMBER\tMATHS\tSCIENCE\tENGLISH\tLANGUAGE\tSOCIAL STUDIES\tTOTAL MARKS\tAVERAGE MARKS\tGRADE");
                System.out.println(st[i].name + "\t" + st[i].rollnumber + "\t\t" + st[i].maths + "\t\t" + st[i].science
                        + "\t\t" + st[i].english + "\t\t" + st[i].language + "\t" + st[i].socialstudies + "\t"
                        + st[i].totalmarks + "\t" + average[i] + "\t" + grade[i]);
                break;
            }
        }
    }

    public void histogram(int n, float[] average) {
        int i, j;
        System.out.println("-------------------------------------------");
        System.out.println("\t\tHISTOGRAM");
        System.out.println("-------------------------------------------");
        for (i = 9; i >= 1; i--) {
            for (j = 0; j < n; j++) {
                if (average[j] >= i * 10) {
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