#include<stdio.h>
int main()
{
int number,b;
printf("請輸入一個三位數: ");
scanf("%d",&number);
while(number!=0)
{
	b=b*10+number%10;
	number=number/10;
}
printf("%d",b);


	
	
	
	
	
}
