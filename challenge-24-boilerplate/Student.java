
/**
 * Student
 */
import java.util.Scanner;
public class Student  
{
    Scanner sc=new Scanner(System.in);
    String name;
    int rollnumber;
    float maths,science,english,language,socialstudies;
    float totalmarks;
    public float details()
    {
        System.out.println("Enter the name of the student");
        name=sc.nextLine();
        System.out.println("Enter the roll number");
        rollnumber=sc.nextInt();
        System.out.println("maths marks");
        maths=sc.nextFloat();
        System.out.println("science marks");
        science=sc.nextFloat();
        System.out.println("english marks");
        english=sc.nextFloat();
        System.out.println("language marks");
        language=sc.nextFloat();
        System.out.println("social studies marks");
        socialstudies=sc.nextFloat();
        totalmarks=maths+science+english+language+socialstudies;
        return totalmarks;
    }
}