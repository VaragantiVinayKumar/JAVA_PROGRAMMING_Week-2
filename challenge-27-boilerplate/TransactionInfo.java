import java.util.*;
public class TransactionInfo{
    private int balance=1000,withdraw,deposit;
    long n;        
    Scanner sc=new Scanner(System.in);
    public TransactionInfo(long accno) {
        this.n=accno;
    }
    public TransactionInfo() {
    }


    public void checkBalance()
    {
    System.out.println("Balance : "+balance);
    }
    
    public void deposit()
    {
    System.out.print("Enter money to be deposited:");
    deposit = sc.nextInt();
    balance = balance + deposit;
    System.out.println("Your Money has been successfully depsited");
    }
    public void withdraw()
    {
        System.out.print("Enter money to be withdrawn:");
        withdraw = sc.nextInt();
        if(balance >= withdraw)
        {
            balance = balance - withdraw;
            System.out.println("Please collect your money");
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
    public  void transaction(){
        while(true)
     {  
        System.out.println("press 1.check balance\npress 2.deposit\npress 3.withdraw\npress 4.exit");
        int opt=sc.nextInt();
        switch(opt) 
        {
            case 1 : checkBalance();
            break;
            case 2 : deposit();
            break;
            case 3 : withdraw();
            break;
            case 4 : 
            System.out.println("exited from the savings account");
            System.exit(0);

            break;
            default : break;
        }
      }
    }
}
