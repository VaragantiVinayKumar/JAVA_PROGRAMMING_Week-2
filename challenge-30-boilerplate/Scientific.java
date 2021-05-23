import java.util.Scanner;
import java.lang.Math;
public class Scientific {
    Scanner sc=new Scanner(System.in);
    private double a;
    public void scienticCalculation(){
        while(true){
        System.out.println("select a scientific operation :");
        int option=sc.nextInt();
        switch(option){
            case 1:ceil();break;
            case 2:floor();break;
            case 3:squareRoot();break;
            case 4:powerOf();break;
            case 5:System.exit(0);break;
            default:break;
        }
        }
    }

    public void handler(double a) throws Exception{
        if(a<=0){
            throw new ExceptionHandling("value is either zero or negative value error");
        }
        else{
            System.out.println("Ceil value of "+a+" is : "+Math.ceil(a));
        }
    }
    public void ceil(){
        try{
        System.out.println("Enter a value");
        a=sc.nextInt();
        handler(a);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

    public void handler1(double a) throws Exception{
        if(a<=0){
            throw new ExceptionHandling("value is either zero or negative value error");
        }
        else{
            System.out.println("floor value of "+a+" is : "+Math.floor(a));
        }
    }

    public void floor(){
        try{
        System.out.println("Enter a value");
        a=sc.nextInt();
        handler1(a);
        }
        catch(Exception e){
            System.out.println(a);
        }

    }

    public void handler2(double a) throws Exception{
        if(a<=0){
            throw new ExceptionHandling("value is either zero or negative value error");
        }
        else{
            System.out.println("Square root of "+a+" is : "+Math.sqrt(a));
        }
    }

    public void squareRoot(){
        try{
        System.out.println("Enter a value");
        a=sc.nextInt();
        handler2(a);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

    public void handler3(int base,int exp) throws Exception{
        if(base<=0||exp<=0){
            throw new ExceptionHandling("value is either zero or negative value error");
        }
        else{
            System.out.println("Square root of "+a+" is : "+Math.pow(base,exp));
        }
    }

    public void powerOf(){
        try{
        System.out.println("Enter non negative numbers ");
        int base,exp;
        base=sc.nextInt();
        exp=sc.nextInt();
        handler3(base,exp);
        }
        catch(Exception e){
            System.out.println(a);
        }

    }



    
    
}
