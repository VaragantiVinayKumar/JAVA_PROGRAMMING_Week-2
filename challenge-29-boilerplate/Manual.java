public class Manual extends Transmission {
    
    public Manual(String modelNumber) {
        super(modelNumber);
          
    }
    @Override
    public void showSpecs(String modelnumber){
        String transType="Manual";
        switch(modelnumber){
            case "MP4":System.out.println("Transmission Type                      :"+transType);
                       System.out.println("Model Number                           :"+modelnumber);
                       System.out.println("Forward Gear                           :"+getFrGR());
                       System.out.println("1ST Gear Ratio                         :"+getFirstGR());
                       System.out.println("2ND Gear Ratio                         :"+getSecondGR());
                       System.out.println("3RD Gear Ratio                         :"+getThirdGR());
                       System.out.println("4TH Gear Ratio                         :"+getFourthGR());
                       break; 

            case "MP5":System.out.println("Transmission Type                      :"+transType);
                       System.out.println("Model Number                           :"+modelnumber);
                       System.out.println("Forward Gear                           :"+getFrGR());
                       System.out.println("1ST Gear Ratio                         :"+getFirstGR());
                       System.out.println("2ND Gear Ratio                         :"+getSecondGR());
                       System.out.println("3RD Gear Ratio                         :"+getThirdGR());
                       System.out.println("4TH Gear Ratio                         :"+getFourthGR());
                       System.out.println("5TH Gear Ratio                         :"+getFifthGR());
                       break;     
                       
            case "MP6":System.out.println("Transmission Type                      :"+transType);
                       System.out.println("Model Number                           :"+modelnumber);
                       System.out.println("Forward Gear                           :"+getFrGR());
                       System.out.println("1ST Gear Ratio                         :"+getFirstGR());
                       System.out.println("2ND Gear Ratio                         :"+getSecondGR());
                       System.out.println("3RD Gear Ratio                         :"+getThirdGR());
                       System.out.println("4TH Gear Ratio                         :"+getFourthGR());
                       System.out.println("5TH Gear Ratio                         :"+getFifthGR());
                       System.out.println("6TH Gear Ratio                         :"+getSixthGR());
                       break; 
                       
            case "MD5":System.out.println("Transmission Type                      :"+transType);
                       System.out.println("Model Number                           :"+modelnumber);
                       System.out.println("Forward Gear                           :"+getFrGR());
                       System.out.println("1ST Gear Ratio                         :"+getFirstGR());
                       System.out.println("2ND Gear Ratio                         :"+getSecondGR());
                       System.out.println("3RD Gear Ratio                         :"+getThirdGR());
                       System.out.println("4TH Gear Ratio                         :"+getFourthGR());
                       System.out.println("5TH Gear Ratio                         :"+getFifthGR());
                       break;
                       
            case "MD6":System.out.println("Transmission Type                      :"+transType);
                       System.out.println("Model Number                           :"+modelnumber);
                       System.out.println("Forward Gear                           :"+getFrGR());
                       System.out.println("1ST Gear Ratio                         :"+getFirstGR());
                       System.out.println("2ND Gear Ratio                         :"+getSecondGR());
                       System.out.println("3RD Gear Ratio                         :"+getThirdGR());
                       System.out.println("4TH Gear Ratio                         :"+getFourthGR());
                       System.out.println("5TH Gear Ratio                         :"+getFifthGR());
                       System.out.println("6TH Gear Ratio                         :"+getSixthGR());
                       break;   
                       
            default:System.out.println("invalid model number");           
                                  
        }
    }
    
}
