public class HW4_2 {
    public static void main(String args []){
        gcd();
    }
    public static void gcd(){
        int n1=27;
        int n2=51;
        int a[]=new int[n1];
        int b[]=new int[n2];
        int count1=0,count2=0;  
        int temp=0;
        int i,j;
        for(i=1;i<=n1;i++){
            if(n1%i==0){
                a[count1]=i;
                count1++;
            }
        }
        for(i=1;i<=n2;i++){
            if(n2%i==0){
                b[count2]=i;
                count2++;
            }
        }
        for(i=0;i<count1;i++){
            for(j=0;j<count2;j++){
                if(a[i]==b[j]){
                    temp=a[i];
                }
            }
        }
        System.out.printf("%d",temp);
    }
}
