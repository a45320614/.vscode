#include<stdio.h>
int main()
{
    int n,m1,m2,m3,t1;
    printf("請輸入薪資代碼:");
    scanf("%d",&n);
    if(n=1)
    {
        printf("\n請輸入經理人員固定周薪:");
        scanf("%d",&m1);
        printf("該經理人員的周薪為:%d",m1);
    }
    if(n=2)
    {
        printf("\n請輸入時薪工每周工作時數:");
        scanf("%d",&t1);
        printf("\n請輸入每小時工資:");
        scanf("%d",m2);
        if(t1<=40)
        {
            m3=t1*m2;
        }
        else
        {
            m3=40*m2+(t1-40)*m2*1.5;
        }
        printf("該時薪工的周薪為:%d",m3);     
    }



}