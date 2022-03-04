#include<stdio.h>
int main()
{
    char *ptr="This is a test.";
    int i=0,count=0;
    while(*(ptr+i))
    {
        if(*(ptr+i)==' ')
        {
            count--;
        }
        i++;
        count++;
    }
    printf("%d",count);
}