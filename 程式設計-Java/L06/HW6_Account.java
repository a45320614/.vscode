import javax.swing.JOptionPane;
import java.util.ArrayList;

public class HW6_Account {
    static ArrayList<HW6_Customer> Customer=new ArrayList<HW6_Customer>();
    public static void main(String [] args){
        int answer1;
        do{
            answer1=Integer.parseInt(JOptionPane.showInputDialog(null,"歡迎使用本銀行系統!請選擇:\n(1)創建一個帳號\n(2)執行操作\n(3)退出本系統"));
            if(answer1==1){
                String name=JOptionPane.showInputDialog(null,"輸入顧客名稱:");
                String accnum=JOptionPane.showInputDialog(null,"輸入帳號:");
                Double money=Double.parseDouble(JOptionPane.showInputDialog(null,"輸入要存放的金額:"));
                Customer.add(new HW6_Customer(name,accnum,money));
            }
            else if(answer1==2){
                int a=-1;
                String accnum=JOptionPane.showInputDialog(null,"輸入帳號:");
                for(int i=0;i<Customer.size();i++){
                    if(Customer.get(i).getAccnum().equals(accnum)){
                        a=i;
                        JOptionPane.showMessageDialog(null,"找到此顧客!");
                        int answer2=Integer.parseInt(JOptionPane.showInputDialog(null,"你好，"+Customer.get(a).getName()+"你的現有財產為:"+Customer.get(a).getMoney()+"\n請選擇:\n(1)存錢\n(2)領錢\n(3)顯示餘額\n(4)取消"));
                        if(answer2!=4){
                            if(answer2==1){
                                Customer.get(a).setMoney(Double.parseDouble(JOptionPane.showInputDialog(null,"輸入要存放的金額:")));
                                JOptionPane.showMessageDialog(null,"你的餘額為:"+Customer.get(a).getMoney()+Customer.get(a).notenough());
                            }
                            if(answer2==2){
                                Customer.get(a).withdraw(Double.parseDouble(JOptionPane.showInputDialog(null,"輸入要領取的金額:")));
                                JOptionPane.showMessageDialog(null,"你的餘額為:"+Customer.get(a).getMoney()+Customer.get(a).notenough());
                            }
                            if(answer2==3){
                                JOptionPane.showMessageDialog(null,"你的餘額為:"+Customer.get(a).getMoney()+Customer.get(a).notenough());
                            }
                        }
                    }
                }
            }
        }while(answer1!=3);
    }
}
