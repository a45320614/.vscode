import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;

public class HW6_Account {
    public static void main(String [] args){
        HW6_Customer c=new HW6_Customer();
        ArrayList<String> Customer=new ArrayList<String>();
        int answer1=Integer.parseInt(JOptionPane.showInputDialog(null,"歡迎使用本銀行系統!請選擇:\n(1)創建一個帳號\n(2)執行操作\n(3)退出本系統"));
        do{
            if(answer1==1){
                c.setName(JOptionPane.showInputDialog(null,"輸入顧客名稱:"));
                c.setAccnum(JOptionPane.showInputDialog(null,"輸入帳號:"));
                c.setMoney(Double.parseDouble(JOptionPane.showInputDialog(null,"輸入要存放的金額:")));
                c.creatAccount(c.getName(),c.getAccnum(),c.getMoney());
            }
            else if(answer1==2){
                c.setAccnum(JOptionPane.showInputDialog(null,"輸入帳號:"));
                if(Customer.get(i).getAcctNo().equals(acctNO)){
                    JOptionPane.showMessageDialog(null,"找到此顧客!");
                    int answer2=Integer.parseInt(JOptionPane.showInputDialog(null,"你好，"+c.getName()+"你的現有財產為:"+c.getMoney()+"\n請選擇:\n(1)存錢\n(2)領錢\n(3)顯示餘額\n(4)取消"));
                    if(answer2!=4){
                        if(answer2==1){
                            c.setMoney(Double.parseDouble(JOptionPane.showInputDialog(null,"輸入要存放的金額:")));
                        }
                        if(answer2==2){
                            c.withdraw(Double.parseDouble(JOptionPane.showInputDialog(null,"輸入要領取的金額:")));
                        }
                        if(answer2==3){
                            JOptionPane.showMessageDialog(null,"你的餘額為:"+c.getMoney());
                        }
                    }
                }
            }
        }while(answer1!=3);
    }
    
}
