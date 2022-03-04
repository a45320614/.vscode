#include<stdio.h>
int main()
{
    int i,n,a,count=0;
    do
    {
    scanf("%d",&n);
    int num[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&num[i]);
    }
    int sum=0;
    for(i=0;i<n;i++)
    {
        sum=num[i]+sum;
    }
    int target=sum/n;
    int move=0;
    for(i=0;i<n;i++)
    {
        if(num[i]>target)
        {
            a=num[i]-target;
            move=a+move;
        }
        else if(num[i]<target)
        {
            a=target-num[i];
            move=a+move;
        }
    }
    move=move/2;
    printf("Set #%d\n",count+1);
    printf("The minimum number of moves is %d\n",move);
    count++;
    }while(n!=0||count==10);
}