import java.util.Scanner;
public class main1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the model number");
        String model;
        model=sc.next();
        Petrol petrol=new Petrol(model);
        petrol.showSpecs(model);
        Diesel diesel=new Diesel(model);
        diesel.showSpecs(model);
        CNG cng=new CNG(model);
        cng.showSpecs(model);
        Electric electric=new Electric(model);
        electric.showSpecs(model);
        sc.close();

    }
    
}
