import java.util.Random;

public class TicTacToe {
    public enum state{X,O,EMPTY};
    public String arr [][]=new String[3][3];
    
    public TicTacToe(){ 
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                    arr[i][j]=state.EMPTY.name(); 
            }
        }
    }
    public void P1_move(){
        int i,j;
        Random r=new Random();
        i=r.nextInt(3);
        j=r.nextInt(3);
        while(arr[i][j]!=state.EMPTY.name())
        {
            i=r.nextInt(3);
            j=r.nextInt(3);
        }
        arr[i][j]=state.X.name();
        for(int k=0;k<3;k++){
            for(int l=0;l<3;l++){
                System.out.printf("%5s ",arr[k][l]);
            }
            System.out.println("\n");
        }
        System.out.printf("玩家1下在(%d,%d)\n",i,j);
    }
    public void P2_move(){
        int i,j;
        Random r=new Random();
        i=r.nextInt(3);
        j=r.nextInt(3);
        while(arr[i][j]!=state.EMPTY.name())
        {
            i=r.nextInt(3);
            j=r.nextInt(3);
        }
        arr[i][j]=state.O.name();
        for(int k=0;k<3;k++){
            for(int l=0;l<3;l++){
                System.out.printf("%5s ",arr[k][l]);
            }
            System.out.println("\n");
        }
        System.out.printf("玩家2下在(%d,%d)\n",i,j);
    }
}
