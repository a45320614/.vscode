#include<stdio.h>
int main()
{
    int n,m1,m2,m3,t1,m4,m5,n1;
    printf("請輸入薪資代碼:");
    scanf("%d",&n);
    switch(n){
    case 1:
        printf("請輸入經理人員固定周薪:");
        scanf("%d",&m1);
        printf("該經理人員的周薪為:%d",m1);
        break;
    case 2:
        printf("請輸入時薪工每周工作時數:");
        scanf("%d",&t1);
        printf("請輸入每小時工資:");
        scanf("%d",&m2);
        if(t1<=40)
        {
            m3=t1*m2;
            printf("%d %d",t1,m2);
        }
        else
        {
            m3=(40*m2)+(t1-40)*m2*1.5;
        }
        printf("該時薪工的周薪為:%d",m3);     
        break;
    case 3:
    
        printf("請輸入當周銷售金額:");
        scanf("%d",&m4);
        m5=250+m4*0.057;
        printf("該抽傭金工的周薪為:%d",m5);
        break;
    case 4:
        printf("請輸入當週生產件數:");
        scanf("%d",n1);
        break;
    }
}