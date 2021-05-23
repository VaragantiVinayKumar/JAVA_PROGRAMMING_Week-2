public class Petrol extends IcEngine {

    public Petrol(int cylinders, int displacement, String compressionRatio) {
        super(cylinders, displacement, compressionRatio);
    }

    public Petrol(int mPower, int mRpm, int mTorque, int weight, String modelNumber, int cylinders, int displacement,
            String compressionRatio) {
        super(mPower, mRpm, mTorque, weight, modelNumber, cylinders, displacement, compressionRatio);
    }

    public Petrol(String modelNumber){
        super();
        switch(modelNumber){
            case "P1000":
                        setDisplacement(996);
                        setmPower(50);
                        setmRpm(6000);
                        setmTorque(90);
                        setWeight(75);
                        setCylinders(3);
                        setCompressionRatio("11.0:1");
                        break;
            case "P1500":
                        setDisplacement(1498);
                        setmPower(88);
                        setmRpm(6500);
                        setmTorque(155);
                        setWeight(93);
                        setCylinders(4);
                        setCompressionRatio("10.3:1");
                        break;  
            case "P2000":
                        setDisplacement(1992);
                        setmPower(118);
                        setmRpm(6500);
                        setmTorque(220);
                        setWeight(125);
                        setCylinders(4);
                        setCompressionRatio("12.0:1");
                        break;  
            case "P2400":
                        setDisplacement(2396);
                        setmPower(138);
                        setmRpm(6900);
                        setmTorque(340);
                        setWeight(140);
                        setCylinders(6);
                        setCompressionRatio("10.5:1");
                        break;  
            default:System.out.println("invalid model numbers");                                          
        }                
    }


    @Override
    public void showSpecs(String modelNumber){
        String engineType="Internal Combustion";
        String powerSource="Petrol";
        switch(modelNumber){
            case "P1000":
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
            case "P1500":
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

            case "P2000":
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

            case "P2400":
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
