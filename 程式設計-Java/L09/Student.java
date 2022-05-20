public class Student{
    protected String name;
    protected String major;
    protected int credits=0;
    public Student(String name, String major){
        setName(name);
        setMajor(major);
    } 
    public void setName(String name){
        this.name=name;
    }
    public void setMajor(String major){
        this.major=major;
    }
    public int getCredits(){
        return credits;
    }
    public void addCredits(int credits){
        this.credits+=credits;
    }
}