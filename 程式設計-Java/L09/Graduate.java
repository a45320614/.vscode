public class Graduate extends Student{
    private String advisor;
    public Graduate(String name, String major, String advisor){
        super(name,major);
        setAdvisor(advisor);
    }
    public int tuition(){
        return 1500*getCredits();
    }
    public void setAdvisor(String advisor){
        this.advisor=advisor;
    }
    public String getName(){
        return advisor;
    }

}