public class Diesel extends IcEngine {
    
    public Diesel(int cylinders, int displacement, String compressionRatio) {
        super(cylinders, displacement, compressionRatio);
    }

    public Diesel(int mPower, int mRpm, int mTorque, int weight, String modelNumber, int cylinders, int displacement,
            String compressionRatio) {
        super(mPower, mRpm, mTorque, weight, modelNumber, cylinders, displacement, compressionRatio);
    }

    public  Diesel(String modelNumber){
        super();
        switch(modelNumber){
            case "D1300":
                        setDisplacement(1248);
                        setmPower(67);
                        setmRpm(6000);
                        setmTorque(200);
                        setWeight(111);
                        setCylinders(4);
                        setCompressionRatio("17.6:1");
                        break;
            case "D1800":
                        setDisplacement(1796);
                        setmPower(103);
                        setmRpm(6300);
                        setmTorque(170);
                        setWeight(141);
                        setCylinders(4);
                        setCompressionRatio("10.5:1");
                        break;
            case "D2400":
                        setDisplacement(2384);
                        setmPower(136);
                        setmRpm(7000);
                        setmTorque(233);
                        setWeight(152);
                        setCylinders(4);
                        setCompressionRatio("11.2:1");
                        break;                        
            default:System.out.println("invalid model numbers");   
        }                
    }

    @Override
    public void showSpecs(String modelNumber){
        String engineType="Internal Combustion";
        String powerSource="Diesel";
        switch(modelNumber){
            case "D1300":
                        System.out.println("Engine Type           :\t"+engineType);
                        System.out.println("Power Source          :\t"+powerSource);
                        System.out.println("Model Number          :\t"+modelNumber);
                        System.out.println("Displacement          :\t"+getDisplacement());
                        System.out.println("Max Power             :\t"+getmPower());
                        System.out.println("Max RPM               :\t"+getmRpm());
                        System.out.println("Max Torque            :\t"+getmTorque());
                        System.out.println("Weight                :\t"+getWeight());
                        System.out.println("Cylinder              :\t"+getCylinders());
                        System.out.println("Compression Ratio     :\t"+getCompressionRatio());
                        break;
            case "D1800":
                        System.out.println("Engine Type           :\t"+engineType);
                        System.out.println("Power Source          :\t"+powerSource);
                        System.out.println("Model Number          :\t"+modelNumber);
                        System.out.println("Displacement          :\t"+getDisplacement());
                        System.out.println("Max Power             :\t"+getmPower());
                        System.out.println("Max RPM               :\t"+getmRpm());
                        System.out.println("Max Torque            :\t"+getmTorque());
                        System.out.println("Weight                :\t"+getWeight());
                        System.out.println("Cylinder              :\t"+getCylinders());
                        System.out.println("Compression Ratio     :\t"+getCompressionRatio());
                        break;
            case "D2400":
                        System.out.println("Engine Type           :\t"+engineType);
                        System.out.println("Power Source          :\t"+powerSource);
                        System.out.println("Model Number          :\t"+modelNumber);
                        System.out.println("Displacement          :\t"+getDisplacement());
                        System.out.println("Max Power             :\t"+getmPower());
                        System.out.println("Max RPM               :\t"+getmRpm());
                        System.out.println("Max Torque            :\t"+getmTorque());
                        System.out.println("Weight                :\t"+getWeight());
                        System.out.println("Cylinder              :\t"+getCylinders());
                        System.out.println("Compression Ratio     :\t"+getCompressionRatio());
                        break;
            
            default:System.out.println("invalid model numbers");  
        } 
    }    
        


    

    
    
}
