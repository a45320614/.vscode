public class HW4_1 {
    public static void main(String [] args){
        isPerfect(1000);
    }
    public static void isPerfect(int n){
        for(int i=1;i<=n;i++){
            int add=0;
            String factors="";
            for(int j=1;j<i;j++){
                if(i%j==0){
                    add+=j;
                    factors+=j+" ";
                }
            }
            if(i==add){
                System.out.printf("%d is perfect.\n     Factors:%s\n",i,factors);
            }
        }
    }
}
