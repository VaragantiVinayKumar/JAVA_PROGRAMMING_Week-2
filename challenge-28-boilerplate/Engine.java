abstract public class Engine{
    private int mPower,mRpm,mTorque,weight;
    private String modelNumber; 

    public Engine() {
    }   
        public Engine(int mPower,int mRpm,int mTorque,int weight,String modelNumber) {
            super();
            this.mPower = mPower;        
            this.mRpm = mRpm;
            this.mTorque = mTorque;
            this.weight = weight;
            this.modelNumber=modelNumber;
       }

        public int getmPower() {
            return mPower;
        }

        public void setmPower(int mPower) {
            this.mPower = mPower;
        }

        public int getmRpm() {
            return mRpm;
        }

        public void setmRpm(int mRpm) {
            this.mRpm = mRpm;
        }

        public int getmTorque() {
            return mTorque;
        }

        public void setmTorque(int mTorque) {
            this.mTorque = mTorque;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public abstract  void showSpecs(String mNum);


        


}