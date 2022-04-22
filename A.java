public class A{
    public static void ma(){
        A a=new A();
        System.out.println("from ma");
        a.mb();
    }
    public void mb(){
        System.out.println("from mb");
    }
    public void mc(){
        mb();
    }

}
