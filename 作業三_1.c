#include<stdio.h>
int main()
{   
    int i,j,n;
    int count,count1=0,count2=0,countn,count3;
    scanf("%d %d",&i,&j);
            while(j<=i)
            {
                n=j;
                count=0;  
                while(n!=1)
                {            
                    if(n%2==0)
                    {
                    n=n/2;
                    }
                    else
                    {
                    n=3*n+1; 
                    }
                    count++;                  
                }
                j++;
                count3=count1;
                count1=count;
                if(count3>count1&&count3>count2)
                {
                    count2=count3;
                }
                if(count1>count2)
                {
                    count2=count1;
                }
            }
            while(i<=j)
            {
                n=i;
                count=0;               
                while(n!=1)
                {         
                    if(n%2==0)
                    {
                    n=n/2;
                    }
                    else
                    {
                    n=3*n+1; 
                    }
                    count++;                    
                }  
                i++;
                count3=count1;
                count1=count;
                if(count3>count1&&count3>count2)
                {
                    count2=count3;
                }
                if(count1>count2)
                {
                    count2=count1;
                }
            }
    count2++;
    printf("%d",count2);
}


