#include<stdio.h>
#include<stdlib.h>
int triangle(int,int,int);
int main()
{
    int x,s1,s2,s3;
    printf("Enter side 1:");
    scanf("%d",&s1);
    printf("Enter side 2:");
    scanf("%d",&s2);
    printf("Enter side 3:");
    scanf("%d",&s3);
    
    if(triangle(s1,s2,s3))
    {
        printf("The numbers make a right triangle.");
    }
    else
    {
        printf("The numbers don't make a right triangle.");
    }
}
int triangle(int s1,int s2,int s3)
{
    printf("123");
    if(s1^2+s2^2==s3^2||s2^2+s3^2==s1^2||s1^2+s3^2==s2^2)
    {
        return 1;
        printf("1");
    }
    else
    {
        return 0;
        printf("0");
    }
}