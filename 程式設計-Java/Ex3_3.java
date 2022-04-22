import java.util.Scanner;
  public class Ex3_3{
    public static void main(String args[]){
       int row;
       Scanner input = new Scanner(System.in);
       System.out.print("請問要印幾列的倒三角形星星?");
       row = input.nextInt();
       for(int i=0; i<row; i++){
           for(int j=1;j<=row;j++){
               System.out.print(j<=i?" ":"*");
           }
        System.out.println();

       }   
   }
}
