import javax.swing.JOptionPane;
public class Registration {
    public static void main(String [] args){
        int grades []=new int [5];
        double ave,total=0;
        String name=JOptionPane.showInputDialog("學生姓名:");
        String address=JOptionPane.showInputDialog("地址:");
        Student s1=new Student(name,address);

        for(int i=0;i<5;i++){
            grades[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"成績"+(i+1)));
            total+=grades[i];
        }
        s1.setGrade(grades);
        ave=total/5;
        JOptionPane.showMessageDialog(null,s1+" 總平均"+ave);
    }
}
