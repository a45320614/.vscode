public class Special_Ticket {
    private int price;
    private int quantity;
    private double discount;

    public Special_Ticket(int p,int q,double d){
        price=p;
        quantity=q;
        discount=d;
    }
    public void sales(int q){
        setQuantity(q);
    }
    public void setQuantity(int q){
        quantity+=q;
    }
    public String toString(){
        return ("Special ticket 累計銷售金額達 "+(price*quantity*discount)+"元");
    }
}