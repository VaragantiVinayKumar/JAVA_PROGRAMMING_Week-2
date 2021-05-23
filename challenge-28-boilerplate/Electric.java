public class Electric extends Engine {

    private String currentType;
    private int voltage;

    public Electric(String currentType, int voltage) {
        this.currentType = currentType;
        this.voltage = voltage;
    }

    public Electric(int mPower, int mRpm, int mTorque, int weight, String modelNumber, String currentType,
            int voltage) {
        super(mPower, mRpm, mTorque, weight, modelNumber);
        this.currentType = currentType;
        this.voltage = voltage;
    }

    public String getCurrentType() {
        return currentType;
    }

    public void setCurrentType(String currentType) {
        this.currentType = currentType;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public Electric(String modelNumber){
        super();
        switch(modelNumber){
            case "88":
                      setmPower(88);
                      setmRpm(15000);
                      setmTorque(220);
                      setWeight(45);
                      setCurrentType("AC");
                      setVoltage(360);
                      break;

            default:System.out.println("invalid model numbers");             
        }
    }
    @Override
    public void showSpecs(String modelNumber){
        String engineType="Electric Motor";
        String powerSource="Electric";
        switch(modelNumber){
            case "88":
                        System.out.println("Engine Type           :\t"+engineType);
                        System.out.println("Power Source          :\t"+powerSource);
                        System.out.println("Model Number          :\t"+modelNumber);
                        System.out.println("Max Power             :\t"+getmPower());
                        System.out.println("Max RPM               :\t"+getmRpm());
                        System.out.println("Max Torque            :\t"+getmTorque());
                        System.out.println("Weight                :\t"+getWeight());
                        break;

            default:System.out.println("invalid model numbers");  
            
        }
    }        

    

    
}
