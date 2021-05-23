public class CNG extends IcEngine {
    public CNG(int cylinders, int displacement, String compressionRatio) {
        super(cylinders, displacement, compressionRatio);
    }

    public CNG(int mPower, int mRpm, int mTorque, int weight, String modelNumber, int cylinders, int displacement,
            String compressionRatio) {
        super(mPower, mRpm, mTorque, weight, modelNumber, cylinders, displacement, compressionRatio);
    }

    public CNG(String modelNumber) {
        super();
        switch (modelNumber) {
        case "C1000":
            setDisplacement(998);
            setmPower(43);
            setmRpm(6000);
            setmTorque(78);
            setWeight(75);
            setCylinders(3);
            setCompressionRatio("11.0:1");
            break;
        case "C1500":
            setDisplacement(1498);
            setmPower(69);
            setmRpm(6500);
            setmTorque(122);
            setWeight(93);
            setCylinders(4);
            setCompressionRatio("10.5:1");
            break;
        default:
            System.out.println("invalid model numbers");
        }
    }

    @Override
    public void showSpecs(String modelNumber) {
        String engineType = "Internal Combustion";
        String powerSource = "CNG";
        switch (modelNumber) {
        case "C1000":
            System.out.println("Engine Type           :\t" + engineType);
            System.out.println("Power Source          :\t" + powerSource);
            System.out.println("Model Number          :\t" + modelNumber);
            System.out.println("Displacement          :\t" + getDisplacement());
            System.out.println("Max Power             :\t" + getmPower());
            System.out.println("Max RPM               :\t" + getmRpm());
            System.out.println("Max Torque            :\t" + getmTorque());
            System.out.println("Weight                :\t" + getWeight());
            System.out.println("Cylinder              :\t" + getCylinders());
            System.out.println("Compression Ratio     :\t" + getCompressionRatio());
            break;
        case "C1500":
            System.out.println("Engine Type           :\t" + engineType);
            System.out.println("Power Source          :\t" + powerSource);
            System.out.println("Model Number          :\t" + modelNumber);
            System.out.println("Displacement          :\t" + getDisplacement());
            System.out.println("Max Power             :\t" + getmPower());
            System.out.println("Max RPM               :\t" + getmRpm());
            System.out.println("Max Torque            :\t" + getmTorque());
            System.out.println("Weight                :\t" + getWeight());
            System.out.println("Cylinder              :\t" + getCylinders());
            System.out.println("Compression Ratio     :\t" + getCompressionRatio());
            break;
        default: {
            System.out.println("Invalid input");
        }
        }
    }

}
