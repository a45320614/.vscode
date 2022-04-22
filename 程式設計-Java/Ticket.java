public class Ticket {
    private int price;
    private String date;
    private String name;
    

    public Ticket(String date,int price){
        setDate(date);
        setPrice(price);
    }
    public Ticket(String date,String name){
        setDate(date);
        setName(name);
        setPrice(10);
    }
    public void setDate(String date){
        this.date=date;
    }
    public String getDate(){
        return date;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return ((getName()==null)? getDate()+"��X�@�i���C����:"+getPrice():getDate()+"�e�X�@�i���C�Q��:"+getName()); 
    }

}
