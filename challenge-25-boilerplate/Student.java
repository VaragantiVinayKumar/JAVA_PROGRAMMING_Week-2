import java.util.*;

public class Student {
    private String name;
    private int rollnumber;
    private float maths, science, english, language, socialstudies;
    private float totalmarks, averagemarks;
    private char grade;
    Scanner sc = new Scanner(System.in);

    public void setRollnumber(int rollnumber) {
        System.out.println("Enter the roll number");
        rollnumber = sc.nextInt();
        this.rollnumber = rollnumber;
    }

    public void setName(String name) {
        System.out.println("Enter the name");
        name = sc.next();
        this.name = name;
    }

    public void setMaths(float maths) {
        System.out.println("maths marks");
        maths = sc.nextFloat();
        this.maths = maths;
    }

    public void setScience(float science) {
        System.out.println("science marks");
        science = sc.nextFloat();
        this.science = science;
    }

    public void setEnglish(float english) {
        System.out.println("english marks");
        english = sc.nextFloat();
        this.english = english;
    }

    public void setLanguage(float language) {
        System.out.println("language marks");
        language = sc.nextFloat();
        this.language = language;
    }

    public void setSocialstudies(float socialstudies) {
        System.out.println("Social studies marks");
        socialstudies = sc.nextFloat();
        this.socialstudies = socialstudies;
    }
    // public void setTotalmarks(float totalmarks) {
    // this.totalmarks = maths+science+english+language+socialstudies;
    // }

    public String getName() {
        return name;
    }

    public float getSocialstudies() {
        return socialstudies;
    }

    public float getLanguage() {
        return language;
    }

    public float getEnglish() {
        return english;
    }

    public float getScience() {
        return science;
    }

    public float getMaths() {
        return maths;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public float getTotalmarks() {
        totalmarks = maths + science + english + language + socialstudies;
        return totalmarks;
    }

    public float getAveragemarks() {
        averagemarks = totalmarks / 5;
        return averagemarks;
    }

    public char getGrade() {
        if (averagemarks >= 91 && averagemarks <= 100)
            grade = 'A';
        else if (averagemarks >= 81 && averagemarks <= 90)
            grade = 'B';
        else if (averagemarks >= 71 && averagemarks <= 80)
            grade = 'C';
        else if (averagemarks >= 61 && averagemarks <= 70)
            grade = 'D';
        else if (averagemarks >= 51 && averagemarks <= 60)
            grade = 'E';
        else
            grade = 'F';
        return grade;
    }
}
