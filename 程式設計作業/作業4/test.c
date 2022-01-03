#include<stdio.h>
int main()
{
    int n,i=0,count=0,i1=0;
    scanf("%d",&n);
    while(n<=0||n>0&&n%2!=0)
    {
        printf("請再輸入一次\n");
        scanf("%d",&n);
    }
    while(count<n/2)
    {
        i1=i1+2;
        i=i+i1;
        count++;
    }
    printf("%d",i);
}
