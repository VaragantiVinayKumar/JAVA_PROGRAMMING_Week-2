import java.util.*;

public class main4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter number of customers");
        n = sc.nextInt();
        GrahminBank1[] gb = new GrahminBank1[n];
        Address1 address = new Address1();
        SavingAccount[] account1 = new SavingAccount[n];
        TransactionInfo trans1 = new TransactionInfo();
        TransactionInfo[] trans = new TransactionInfo[n];
        for (int i = 0; i < n; i++) {
            gb[i] = new GrahminBank1();
            gb[i].getDetails();
        }
        for (int i = 0; i < n; i++) {
            account1[i] = new SavingAccount();
            account1[i].accNumber();
        }
        for (int i = 0; i < n; i++) {
            account1[i] = new SavingAccount();
            trans[i] = new TransactionInfo(account1[i].getAccNo());

        }
        String lname;
        System.out.println("enter the last name");
        lname = sc.next();
        for (int i = 0; i < n; i++) {
            if (lname.equals(gb[i].getLastName())) {
                account1[i] = new SavingAccount();
                System.out.println("firstName :" + gb[i].getFirstName());
                System.out.println("lastName :" + gb[i].getLastName());
                System.out.println("id :" + gb[i].getId());
                System.out.println("phno :" + gb[i].getPhno());
                gb[i].getAddress().displayDetails();
                account1[i].display();
            }
        }
        String village;
        System.out.println("enter the village");
        village = sc.next();
        System.out.println("firstName\t\tlastName\t\tid\t\tphno\t\tstate\t\tvillage");
        for (int i = 0; i < n; i++) {
            if (village.equals(gb[i].getAddress().getVillage())) {
                System.out.println(gb[i].getFirstName() + "\t\t" + gb[i].getLastName() + "\t\t" + gb[i].getId() + "\t\t"
                        + gb[i].getAddress().getState() + "\t\t" + gb[i].getAddress().getVillage());
            }
        }
        System.out.println("enter account number to transfer the money : ");
        long acc1 = sc.nextLong();
        if (acc1 != 0) {

            for (int i = 0; i < n; i++) {
                if (acc1 == account1[i].getAccNo()) {
                    long noOfDaysBetween;
                    System.out.println("enter the no.of days between");
                    noOfDaysBetween = sc.nextLong();
                    if (noOfDaysBetween < 365) {
                        trans1.transaction();
                    } else {
                        System.out.println("This is Dormant account and a fresh customer KYC needs to be done :");
                    }
                }

                else {
                    System.out.println("entered account number is incorrect ");
                }
            }
        } else {
            System.out.println("enter account number is incorrect");
        }
    }
}
