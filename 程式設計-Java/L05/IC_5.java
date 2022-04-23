package L05;
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class IC_5{    
    public static void main(String[] args){
        int play []=new int[6];
        

        for(int i=0; i<6; i++){
            play[i] = Integer.parseInt(JOptionPane.showInputDialog("�Ч�`�� " + (i+1) + " �Ӹ��X<1��42>�G "));  
        }
        Arrays.sort(play);

        int lotto[]=draw(); //�}�X���Ӥ������X
        check(play, lotto);  //���

    }    

    public static int [] draw(){ //�i�h�Q��EXE5_3
        Random r=new Random();
        int i=0,j=0,arr[]=new int [6];
        for(i=0;i<6;i++){
            arr[i]=r.nextInt(9)+1;
            for(j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    arr[i]=r.nextInt(9)+1;
                    i--;
                }
            }
        }
        for(i=0;i<6;i++){
            System.out.printf("%d\n",arr[i]);
        }
        return arr;
    }
    public static void check(int play1[],int lotto1[]){
        int i=0,same=0,j=0;
        for(i=0;i<6;i++){
            for(j=0;j<6;j++){
                if(lotto1[j]==play1[i]){
                    same++;
                }
            }
        }   
        switch(same){
            case 6:
                JOptionPane.showMessageDialog(null,"�������X��:"+lotto1[0]+" "+lotto1[1]+" "+lotto1[2]+" "+lotto1[3]+" "+lotto1[4]+" "+lotto1[5]+" "+"\n�A�����X��:"+play1[0]+" "+play1[1]+" "+play1[2]+" "+play1[3]+" "+play1[4]+" "+play1[5]+" "+"���ߤ��Y��!!!");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"�������X��:"+lotto1[0]+" "+lotto1[1]+" "+lotto1[2]+" "+lotto1[3]+" "+lotto1[4]+" "+lotto1[5]+" "+"\n�A�����X��:"+play1[0]+" "+play1[1]+" "+play1[2]+" "+play1[3]+" "+play1[4]+" "+play1[5]+" "+"���ߤ��G��!!!");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"�������X��:"+lotto1[0]+" "+lotto1[1]+" "+lotto1[2]+" "+lotto1[3]+" "+lotto1[4]+" "+lotto1[5]+" "+"\n�A�����X��:"+play1[0]+" "+play1[1]+" "+play1[2]+" "+play1[3]+" "+play1[4]+" "+play1[5]+" "+"���ߤ��T��!!!");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"�������X��:"+lotto1[0]+" "+lotto1[1]+" "+lotto1[2]+" "+lotto1[3]+" "+lotto1[4]+" "+lotto1[5]+" "+"\n�A�����X��:"+play1[0]+" "+play1[1]+" "+play1[2]+" "+play1[3]+" "+play1[4]+" "+play1[5]+" "+"���ߤ��|��!!!");
                break;
            default:
                JOptionPane.showMessageDialog(null,"�������X��:"+lotto1[0]+" "+lotto1[1]+" "+lotto1[2]+" "+lotto1[3]+" "+lotto1[4]+" "+lotto1[5]+" "+"\n�A�����X��:"+play1[0]+" "+play1[1]+" "+play1[2]+" "+play1[3]+" "+play1[4]+" "+play1[5]+" "+"���´f�U...�U���A�ӳ�");
                break;
        }
        
    }
}