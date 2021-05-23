import java.util.Scanner;
public class Calculator{
    public static void main(String args[]){
        Arithmetic arth=new Arithmetic();
        Scientific scientific=new Scientific();
        Scanner sc=new Scanner(System.in);
        int option;
        System.out.println("enter the operation you want to perform");
        option=sc.nextInt();
        switch(option){
            case 1:arth.matheMaticalCalculation();break;
            case 2:scientific.scienticCalculation();break;
            case 3:System.exit(0);break;
            default:break;
        }
    }
    

}