public class UnderGraduate extends Student{
    private boolean honor=false;
    public  UnderGraduate(String name, String major){
        super(name,major);
    }
    public int tuition(){
        return (honor==true)?500*getCredits():1000*getCredits();
    }
    public void setHonor(boolean honor){
        this.honor=honor;
    }
    
}