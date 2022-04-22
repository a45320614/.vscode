import java.util.Scanner;

public class IC_3 {
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int a;
        System.out.println("?e?X?????a??????£Vf?r?Aa?]??(??J?@??j??3???????):");
        a=s.nextInt();
        for(int j=0;j<a;j++){
            System.out.print("?f");
        }
        System.out.println();
        for(int i=1;i<a-1;i++){
            for(int j=0;j<a;j++){
                if(j==0|j==a-1){
                    System.out.print("?f");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int j=0;j<a;j++){
            System.out.print("?f");
        }
    }
}
