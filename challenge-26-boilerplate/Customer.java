import java.util.*;

public class Customer {
    private String firstname;
    private String lastname;
    private double customerid;
    private String phoneno;
    private String state;
    private String village;
    Scanner sc = new Scanner(System.in);

    public String getFirstname() {
        return firstname;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        System.out.println("Enter the village of the customer");
        village = sc.next();
        this.village = village;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        System.out.println("Enter the state of the customer");
        state = sc.next();
        this.state = state;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        System.out.println("Enter the 10 digit phone number of the customer");
        phoneno = sc.next();
        if (phoneno.length() == 10) {
            this.phoneno = phoneno;
        } else {
            System.out.println("Entered phone number is incorrect");
            setPhoneno("hello");
        }
    }

    public double getCustomerid() {
        return customerid;
    }

    public void setCustomerid(double customerid) {
        long min = 10000000;
        long max = 99999999;
        customerid = Math.random() * (max - min + 1) + min;
        this.customerid = customerid;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        System.out.println("Enter the last name");
        lastname = sc.next();
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        System.out.println("Enter the first name");
        firstname = sc.next();
        this.firstname = firstname;
    }

}
