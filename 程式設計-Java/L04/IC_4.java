package L04;
import javax.swing.JOptionPane;

public class IC_4 {
    public static void main(String [] args){
        int n=JOptionPane.showConfirmDialog(null,"�}�l�����G���Q?");
        System.out.printf("%d",n);
        if(n==0){
            Sp.spin();
        }

    }
}
