#include<stdio.h>
#include<string.h>
int main()
{
    int c,odd=0,i,j,count[10]={0},n=0;
    char letter[122]={0},input[100];
    printf("Please input:\n");
    
    for(c=0;c<10;c++)
    {
        count[10]=0,n=0,odd=0;
        for(j=0;j<100;j++)
        {
            scanf("%c",&input[j]);
            if(input[j]=='\n')
            {
                break;
            }
            n++;
        }
        for(j=0;j<n;j++)
        {
            for(i=0;i<122;i++)
            {
                if(input[j]==i)
                letter[i]++;
            }
            for(i=0;i<122;i++)
            {
                while(letter[i]!=0)
                {
                    if(letter[i]%2==0)
                    {
                        count[c]+=2;
                        letter[i]=letter[i]/2;
                    }
                    else if(letter[i]%2!=0)
                    {
                        odd++;
                        letter[i]--;
                    }
                }
                if(odd==1)
                {
                    count[c]++;
                }
            }
        }
 
    }
    for(i=0;i<10;i++)
    {
        printf("%d ",count[i]);
    }
}

    
