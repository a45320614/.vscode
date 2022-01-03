#include<stdio.h>
#include<stdlib.h>

int fibonacci(int);
int main()
{
    int x;
    scanf("%d",&x);
    fibonacci(x);
}
int fibonacci(int num)
    {
        int a, b, c,n;
        a = 0;
        b = 1;
        n = num/3;
    
          while(n)
            {
            c = a + b;
            a = b + c;
            b = c + a;
            n--;
            }
            if(num % 3 == 0)
                printf("%d",c); 
            if(num % 3 == 1)
                printf("%d",a);
            if(num % 3 == 2)
                printf("%d",b);
    }
