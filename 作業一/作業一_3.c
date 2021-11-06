#include<stdio.h>
int main()
{
int s,min,hr,a,s1,min1;
printf("請輸入時間(秒):");
scanf("%d",&s);

s1=s%60;
min=(s-s1)/60;
if(min>60&&min!=60){
	min1=min%60;
	hr=(min-min1)/60;
	if(hr<10)
		printf("0%d:",hr);
	else
		printf("%d:",hr);
	
}
else{
	min1=min%60;
	hr=(min-min1)/60;
	if(hr<10)
		printf("0%d:",hr);
	else
		printf("%d:",hr);	
}

if(min1<10)
	printf("0%d:",min1);
else
	printf("%d:",min1);

if(s1<10)
	printf("0%d",s1);
else
	printf("%d",s1);

}
