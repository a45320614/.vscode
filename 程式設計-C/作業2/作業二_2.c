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
		printf("�o�ӼƦr���O���!");
	}
	else
		printf("�o�ӼƦr�O���!");
	
}
