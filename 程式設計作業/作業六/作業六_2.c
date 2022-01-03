#include<stdio.h>
int testPalindrome(void);
int main()
{
    int a;
    a=testPalindrome();
    printf("%d",a);
}
int testPalindrome(void)
{
    char arr[100];
    int i,n=0,y=0;
    gets(arr);
    for(i=0;arr[i]!='\0';i++)
    {
    }
    i--;
    do
    {
        if(arr[n]==arr[i])
        {
            y++;
        }
        i--;
        n++;
    }while(n!=i&&i-n!=1);
    if(y==i||y==i-1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}