import javax.swing.JOptionPane;
import java.util.ArrayList;

public class HW6_Account {
    static ArrayList<HW6_Customer> Customer=new ArrayList<HW6_Customer>();
    public static void main(String [] args){
        int answer1;
        do{
            answer1=Integer.parseInt(JOptionPane.showInputDialog(null,"�w��ϥΥ��Ȧ�t��!�п��:\n(1)�Ыؤ@�ӱb��\n(2)����ާ@\n(3)�h�X���t��"));
            if(answer1==1){
                String name=JOptionPane.showInputDialog(null,"��J�U�ȦW��:");
                String accnum=JOptionPane.showInputDialog(null,"��J�b��:");
                Double money=Double.parseDouble(JOptionPane.showInputDialog(null,"��J�n�s�񪺪��B:"));
                Customer.add(new HW6_Customer(name,accnum,money));
            }
            else if(answer1==2){
                int a=-1;
                String accnum=JOptionPane.showInputDialog(null,"��J�b��:");
                for(int i=0;i<Customer.size();i++){
                    if(Customer.get(i).getAccnum().equals(accnum)){
                        a=i;
                        JOptionPane.showMessageDialog(null,"��즹�U��!");
                        int answer2=Integer.parseInt(JOptionPane.showInputDialog(null,"�A�n�A"+Customer.get(a).getName()+"�A���{���]����:"+Customer.get(a).getMoney()+"\n�п��:\n(1)�s��\n(2)���\n(3)��ܾl�B\n(4)����"));
                        if(answer2!=4){
                            if(answer2==1){
                                Customer.get(a).setMoney(Double.parseDouble(JOptionPane.showInputDialog(null,"��J�n�s�񪺪��B:")));
                                JOptionPane.showMessageDialog(null,"�A���l�B��:"+Customer.get(a).getMoney()+Customer.get(a).notenough());
                            }
                            if(answer2==2){
                                Customer.get(a).withdraw(Double.parseDouble(JOptionPane.showInputDialog(null,"��J�n��������B:")));
                                JOptionPane.showMessageDialog(null,"�A���l�B��:"+Customer.get(a).getMoney()+Customer.get(a).notenough());
                            }
                            if(answer2==3){
                                JOptionPane.showMessageDialog(null,"�A���l�B��:"+Customer.get(a).getMoney()+Customer.get(a).notenough());
                            }
                        }
                    }
                }
            }
        }while(answer1!=3);
    }
}
