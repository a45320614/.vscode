import java.util.Scanner;

public class HW2_1{
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int n=0,response=0,fix=200;
        double sold=0,total=0,nfix=0;
        while(response!=-1){
        System.out.println("Enter the item you sold:(Enter -1 to stop)");
        response=input.nextInt();
        n=response;
        switch(n){
            case 1:
                sold+=239.99;
                break;
            case 2:
                sold+=129.75;
                break;
            case 3:
                sold+=99.95;
                break;
            case 4:
                sold+=350.89;
                break;
        }
    }
    nfix=sold*9/100;
    total=fix+nfix;
    System.out.printf("Total amount of your weekly salary is %.2f.",total);
}
}