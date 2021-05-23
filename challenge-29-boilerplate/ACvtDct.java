public class ACvtDct extends Transmission {
    
    public ACvtDct(String modelNumber) {
        super(modelNumber);   
    }
    @Override
    public void showSpecs(String modelnumber){
        String transType="Automated CVT";
        String transType1="Automated DCT";
        switch(modelnumber){
            case "CVT6":System.out.println("Transmission Type                      :"+transType);
                        System.out.println("Model Number                           :"+modelnumber);
                        System.out.println("Forward Gear                           :"+getFrGR());
                        System.out.println("1ST Gear Ratio                         :"+getFirstGR());
                        System.out.println("2ND Gear Ratio                         :"+getSecondGR());
                        System.out.println("3RD Gear Ratio                         :"+getThirdGR());
                        System.out.println("4TH Gear Ratio                         :"+getFourthGR());
                        System.out.println("5TH Gear Ratio                         :"+getFifthGR());
                        System.out.println("6TH Gear Ratio                         :"+getSixthGR());
                        break; 

            case "DCT8":System.out.println("Transmission Type                      :"+transType1);
                        System.out.println("Model Number                           :"+modelnumber);
                        System.out.println("Forward Gear                           :"+getFrGR());
                        System.out.println("1ST Gear Ratio                         :"+getFirstGR());
                        System.out.println("2ND Gear Ratio                         :"+getSecondGR());
                        System.out.println("3RD Gear Ratio                         :"+getThirdGR());
                        System.out.println("4TH Gear Ratio                         :"+getFourthGR());
                        System.out.println("5TH Gear Ratio                         :"+getFifthGR());
                        System.out.println("6TH Gear Ratio                         :"+getSixthGR());
                        System.out.println("7Th Gear Ratio                         :"+getSeventhGR());
                        System.out.println("8Th Gear Ratio                         :"+getEigthGR());
                        break;

            default:System.out.println("invalid model number");  
        }                 
    }   
}
