#include<stdio.h>
#include<stdlib.h>
int main()
{
    int a = 0, b = 0, i = 2, n, count = 0;
    scanf("%d",&n);
     
        for(i;i<n;i++)
        {
            while(n%i==0)
            {
                b=a;
                a=n/i;
                
                
                n=a;
                
                
            }
            
            if(b%i==0)
            {
                count++;
            }
        }
        
        
        
        
    
    printf("%d",count);
}
