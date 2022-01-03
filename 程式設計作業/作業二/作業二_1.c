#include <stdio.h>
int main()
{
	double sales;
	printf("Enter sales in dollars:");
	scanf("%lf", &sales);
if (sales>=0)
	{
	double salary;
	salary=200+sales*0.09;
	printf("Salary is: $%6.2f",salary);
	}
}
