import java.util.Scanner;
import java.util.Random;

public class Ex3_1{
    public static void main(String [] args){
        Random r=new Random();
        Scanner s=new Scanner(System.in);
        int ans;
        int right=0,wrong=0;
        System.out.println("開始測驗!");
        for(int i=0;i<5;i++){
        int q1=r.nextInt(9)+1;
        int q2=r.nextInt(9)+1;
        System.out.printf("%d * %d = ?\n",q1,q2);
        ans=s.nextInt();
        if(ans==q1*q2){
            right++;
        }
        else{
            wrong++;
        }
        }
        if(right>=4){
            System.out.print("數學資優生!");
        }
        else{
            System.out.print("要再加油!");
        }
    }
}