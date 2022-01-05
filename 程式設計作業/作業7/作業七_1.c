#include<stdio.h>
#include<stdlib.h>
int main()
{
    int arr[5]={31,17,33,22,16},i;
    for(i=0;i<5;i++)
    {
        *(arr+i)+=10;
    }
    for(i=0;i<5;i++)
    {
        printf("%d \n",*(arr+i));
    }


}