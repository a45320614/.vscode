#include<stdio.h>
int main()
{
    int n,count=0,a=1,b=1,c;
    printf("請輸入一個1~9的數:");
    scanf("%d",&n);
    while(count<n)
    {
        while(a<=n)
        {
            c=a*b;
            printf("%d*%d=%d ",a,b,c);
            a++;
        }
        printf("\n");
        b++;
        a=1;
        count++;
    } 
}