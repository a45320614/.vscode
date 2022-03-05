import java.util.Scanner;
import java.util.Random;

public class C2_2{
    public static void main(String [] args){
        Random r=new Random();
        Scanner input=new Scanner(System.in);
        int i=0,ans;
        int right=0,wrong=0;
        System.out.println("start...");
        while(i<5){
        int q1=r.nextInt(6)+1;
        int q2=r.nextInt(6)+1;
        System.out.printf("%d * %d = ?\n",q1,q2);
        ans=input.nextInt();
        if(ans==q1*q2){
            right++;
        }
        else{
            wrong++;
        }
        i++;
        }
        if(right>=4){
            System.out.print("great");
        }
        else{
            System.out.print("good");
        }
    }
}