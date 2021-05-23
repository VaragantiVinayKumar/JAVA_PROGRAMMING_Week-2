public class Sales{
   // date,customer_id,product_category,payment_method,value [USD],time_on_site [Minutes],clicks_in_site
   private String date;
   private long customerId;
   private int productCat;
   private String payMethod;
   private float value;
   private float timeOnSite;
   private int clicksInSite;
public int length;

   public Sales(String date, long customerId, int productCat, String payMethod, float value, float timeOnSite,
           int clicksInSite) {
       this.date = date;
       this.customerId = customerId;
       this.productCat = productCat;
       this.payMethod = payMethod;
       this.value = value;
       this.timeOnSite = timeOnSite;
       this.clicksInSite = clicksInSite;
   }

   public Sales() {
}

public String getDate() {
       return date;
   }

   public long getCustomerId() {
       return customerId;
   }

   public int getProductCat() {
       return productCat;
   }

   public String getPayMethod() {
       return payMethod;
   }

   public float getValue() {
       return value;
   }

   public float getTimeOnSite() {
       return timeOnSite;
   }

   public int getClicksInSite() {
       return clicksInSite;
   }

   public void setDate(String date) {
       this.date = date;
   }

   public void setCustomerId(String customerId) {
       try{
       this.customerId = Long.parseLong(customerId);
       }catch(NumberFormatException e){}
   }

   public void setProductCat(String productCat) {
       try{
       this.productCat = Integer.parseInt(productCat);
       }catch(NumberFormatException e){}
   }

   public void setPayMethod(String payMethod) {
       this.payMethod = payMethod;
   }

   public void setValue(String value) {
       try{
       this.value = Float.parseFloat(value);
       }catch(NumberFormatException e){}
   }
 
   public void setTimeOnSite(String timeOnSite) {
       try{
       this.timeOnSite = Float.parseFloat(timeOnSite);
       }catch(NumberFormatException e){}
   }

   public void setClicksInSite(String clicksInSite) {
       try{
       this.clicksInSite = Integer.parseInt(clicksInSite);
       }catch(NumberFormatException e){}
   }

}