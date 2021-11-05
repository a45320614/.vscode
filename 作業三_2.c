#include<stdio.h>
int main()
{
    int n,sell;
    float money;
    scanf("%d %d",&n,&sell);
    if(n=1)
    {
        money=sell*2.98;
    }
    if(n=2)
    {
        money=sell*4.5;
    }
    if(n=3)
    {
        money=sell*9.98;
    }
    if(n=4)
    {
        money=sell*4.49;
    }
    if(n=5)
    {
        money=sell*6.87;
    }
    printf("%f",money);
}