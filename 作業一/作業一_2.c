#include<stdio.h>
int main()
{
int number,b;
printf("�п�J�@�ӤT���: ");
scanf("%d",&number);
while(number!=0)
{
	b=b*10+number%10;
	number=number/10;
}
printf("%d",b);


	
	
	
	
	
}
