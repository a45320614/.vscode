public class MemberManagement {
    public static void main(String [] args){
        Club c=new Club();
        c.addMember(new Member("John",200));
        c.addMember(new Member("Mary",500));
        c.addMember(new Member("Helen",100));
        System.out.print(c);
        System.out.println("Total revenue from membership fee:"+c.totalFees());
        
    }
}
