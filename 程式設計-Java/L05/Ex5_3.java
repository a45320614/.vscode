package L05;
import java.util.Random;
public class Ex5_3 {
    public static void main(String [] args){
        Random r=new Random();
        int i=0,j=0,arr[]=new int [6];
        for(i=0;i<6;i++){
            arr[i]=r.nextInt(6)+1;
            for(j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    arr[i]=r.nextInt(6)+1;
                    i--;
                }
            }
        }
        for(i=0;i<6;i++){
            System.out.printf("%d\n",arr[i]);
        }
    }
}
