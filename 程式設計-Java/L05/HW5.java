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
            System.out.println("請選擇頭等艙或經濟艙:");
            int classtype=s.nextInt();
            if(count1==5){
                System.out.println("頭等艙已滿，請選擇經濟艙");
                classtype=2;
            }
            if(count2==5){
                System.out.println("經濟艙已滿，請選擇頭等艙");
                classtype=1;
            }
            if(classtype==1&&count1<5){
                do{
                    seat=r.nextInt(5);
                }while(available[seat]==true);
                System.out.printf("你的座位是%d\n",seat+1);
                available[seat]=true;
                count1++;
            }
            if(classtype==2&&count2<5){
                do{
                    seat=r.nextInt(5)+5;
                }while(available[seat]==true);
                System.out.printf("你的座位是%d\n",seat+1);
                available[seat]=true;
                count2++;
            }
        }while(count1<5||count2<5);
        System.out.println("本班機已滿，請搭乘下一班");
    }
}
