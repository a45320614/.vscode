import java.util.Scanner;

public class IC_3 {
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int a;
        System.out.println("畫出邊長為a的正方形口字，a設為(輸入一個大於3的正整數):");
        a=s.nextInt();
        for(int j=0;j<a;j++){
            System.out.print("口");
        }
        System.out.println();
        for(int i=1;i<a-1;i++){
            for(int j=0;j<a;j++){
                if(j==0|j==a-1){
                    System.out.print("口");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int j=0;j<a;j++){
            System.out.print("口");
        }
    }
}
