#include<stdio.h>
void Swap(int *,int *);
int main()
{
    int a,b;
    printf("Please input two numbers...\n");
    scanf("%d %d",&a,&b);
    printf("a=%d, b=%d\n",a,b);
    Swap(&a,&b);
    printf("After swap.\n");
    printf("a=%d, b=%d",a,b);
}
void Swap(int *a,int *b)
{
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;
}