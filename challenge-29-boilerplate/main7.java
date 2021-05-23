import java.util.Scanner;
public class main7 {
   public static void main(String main[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the model number");
       String modelnumber=sc.next();
       Manual manual=new Manual(modelnumber);
       AMT amt=new AMT(modelnumber);
       ACvtDct acd=new ACvtDct(modelnumber);
       manual.showSpecs(modelnumber);
       amt.showSpecs(modelnumber);
       acd.showSpecs(modelnumber);

   } 
}
