

public class Ex6_2_1 {
    private String Aname;
    private String Anumber;
    private double Amoney=0;

    public Ex6_2_1(String name,String number,double money){
        setName(name);
        setNumber(number);
        Amoney-=money;
    }

    public void deposit(double money){
        setMoney(money);
    }
    public void withdraw(double money){
        Amoney-=money;
    }
    public void setName(String name){
        Aname=name;
    }
    public String getName(){
       return Aname;
    }
    public void setNumber(String number){
        Anumber=number;
    }
    public String getNumber(){
        return Anumber;
    }
    public void setMoney(double money){
        Amoney=money;
    }
    public double getMoney(){
        return Amoney;
    }
   
    
    public String toString(){
        return "Name:"+getName()+"Account number:"+getNumber()+"Your current balance:"+getMoney();
    }

}
