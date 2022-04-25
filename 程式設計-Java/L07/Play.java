public class Play {
    public static void main(String [] args){
        TicTacToe start=new TicTacToe();
        int P1win=0,P2win=0,draw=0,count=0;
        do{
            start.P1_move();
            count++;
            for(int i=0;i<3;i++){
                    if(start.arr[i][0]=="X"&&start.arr[i][1]=="X"&&start.arr[i][2]=="X"){
                        P1win=1;
                    }
                    else if(start.arr[0][i]=="X"&&start.arr[1][i]=="X"&&start.arr[2][i]=="X"){
                        P1win=1;
                    }
                    else if(start.arr[0][0]=="X"&&start.arr[1][1]=="X"&&start.arr[2][2]=="X"){
                        P1win=1;
                    }
                    else if(start.arr[0][2]=="X"&&start.arr[1][1]=="X"&&start.arr[2][0]=="X"){
                        P1win=1;
                    }
                    else if(count==9){
                        draw=1;
                    }
            }
            if(P1win==1){
                System.out.println("P1win");
                break;
            }
            if(draw==1){
                System.out.println("Draw!");
                break;
            }
            start.P2_move();
            count++;
            for(int i=0;i<3;i++){
                if(start.arr[i][0]=="O"&&start.arr[i][1]=="O"&&start.arr[i][2]=="O"){
                    P2win=1;
                }
                else if(start.arr[0][i]=="O"&&start.arr[1][i]=="O"&&start.arr[2][i]=="O"){
                    P2win=1;
                }
                else if(start.arr[0][0]=="O"&&start.arr[1][1]=="O"&&start.arr[2][2]=="O"){
                    P2win=1;
                }
                else if(start.arr[0][2]=="O"&&start.arr[1][1]=="O"&&start.arr[2][0]=="O"){
                    P2win=1;
                }
                else if(count==9){
                    draw=1;
                }
        }
        if(P2win==1){
            System.out.println("P2win");
            break;
        }
        if(draw==1){
            System.out.println("Draw!");
            break;
        }
        }while(P1win==0&&P2win==0&&draw==0);
    }
}
