import java.util.*;
public class GrahminBank1{
    private String firstName;
    private String lastName;
    private int id;
    private String phno;
    private Address1 address;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public Address1 getAddress() {
        return address;
    }

    public void setAddress(Address1 address) {
        this.address = address;
    }


    public void getDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first name of customer");
        this.firstName=sc.nextLine();
        System.out.println("enter the last name of customer");
        this.lastName=sc.nextLine();
        System.out.println("enter the id for customer");
        this.id=sc.nextInt();
        System.out.println("enter the phone number");
        phone();
        this.address=new Address1();
        address.getDetails();
    } 
    public void phone(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 digit phone num: ");
        phno=sc.next();
        if(phno.length()==10)
            {
                this.phno=phno;
            }
        else
            {
                System.out.println("entered phone num is incorrect.");
                phone();
            }
    }

}