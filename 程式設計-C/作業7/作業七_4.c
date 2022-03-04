#include<stdio.h>
int SumTwoArray(int *,int *);
int main()
{
    int i,arr1[3],arr2[3],sum=0,temp;
    printf("Enter the first array(size 3):\n");
    for(i=0;i<3;i++)
    {
        scanf("%d",&arr1[i]);
    }
    printf("Enter the second array(size 3):\n");
    for(i=0;i<3;i++)
    {
        scanf("%d",&arr2[i]);
    }
    for(i=0;i<3;i++)
    {
        temp=SumTwoArray(&arr1[i],&arr2[i]);
        sum=temp+sum;
    }
    printf("The sum of two arrays is %d",sum);
    
}
int SumTwoArray(int *a,int *b)
{
    int sum;
    sum=*a+*b;
    return sum;
}