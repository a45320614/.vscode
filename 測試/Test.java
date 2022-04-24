import java.util.ArrayList;
import java.util.Arrays;
public class Test {
    public static void main(String [] args){ 
        int array1[]={5,4,3,2,1};
        Arrays.sort(array1);
        for(int i:array1){
            System.out.printf("%d ",i);
        }
        int array2[]=new int[5];
        Arrays.fill(array2,88);
        for(int j:array2){
            System.out.printf("%d ",j);
        }
        boolean a=Arrays.equals(array1,array2);
        System.out.printf("%s",a);
        int location=Arrays.binarySearch(array2,88);
        System.out.printf("kkk %d\n",location);
        ArrayList <String> items=new ArrayList<String>();
        items.add("red");
        items.add(1,"yellow");
        System.out.println(items.size());
    }
}
