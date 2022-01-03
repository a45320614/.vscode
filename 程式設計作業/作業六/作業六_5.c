#include<stdio.h>

int main()
{
    int n,h[60],sum=0,avg,a,count=0;
        do
        {
        scanf("%d",&n);

        count++;

        sum=0;
        a=0;


        for(int i=0;i<n;i++)
        {
          scanf("%d",&h[i]);
          sum+=h[i];

        }
        avg=sum/n;

        for(int j=0;j<n;j++)
        {

            if(h[j]>avg)
            a=a+(h[j]-avg);
            else if(h[j]<avg)
            a=a+(avg-h[j]);

        }
        a/=2;

        printf("Set #%d\n",count);
        printf("The minimum number of moves is %d\n",a);

        }while(n<=10 || n!=0);

    return 0;

}
