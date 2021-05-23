import java.util.Arrays;
public class SalesOperations {
    public void uniqueNumberofProducts(Sales[] sales,int count) throws Exception{
        
        int sum = 0;
        int first;
        int[] products = new int[count];
        
        
        for(int i=0;i<count;i++){
            
            products[i] = sales[i].getProductCat();

        }
        
        Arrays.sort(products);
        
        first = products[0];
        for (int i = 1; i < (count-1); i++) {
           if(products[i] != first){
               
                sum+=1;
                first = products[i];

           } 
        }

        System.out.println("no of unique products " + sum);

    }

    public void prefferedModeofPayment(Sales[] sales){
        
        String first = "credit";
        String second= "paypal";
        int sum1 = 0;
        int sum2 = 0;
        
        
        for (Sales s : sales) {
            
            if(s.getPayMethod().equals(first)){
                
                sum1+=1;

            }else if(s.getPayMethod().equals(second)){
                
                sum2+=1;

            }
        }

        if(sum1 > sum2){
            
            System.out.print("Preffered mode of payment: " + first);
            System.out.println(" " + sum1);

            }else{
            
                System.out.println("Preffered mode of payment: " + second);
                System.out.println(" " + sum2);

        }
    }

    public void averageNumberofClicks(Sales[] sales){
        int clicks = 0;
        for (int i = 0; i < sales.length; i++) {
            
            clicks += sales[i].getClicksInSite();

        }
        
        clicks /= sales.length;
        System.out.println(clicks);

    }

    public void maxAmtOfTotSales(int tcount, Sales[] s1) {
        float max=0.0f;
        int index=0;
        float prodAmt[]=new float[s1.length];
        int productIds[]= new int[tcount];
    
        for(int i=0;i<tcount;i++){
            productIds[i]=s1[i].getProductCat();
            prodAmt[i]=s1[i].getValue();
        }
        for(int i=0;i<s1.length;i++)
        {
            int prodCat= s1[i].getProductCat();
           prodAmt= iterateProduct(prodCat,tcount,productIds,s1);
        }
            for(int i=0;i<prodAmt.length;i++){
                if(prodAmt[i]>max){
                    max=prodAmt[i];
                    index=i;
                }
            }
        System.out.println("Max sale of product is "+productIds[index]+" sale is "+max);
    }
    
    
    public static float[] iterateProduct(int prodCat, int tcount, int[] productIds,Sales[] s1) {
        float amount=0.0f;  
        float[] maxSales=new float[s1.length];
            for(int i=0;i<s1.length;i++){
                if(prodCat==s1[i].getProductCat())
                {
                    
                    amount=amount+s1[i].getValue();
                    maxSales[i]=amount;
               
                }
            } 
        return maxSales;
    }

    public void maxSoldProduct(int tcount, Sales[] s1) {
        int elementArray[] = new int[tcount];
        int frequency[] = new int[tcount];
        int productIds[]= new int[tcount];
        for(int i=0;i<tcount;i++){
            productIds[i]=s1[i].getProductCat();
        }
        int [] fr = new int [productIds.length];  
        int visited = -1;  
            
        for(int i = 0; i < productIds.length; i++){  
            int count = 1;  
            for(int j = i+1; j < productIds.length; j++){  
                if(productIds[i] == productIds[j]){  
                    count++;  
                     //To avoid counting same element again  
                    fr[j] = visited;  
                       
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }   
        System.out.println("---------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------");  
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                elementArray[i]=productIds[i];
            frequency[i]=fr[i];
            System.out.println("    " + elementArray[i] + "    |    " + frequency[i]);  
        }  
        System.out.println("---------------------"); 
        int max= frequency[0];
        int index=0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > max) 
            {
                max = frequency[i];
                index=i; 
            }
        }
        System.out.println("Highest sold product catagery is: "+elementArray[index]+" ---> "+frequency[index]+" times");
    }  
    


    
}
