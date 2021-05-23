abstract public class Transmission {
    private int frGR;
    private float firstGR,secondGR,thirdGR,fourthGR,fifthGR,sixthGR,seventhGR,eigthGR;

    public Transmission(String modelNumber) {
        switch(modelNumber){
            case "MP4":this.frGR=4;
                       this.firstGR=2.540f;
                       this.secondGR=1.920f;
                       this.thirdGR=1.510f;
                       this.fourthGR=1.000f;
                       break;
            case "MP5":this.frGR=5;
                       this.firstGR=3.545f;
                       this.secondGR=1.904f;
                       this.thirdGR=1.280f;
                       this.fourthGR=0.914f;
                       this.fifthGR=0.757f;  
                       break;
            case "MP6":this.frGR=6;
                       this.firstGR=3.010f;
                       this.secondGR=2.070f;
                       this.thirdGR=1.430f;
                       this.fourthGR=1.000f;
                       this.fifthGR=0.710f;
                       this.sixthGR=0.570f;  
                       break;
            case "MD5":this.frGR=5;
                       this.firstGR=3.545f;
                       this.secondGR=1.904f;
                       this.thirdGR=1.233f;
                       this.fourthGR=0.9111f;
                       this.fifthGR=0.603f; 
                       break;
            case "MD6":this.frGR=6;
                       this.firstGR=3.640f;
                       this.secondGR=2.150f;
                       this.thirdGR=1.360f;
                       this.fourthGR=1.000f;
                       this.fifthGR=0.750f;
                       this.sixthGR=0.630f;
                       break;
            case "AMTP4":this.frGR=4;
                         this.firstGR=2.540f;
                         this.secondGR=1.920f;
                         this.thirdGR=1.510f;
                         this.fourthGR=1.000f;   
                         break;
            case "AMTD5":this.frGR=5;
                         this.firstGR=2.950f;
                         this.secondGR=1.940f;
                         this.thirdGR=1.340f;
                         this.fourthGR=1.000f;
                         this.fifthGR=0.630f;  
                         break;
            case "CVT6":this.frGR=6;
                        this.firstGR=2.631f;
                        this.secondGR=1.440f;
                        this.thirdGR=1.165f;
                        this.fourthGR=0.906f;
                        this.fifthGR=0.680f;
                        this.sixthGR=0.499f;   
                        break;
            case "DCT8":this.frGR=8;
                        this.firstGR=4.714f;
                        this.secondGR=3.143f;
                        this.thirdGR=2.106f;
                        this.fourthGR=1.667f;
                        this.fifthGR=1.285f;
                        this.sixthGR=1.000f;
                        this.seventhGR=0.839f;
                        this.eigthGR=0.667f; 
                        break;
            default:System.out.println("invalid model number");                                                                                                   
                       
        
        }
    }    

    public int getFrGR() {
        return frGR;
    }

    public void setFrGR(int frGR) {
        this.frGR = frGR;
    }

    public float getFirstGR() {
        return firstGR;
    }

    public void setFirstGR(float firstGR) {
        this.firstGR = firstGR;
    }

    public float getSecondGR() {
        return secondGR;
    }

    public void setSecondGR(float secondGR) {
        this.secondGR = secondGR;
    }

    public float getThirdGR() {
        return thirdGR;
    }

    public void setThirdGR(float thirdGR) {
        this.thirdGR = thirdGR;
    }

    public float getFourthGR() {
        return fourthGR;
    }

    public void setFourthGR(float fourthGR) {
        this.fourthGR = fourthGR;
    }

    public float getFifthGR() {
        return fifthGR;
    }

    public void setFifthGR(float fifthGR) {
        this.fifthGR = fifthGR;
    }

    public float getSixthGR() {
        return sixthGR;
    }

    public void setSixthGR(float sixthGR) {
        this.sixthGR = sixthGR;
    }

    public float getSeventhGR() {
        return seventhGR;
    }

    public void setSeventhGR(float seventhGR) {
        this.seventhGR = seventhGR;
    }

    public float getEigthGR() {
        return eigthGR;
    }

    public void setEigthGR(float eigthGR) {
        this.eigthGR = eigthGR;
    }

    public abstract void showSpecs(String modelnumber);
    
}
