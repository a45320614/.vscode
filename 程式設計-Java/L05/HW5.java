import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class HW5 {
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        int seat,count1=0,count2=0;
        boolean available []=new boolean[10];
        for(int i=0;i<10;i++){
            available[i]=false;
        }
        do{
            System.out.println("�п���Y�����θg�ٿ�:");
            int classtype=s.nextInt();
            if(count1==5){
                System.out.println("�Y�����w���A�п�ܸg�ٿ�");
                classtype=2;
            }
            if(count2==5){
                System.out.println("�g�ٿ��w���A�п���Y����");
                classtype=1;
            }
            if(classtype==1&&count1<5){
                do{
                    seat=r.nextInt(5);
                }while(available[seat]==true);
                System.out.printf("�A���y��O%d\n",seat+1);
                available[seat]=true;
                count1++;
            }
            if(classtype==2&&count2<5){
                do{
                    seat=r.nextInt(5)+5;
                }while(available[seat]==true);
                System.out.printf("�A���y��O%d\n",seat+1);
                available[seat]=true;
                count2++;
            }
        }while(count1<5||count2<5);
        System.out.println("���Z���w���A�зf���U�@�Z");
    }
}
