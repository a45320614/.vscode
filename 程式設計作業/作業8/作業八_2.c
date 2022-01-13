#include<stdio.h>
#include<string.h>
int main()
{
    char sentence[100];
    int j=0,i,count[10]={0};
    for(j=0;j<10;j++)
    {
        printf("Please input:");
        gets(sentence);
        if(sentence)
        {
            count[j]=1;
        }
        for(i=0;i<100;i++)
        {
            if(sentence[i]==' ')
            {
                count[j]++;
            }
        }
        if(sentence[i]<65||sentence[i]>90||sentence[i]<97||sentence[i]>122)
        {
            
        }
        if(sentence[0]=='0')
        {
            break;
        }
    }
    for(j=0;j<10;j++)
    {
        printf("%d ",count[j]);
    }
}