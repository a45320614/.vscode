#include<stdio.h>
int main()
{
int number;
printf("請輸入一個整數:");
scanf("%d",&number);
if(number%2==0)
{
	number=number*number;
	printf("%d",number);
}
if(number%2==1)
{
	number=number*number*number;
	printf("%d",number);
}	
	
	

}
