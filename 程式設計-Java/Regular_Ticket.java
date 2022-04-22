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
        return ("Regular ticket 累計銷售金額達 "+(price*quantity)+"元");
    }
}