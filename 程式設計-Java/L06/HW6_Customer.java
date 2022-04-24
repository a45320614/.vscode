import java.util.ArrayList;

public class HW6_Customer {
    private String name;
    private String accnum;
    private double money=0;
    

    public void creatAccount(String name,String accnum,double money){
        this.name=name;
        this.accnum=accnum;
        this.money=money;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAccnum(int accnum){
        this.accnum=accnum;
    }
    public String getAccnum(){
        return this.accnum;
    }
    public void setMoney(double money){
        this.money+=money;
    }
    public int getMoney(){
        return this.money;
    }
    public void withdraw(double money){
        if(this.money>0){
            this.money-=money;
        }
    }
}
