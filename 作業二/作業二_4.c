#include<stdio.h>
int main()
{
	int n,count,x;
	scanf("%d",&n);
	for(count;x<=5;x++)
	{
		if(n%10==7)
		{
			count++;
		}
	n=n/10;
	}		
printf("�`�@��%d�ӼƦr��7",count);
}
