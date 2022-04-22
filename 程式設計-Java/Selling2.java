public class Selling2{
    public static void main(String [] args){
        Regular_Ticket r=new Regular_Ticket(100,0);
        Special_Ticket s=new Special_Ticket(100,0,0.6);

        s.sales(10);
        r.sales(3);
        s.sales(5);
        r.sales(2);

        System.out.println(r);
        System.out.println(s);
    }
}