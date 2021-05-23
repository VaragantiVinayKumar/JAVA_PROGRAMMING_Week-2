import java.util.Scanner;
public class Arithmetic {
    float a;
    float b;
    Scanner sc=new Scanner(System.in);

    public  void matheMaticalCalculation(){
    while(true){
        System.out.println("select an arithmetic");
        int option=sc.nextInt();
        switch(option){
            case 1:add();break;
            case 2:subtract();break;
            case 3:multiply();break;
            case 4:divide();break;
            case 5:modulo();break;
            case 6:System.out.println("exited from mathematical operation");
            System.exit(0);break;
            default:break;

        }
        }      
    }

    public void add(){
        System.out.println("enter a and b values");
        a=sc.nextInt();
        b=sc.nextFloat();
        float res=a+b;
        System.out.println("The sum of "+a+" and "+b+" is : "+res);
    }

    public void subtract(){
        System.out.println("enter a and b values");
        a=sc.nextInt();
        b=sc.nextFloat();
        float res=a-b;
        System.out.println("The subtraction of "+a+" and "+b+" is : "+res);

    }

    public void multiply(){
        System.out.println("enter a and b values");
        a=sc.nextInt();
        b=sc.nextFloat();
        float res=a*b;
        System.out.println("The multipliction of "+a+" and "+b+" is : "+res);

    }

    public void divide(){
        try{
            System.out.println("enter a and b values");
            a=sc.nextInt();
            b=sc.nextFloat();
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("divide by zero error");
        }
    }

    public void modulo(){
        try{
            System.out.println("enter a and b values");
            a=sc.nextInt();
            b=sc.nextFloat();
            System.out.println(a%b);
        }
        catch(ArithmeticException e){
            System.out.println("divide by zero error");
        }
    }


    
}
