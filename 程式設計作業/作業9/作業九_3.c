#include<stdio.h>
int main()
{
    int row,column,n,i,j=0,k=0;
    char alphabet[702]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    scanf("%d",&n);
    column=n%702;
    row=(n-column)/702+1;
    k=column%26;
    if(column<26)
    {
        j=0;
    }
    else
    {
        j=(column-k)/26;
    }
    k=k-1;
    j=j-1;
    if(n<=26)
    {
        i=n-1;
        printf("%d-%c\n",row,alphabet[i]);
    }
    else 
    {
        printf("%d-%c%c",row,alphabet[j],alphabet[k]);
    }
}