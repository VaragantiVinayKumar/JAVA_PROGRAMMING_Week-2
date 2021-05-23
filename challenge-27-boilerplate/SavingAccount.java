import java.util.*;
public class SavingAccount{ 
    private long accNo;
    private float interest;
    private int age;

    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long accNumber(){
        long min=1000000000000L;
        long max=10000000000000L;
        Random random=new Random();
        accNo=min+((long)(random.nextDouble()*(max-min)));
        return accNo;
    }
    public int age(){
        System.out.println("enter the age");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        return age;
    }

    public float ageInfo(int age){
        if(age<18)
        interest=0.2f;
        else
        interest=0.3f;
        return interest;
    }
    
    public void display(){
        System.out.println("Account number :"+accNumber());
        System.err.println("age :"+age());
        System.out.println("rateofinterest :"+ageInfo(age));

    }

    
}