#include<stdio.h>
int main()
{
float height,weight;
float BMI;
printf("�п�J�魫(����):");
scanf("%f",&weight);
printf("�мƤJ����(����):");
scanf("%f",&height);	
BMI=weight/(height*height);
printf("�A��BMI�O:%f\n",BMI);
if(BMI>30)
	printf("�L���o\n");
if(BMI<18.5)
	printf("�L���o\n");
}
