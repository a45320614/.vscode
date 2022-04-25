
public class HW6_Customer {
    private String name;
    private String accnum;
    private double money=0;
    private String s="";
    
    public HW6_Customer(String name,String accnum,double money){
        setAccnum(accnum);
        setMoney(money);
        setName(name);
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAccnum(String accnum){
        this.accnum=accnum;
    }
    public String getAccnum(){
        return this.accnum;
    }
    public void setMoney(double money){
        this.money+=money;
    }
    public double getMoney(){
        return this.money;
    }
    public void withdraw(double money){
        s="";
        if(this.money>money){
            this.money-=money;
        }
        else{
            s+="æl√B§£®¨";
        }
    }
    public String notenough(){
        return s;
    }
}
