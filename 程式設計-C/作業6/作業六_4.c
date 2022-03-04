#include <stdio.h>
int main()
{   
    int n[20],i=0,j,a; 
        do
        {
            scanf("%d",&n[i]);
            i++;
        }while(getchar()!='\n');
    for(i=0;i<20;i++)
    {
        for(j=i+1;j<20;j++)
        {
            if(n[i]==n[j])
            {
                n[j]=0;
            }
        }
    }
    for(i=0;i<20;i++)
    {
        for(j=0;j<20;j++)
        {
            if(n[j]>n[i])
            {
                a=n[i];
                n[i]=n[j];
                n[j]=a;
            }
        }
    }
    for(i=0;i<20;i++)
    {
        if(n[i]!=0)
        {
            printf("%d ",n[i]);
        }
    }
}