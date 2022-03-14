import javax.swing.JOptionPane;
import java.util.Random;

public class Ex3_4 {
    public static void main(String [] args){
        Random r=new Random();
        String output="";
        String input=JOptionPane.showInputDialog(null,"輸入一小於11大於1的正整數:");
        int input1=Integer.parseInt(input);
        for(int i=0;i<input1;i++){
            for(int j=0;j<input1;j++){
                output+=r.nextInt(input1);
            }
            output+="\n";
        }
        JOptionPane.showMessageDialog(null,output);
    }
}
