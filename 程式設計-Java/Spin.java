import javax.swing.JOptionPane;
import java.util.Random;
public class Spin{
    public static void spin(){
        Random r=new Random();
            String a="",b="",c="";
            int input=0;
            do{
                int fruit=r.nextInt(2);
                if(fruit==0){
                    a="����";
                }
                else{
                    a="���";
                }
                fruit=r.nextInt(2);
                if(fruit==0){
                    b="����";
                }
                else{
                    b="���";
                }
                fruit=r.nextInt(2);
                if(fruit==0){
                    c="����";
                }
                else{
                    c="���";
                }
                if(a!=b||a!=c||b!=c){
                    input=JOptionPane.showConfirmDialog(null,a+" "+b+" "+c+"\n���´f�U �~�򪱶�?");
                }
                else{
                    input=JOptionPane.showConfirmDialog(null,a+" "+b+" "+c+"\n���F!����! �~�򪱶�?");
                }
            }while(input==0);
    }
}
