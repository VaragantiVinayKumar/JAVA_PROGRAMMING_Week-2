public  abstract class IcEngine extends Engine {
    private int cylinders;
    private int displacement;
    String compressionRatio;

    public IcEngine(){

    }

    public IcEngine(int cylinders,int displacement,String compressionRatio){
        this.cylinders=cylinders;
        this.displacement=displacement;
        this.compressionRatio=compressionRatio;
    }

    public IcEngine( int mPower, int mRpm, int mTorque, int weight, String modelNumber, int cylinders,
            int displacement, String compressionRatio) {
        super( mPower, mRpm, mTorque, weight, modelNumber);
        this.cylinders = cylinders;
        this.displacement = displacement;
        this.compressionRatio = compressionRatio;
    }
    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String getCompressionRatio() {
        return compressionRatio;
    }

    public void setCompressionRatio(String compressionRatio) {
        this.compressionRatio = compressionRatio;
    }

    public abstract  void showSpecs(String modelNumber);


        
    
}
