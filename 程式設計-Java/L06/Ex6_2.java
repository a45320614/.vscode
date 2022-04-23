package L06;
public class Ex6_2{
    public static void main(String [] args){
        Ex6_2_1 a1=new Ex6_2_1("John","001",100);
        a1.deposit(995.5);
        a1.withdraw(800);
        System.out.println(a1);
    }
}