import javax.swing.JOptionPane;
public class Registration {
    public static void main(String [] args){
        int grades []=new int [5];
        double ave,total=0;
        String name=JOptionPane.showInputDialog("�ǥͩm�W:");
        String address=JOptionPane.showInputDialog("�a�}:");
        Student s1=new Student(name,address);

        for(int i=0;i<5;i++){
            grades[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"���Z"+(i+1)));
            total+=grades[i];
        }
        s1.setGrade(grades);
        ave=total/5;
        JOptionPane.showMessageDialog(null,s1+" �`����"+ave);
    }
}
