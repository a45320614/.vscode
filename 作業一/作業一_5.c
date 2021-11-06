#include<stdio.h>
int main()
{
float height,weight;
float BMI;
printf("請輸入體重(公斤):");
scanf("%f",&weight);
printf("請數入身高(公尺):");
scanf("%f",&height);	
BMI=weight/(height*height);
printf("你的BMI是:%f\n",BMI);
if(BMI>30)
	printf("過重囉\n");
if(BMI<18.5)
	printf("過輕囉\n");
}
