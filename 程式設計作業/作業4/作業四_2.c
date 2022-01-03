#include<stdio.h>
int main()
{    
    int n,i,a=0,b=0,count=0;
    printf("輸入一個整數:");
    scanf("%d",&n);
    for(i=2;i<=n;i++)
    {
        while(n!=1)
        {
            if(n%i==0)
            { 
                n=n/i;
            }
            else
            break;
            count++;
            b=a;
            a=i;
            if(a==b)
            {
                count--;
            }
        }
    }    
    printf("%d\n",count);
}
