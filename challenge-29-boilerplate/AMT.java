public class AMT extends Transmission {
    public AMT(String modelNumber){
        super(modelNumber);
    }

    @Override
    public void showSpecs(String modelnumber){
        String transType="Automated Manual";
        switch(modelnumber){
            case "AMTP4":System.out.println("Transmission Type                      :"+transType);
                         System.out.println("Model Number                           :"+modelnumber);
                         System.out.println("Forward Gear                           :"+getFrGR());
                         System.out.println("1ST Gear Ratio                         :"+getFirstGR());
                         System.out.println("2ND Gear Ratio                         :"+getSecondGR());
                         System.out.println("3RD Gear Ratio                         :"+getThirdGR());
                         System.out.println("4TH Gear Ratio                         :"+getFourthGR());
                         break; 

            case "AMTD5":System.out.println("Transmission Type                      :"+transType);
                         System.out.println("Model Number                           :"+modelnumber);
                         System.out.println("Forward Gear                           :"+getFrGR());
                         System.out.println("1ST Gear Ratio                         :"+getFirstGR());
                         System.out.println("2ND Gear Ratio                         :"+getSecondGR());
                         System.out.println("3RD Gear Ratio                         :"+getThirdGR());
                         System.out.println("4TH Gear Ratio                         :"+getFourthGR());
                         System.out.println("5TH Gear Ratio                         :"+getFifthGR());
                         break;

            default:System.out.println("invalid model number");  
        }                 
    }
}
