

public class Student {
    private String Sname;
    private String Saddress;
    private int [] Sgrade;
    double ave,total=0;
    public Student(String name,String address){
        setAdress(address);
        setName(name);
    }
    public void setName(String name){
        Sname=name;
    }
    public String getName(){
        return Sname;
    }
    public void setAdress(String address){
        Saddress=address;
    }
    public String getAddress(){
        return Saddress;
    }
    public void setGrade(int [] grade){
        Sgrade=grade;
    }
    public int [] getGrade(){
        return Sgrade;
    }
    public String toString(){
        return "¾Ç¥Í©m¦W:"+getName();
    }

}
