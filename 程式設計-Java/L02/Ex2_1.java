package L02;
import java.util.Scanner;

public class Ex2_1{
	public static void main(String [] args){
	Scanner input=new Scanner(System.in);
    int vote=0,response,flag=0;
    int count1=0,count2=0,count3=0;
    while(flag!=-1){
        System.out.print("����̳��w���x�W�p�Y:(1)�䨧�G(2)�H����(3)�����C�п��:");
        response=input.nextInt();
        flag=response;
        if(response==1){count1++;}
        else if(response==2){count2++;}
        else if(response==3){count3++;}
        vote++;
    }
    vote--;
    double pa1=(double)count1/vote,pa2=(double)count2/vote,pa3=(double)count3/vote;
    System.out.print("���ﵲ�G:\n");
	System.out.printf("(1)�䨧�G:%d �o���v:%.2f\n",count1,pa1);
    System.out.printf("(2)�H����:%d �o���v:%.2f\n",count2,pa2);
    System.out.printf("(3)����:%d �o���v:%.2f\n",count3,pa3);
    int n=0;
    if(count1>count2&&count1>count3){n=1;}
    else if(count2>count1&&count2>count3){n=2;}
    else if(count3>count2&&count3>count1){n=3;}
    else {System.out.println("���ﵲ�G");}
    switch(n){
        case 1:
            System.out.print("�o���v�̰���:�䨧�G");
            break;
        case 2:
            System.out.print("�o���v�̰���:�H����");
            break;
        case 3:
            System.out.print("�o���v�̰���:����");
            break;
	}
    
}
}