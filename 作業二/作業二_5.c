#include<stdio.h>
int main()
{
	int n,count;
	scanf("%d",&n);
	while(n!=0)
	{	
		while(n%2==0&&n!=0)
		{			
			n=n/2;
			count++;
		}
		n--;
		count++;			
	} 
	printf("%d",count);	
}
