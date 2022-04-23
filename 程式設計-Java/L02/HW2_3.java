package L02;
import java.util.Scanner;

public class HW2_3 {
    public static void main(String [] args){
        int counter=0,number=0,largest=0;
        Scanner input=new Scanner(System.in);
        while(counter<10){
            System.out.println("Please input an integer:");
            number=input.nextInt();
            if(number>largest){
                largest=number;
            }
            counter++;
        }
        System.out.printf("The largest number is %d.",largest);

    }
}
