#include<stdio.h>
int main()
{   
    int i,j,n;
    int count=0,count1,count2,countn;
    scanf("%d %d",&i,&j);
    if(i<j)
    {
        countn=j-i+1;
    }
    if(j<i)
    {
        countn=i-j+1;
    }
    while(countn!=0)
    {
        if(i>j)
        {
            while(j<=i)
            {
                n=j;
                count=0;
                while(n!=1)
                {  
                    count++;          
                    if(n%2==0)
                    {
                    n=n/2;
                    }
                    else
                    {
                    n=3*n+1; 
                    }
                                    
                }
            }
        }
        else
        {
            while(i<=j)
            {
                n=i;
                count=0;
                while(n!=1)
                {
                    count++;          
                    if(n%2==0)
                    {
                    n=n/2;
                    }
                    else
                    {
                    n=3*n+1; 
                    }                    
                }
            }
        }
        i++;
        count++;
        count1=count;
          
        if(count1>count)
        {
        count2=count1;
        }
        else
        {
        count2=count;
        }
        countn--;
    }
}


