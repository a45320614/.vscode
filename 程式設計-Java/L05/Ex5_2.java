package L05;
import java.util.Random;
import javax.swing.JOptionPane;
public class Ex5_2 {
    public static void main(String [] args){
        Random r=new Random();
        int reply;
        String name[]={"�i","��","��","��","�B"};
        reply=JOptionPane.showConfirmDialog(null,"�}�l�I�W");
        while(reply==0){
            reply=JOptionPane.showConfirmDialog(null,"�I��F "+name[r.nextInt(5)]+"\n�~���I�W��?");
        }
        
    }
}
