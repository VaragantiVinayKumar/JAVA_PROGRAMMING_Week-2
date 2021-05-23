import java.util.*;
public class Address1 {
    private String state;
    private String village;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public void getDetails(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the state");
    state=sc.nextLine();
    System.out.println("enter the village");
    village=sc.next();
    }
    public void displayDetails(){
        System.out.println("state :"+state);
        System.out.println("village :"+village);
    }
    

    
}
