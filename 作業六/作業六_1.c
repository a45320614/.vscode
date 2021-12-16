#include<stdio.h>
int main()
{
    int arr[10]={},num,i;
    printf("請輸入一個整數:");
    scanf("%d",&num);
    while(num)
    {
        arr[num%10]++;
        num/=10;
    }
    for(i=0;i<10;i++)
    {
        if(arr[i]!=0)
        {
            printf("%d %d\n",i,arr[i]);
        }
    }


}

