import javax.swing.JOptionPane;

public class IC_4 {
    public static void main(String [] args){
        int n=JOptionPane.showConfirmDialog(null,"開始玩水果拉霸?");
        System.out.printf("%d",n);
        if(n==0){
            Sp.spin();
        }

    }
}
