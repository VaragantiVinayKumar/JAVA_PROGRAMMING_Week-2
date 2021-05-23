import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SalesAnalyzer {
    public static void main(String[] args) throws Exception {
        int count = fCount();
        Sales s = new Sales();
        Sales[] s1 = new Sales[count];
        SalesOperations sales = new SalesOperations();
        FileReader file = new FileReader(
                "D://PGP FULL STACK//challenge-31-boilerplate-ecommerce//data//purchase_details.csv");
        BufferedReader reader = new BufferedReader(file);
        String line = "";
        int i = 0;
        line = reader.readLine();
        while ((line = reader.readLine()) != null) {
            String[] temp = line.split(",");
            if ((temp[0].equals(null)) || (temp[1].equals(null)) || (temp[2].equals(null)) || (temp[3].equals(null))
                    || (temp[4].equals(null)) || (temp[5].equals(null)) || (temp[6].equals(null))) {

                break;
            }

            else {
                s.setDate(temp[0]);
                s.setCustomerId(temp[1]);
                s.setProductCat(temp[2]);
                s.setPayMethod(temp[3]);
                s.setValue(temp[4]);
                s.setTimeOnSite(temp[5]);
                s.setClicksInSite(temp[6]);
                s1[i] = new Sales(s.getDate(), s.getCustomerId(), s.getProductCat(), s.getPayMethod(), s.getValue(),
                        s.getTimeOnSite(), s.getClicksInSite());
            }

            i++;
        }
        file.close();
        reader.close();
        sales.uniqueNumberofProducts(s1, i);
        sales.prefferedModeofPayment(s1);
        sales.averageNumberofClicks(s1);
        sales.maxAmtOfTotSales(i, s1);
        sales.maxSoldProduct(i, s1);
    }

    public static int fCount() throws IOException {
        FileReader file = new FileReader(
                "D://PGP FULL STACK//challenge-31-boilerplate-ecommerce//data//purchase_details.csv");
        BufferedReader reader = new BufferedReader(file);
        String line;
        line = reader.readLine();
        int count = 0;
        while ((line = reader.readLine()) != null) {
            count++;
        }
        reader.close();
        return count;
    }
}
