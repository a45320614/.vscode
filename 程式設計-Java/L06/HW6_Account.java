import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;

public class HW6_Account {
    public static void main(String [] args){
        HW6_Customer c=new HW6_Customer();
        ArrayList<String> Customer=new ArrayList<String>();
        int answer1=Integer.parseInt(JOptionPane.showInputDialog(null,"�w��ϥΥ��Ȧ�t��!�п��:\n(1)�Ыؤ@�ӱb��\n(2)����ާ@\n(3)�h�X���t��"));
        do{
            if(answer1==1){
                c.setName(JOptionPane.showInputDialog(null,"��J�U�ȦW��:"));
                c.setAccnum(JOptionPane.showInputDialog(null,"��J�b��:"));
                c.setMoney(Double.parseDouble(JOptionPane.showInputDialog(null,"��J�n�s�񪺪��B:")));
                c.creatAccount(c.getName(),c.getAccnum(),c.getMoney());
            }
            else if(answer1==2){
                c.setAccnum(JOptionPane.showInputDialog(null,"��J�b��:"));
                if(Customer.get(i).getAcctNo().equals(acctNO)){
                    JOptionPane.showMessageDialog(null,"��즹�U��!");
                    int answer2=Integer.parseInt(JOptionPane.showInputDialog(null,"�A�n�A"+c.getName()+"�A���{���]����:"+c.getMoney()+"\n�п��:\n(1)�s��\n(2)���\n(3)��ܾl�B\n(4)����"));
                    if(answer2!=4){
                        if(answer2==1){
                            c.setMoney(Double.parseDouble(JOptionPane.showInputDialog(null,"��J�n�s�񪺪��B:")));
                        }
                        if(answer2==2){
                            c.withdraw(Double.parseDouble(JOptionPane.showInputDialog(null,"��J�n��������B:")));
                        }
                        if(answer2==3){
                            JOptionPane.showMessageDialog(null,"�A���l�B��:"+c.getMoney());
                        }
                    }
                }
            }
        }while(answer1!=3);
    }
    
}
