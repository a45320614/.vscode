package L02;
import java.util.Scanner;

public class HW2_2 {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        String name="",none="none";
        int earnings=0,n=1;
        double tax=0;
        while(n!=0){
            System.out.println("Enter your name:");
            name=input.next();
            System.out.println("Enter your earnings:");
            earnings=input.nextInt();
            if(earnings>30000){
                tax=(double)earnings*0.2;
            }
            else if(earnings<=30000){
                tax=(double)earnings*0.15;
            }
            System.out.printf("Your total tax is %.2f.\n\n",tax);
            System.out.println("Do you want to continue?(1/0)");
            n=input.nextInt();
        }
        
    }
    
}
