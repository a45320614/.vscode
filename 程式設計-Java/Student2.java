public class Student2 {
    private String name;
    private String major;

    public Student2(String name){
        setName(name);
    }
    public Student2(String name,String major){
        setName(name);
        setMajor(major);
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setMajor(String major){
        this.major=major;
    }
    public String getMajor(){
        return major;
    }
    public String toString(){
        return "�ǥͩm�W:"+getName()+((getMajor()!=null)? " �t��:"+getMajor() : " �����t");
    }
}


