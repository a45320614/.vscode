#include<stdio.h>
int main()
{
int number;
printf("�п�J�@�Ӿ��:");
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
