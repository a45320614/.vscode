#include <stdio.h>
#include <stdlib.h>

int isPerfect(int);

int main()
{
    int limit,x=0,i;
    printf("請輸入程式的上限:");
    scanf("%d",&limit);
    for(i=1;i<=limit;i++)
    {    
        x=isPerfect(i);
        if(x!=0&&x!=1&&x==i)
        { 
            printf("%d\n",x);
        }
    }    
}
int isPerfect(int n)
{ 
    int p,z=0,sum=0;
    for(p=2;p<=n;p++)
    {
        if(n%p==0)
        {
            z=n/p;
            sum=sum+z;
        } 
    }
    return sum;
}
