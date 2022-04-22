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
                    a="香蕉";
                }
                else{
                    a="草莓";
                }
                fruit=r.nextInt(2);
                if(fruit==0){
                    b="香蕉";
                }
                else{
                    b="草莓";
                }
                fruit=r.nextInt(2);
                if(fruit==0){
                    c="香蕉";
                }
                else{
                    c="草莓";
                }
                if(a!=b||a!=c||b!=c){
                    input=JOptionPane.showConfirmDialog(null,a+" "+b+" "+c+"\n銘謝惠顧 繼續玩嗎?");
                }
                else{
                    input=JOptionPane.showConfirmDialog(null,a+" "+b+" "+c+"\n中了!恭喜! 繼續玩嗎?");
                }
            }while(input==0);
    }
}
