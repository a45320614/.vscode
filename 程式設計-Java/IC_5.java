import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class IC_5{    
    public static void main(String[] args){
        int play []=new int[6];
        

        for(int i=0; i<6; i++){
            play[i] = Integer.parseInt(JOptionPane.showInputDialog("請投注第 " + (i+1) + " 個號碼<1至42>： "));  
        }
        Arrays.sort(play);

        int lotto[]=draw(); //開出六個中獎號碼
        check(play, lotto);  //對獎

    }    

    public static int [] draw(){ //可多利用EXE5_3
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
                JOptionPane.showMessageDialog(null,"中獎號碼為:"+lotto1[0]+" "+lotto1[1]+" "+lotto1[2]+" "+lotto1[3]+" "+lotto1[4]+" "+lotto1[5]+" "+"\n你的號碼為:"+play1[0]+" "+play1[1]+" "+play1[2]+" "+play1[3]+" "+play1[4]+" "+play1[5]+" "+"恭喜中頭獎!!!");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"中獎號碼為:"+lotto1[0]+" "+lotto1[1]+" "+lotto1[2]+" "+lotto1[3]+" "+lotto1[4]+" "+lotto1[5]+" "+"\n你的號碼為:"+play1[0]+" "+play1[1]+" "+play1[2]+" "+play1[3]+" "+play1[4]+" "+play1[5]+" "+"恭喜中二獎!!!");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"中獎號碼為:"+lotto1[0]+" "+lotto1[1]+" "+lotto1[2]+" "+lotto1[3]+" "+lotto1[4]+" "+lotto1[5]+" "+"\n你的號碼為:"+play1[0]+" "+play1[1]+" "+play1[2]+" "+play1[3]+" "+play1[4]+" "+play1[5]+" "+"恭喜中三獎!!!");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"中獎號碼為:"+lotto1[0]+" "+lotto1[1]+" "+lotto1[2]+" "+lotto1[3]+" "+lotto1[4]+" "+lotto1[5]+" "+"\n你的號碼為:"+play1[0]+" "+play1[1]+" "+play1[2]+" "+play1[3]+" "+play1[4]+" "+play1[5]+" "+"恭喜中四獎!!!");
                break;
            default:
                JOptionPane.showMessageDialog(null,"中獎號碼為:"+lotto1[0]+" "+lotto1[1]+" "+lotto1[2]+" "+lotto1[3]+" "+lotto1[4]+" "+lotto1[5]+" "+"\n你的號碼為:"+play1[0]+" "+play1[1]+" "+play1[2]+" "+play1[3]+" "+play1[4]+" "+play1[5]+" "+"銘謝惠顧...下次再來喔");
                break;
        }
        
    }
}