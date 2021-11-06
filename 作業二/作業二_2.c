#include<stdio.h>
int main()
{
	int a;
	scanf("%d",&a);
	int i=2;
	while(a%i!=0)
	{
		i++;
	}
	if(i<a)
	{
		printf("硂计ぃ琌借计!");
	}
	else
		printf("硂计琌借计!");
	
}
