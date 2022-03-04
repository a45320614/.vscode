#include<stdio.h>
int main()
{
	int i,j,k,n=0,count[10]={0},onlyone=1;
	char input[100];
	for(i=0;i<10;i++)
	{
		onlyone=1;
		n=0;
		for(j=0;j<100;j++)
		{
			scanf("%c",&input[j]);
			if(input[j]=='\n')
			{
				break;
			}
			n++;
		}
		if(input[0]=='0')
        {
            break;
        }
		for(j=0;j<n;j++)
		{
			
			for(k=j+1;k<n;k++)
			{
				if(input[j]==input[k]&&input[j]!=0)
				{
					count[i]+=2;
					input[k]=0;
					k=n;
				}
				else if(onlyone)
				{
					onlyone--;
					count[i]++;
				}
				
			}
		}
		
	}
	for(i=0;i<10;i++)
	{
		if(count[i]!=0)
		printf("%d\n",count[i]);
	}
}