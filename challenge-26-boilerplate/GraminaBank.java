
/**
 * GraminaBank
 */
import java.util.*;

public class GraminaBank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of customers");
        int n = sc.nextInt();
        Customer[] c = new Customer[n];
        for (int i = 0; i < n; i++) {
            c[i] = new Customer();
            c[i].setFirstname("hello");
            c[i].setLastname("hi");
            c[i].setCustomerid(0);
            c[i].setPhoneno("122");
            c[i].setState("hello");
            c[i].setVillage("hi");
        }
        System.out.println("Enter the last name of the customer");
        String lastName = sc.next();
        for (int i = 0; i < n; i++) {
            if (lastName.equals(c[i].getLastname())) {
                System.out.println("FIRST NAME  :" + c[i].getFirstname());
                System.out.println("LAST NAME   :" + c[i].getLastname());
                System.out.println("CUSTOMER ID :" + c[i].getCustomerid());
                System.out.println("PHONE NUMBER:" + c[i].getPhoneno());
                System.out.println("STATE       :" + c[i].getState());
                System.out.println("VILLAGE     :" + c[i].getVillage());
            }
        }
        System.out.println("Enter the village name of the customer");
        String village = sc.next();
        System.out.println("List of customers from same village");
        for (int i = 0; i < n; i++) {
            if (village.equals(c[i].getVillage())) {
                System.out.println(i + 1 + "\t" + c[i].getFirstname() + " " + c[i].getLastname());
            }
        }
    }
}