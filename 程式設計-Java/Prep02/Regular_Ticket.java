package Prep02;
public class Regular_Ticket {
    private int price;
    private int quantity;
    private int totalprice;

    public Regular_Ticket(int p,int q){
        price=p;
        quantity=q;
    }
    public void sales(int q){
        setQuantity(q);
    }
    public void setQuantity(int q){
        quantity+=q;
    }
    public String toString(){
        return ("Regular ticket �֭p�P����B�F "+(price*quantity)+"��");
    }
}