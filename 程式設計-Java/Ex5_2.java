import java.util.Random;
import javax.swing.JOptionPane;
public class Ex5_2 {
    public static void main(String [] args){
        Random r=new Random();
        int reply;
        String name[]={"張","李","王","陳","劉"};
        reply=JOptionPane.showConfirmDialog(null,"開始點名");
        while(reply==0){
            reply=JOptionPane.showConfirmDialog(null,"點到了 "+name[r.nextInt(5)]+"\n繼續點名嗎?");
        }
        
    }
}
