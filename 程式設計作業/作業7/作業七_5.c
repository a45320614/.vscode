#include<stdio.h>
void add(double a,double b)
{
    printf("%f",a+b);
}
void subtract(double a,double b)
{
    printf("%f",a-b);
}
void multiply(double a,double b)
{
    printf("%f",a*b);
}
void divide(double a,double b)
{
    printf("%f",a/b);
}
int main()
{
    int n;
    double a,b,c;
    void (*arr[4])(double,double)={add,subtract,multiply,divide};
    printf("Enter a number between 0 to 3(+,-,*,/), -1 to end:\n");
    scanf("%d",&n);
    if(n==-1)
    {
        printf("Program End!");
        return 0;
    }
    printf("Input two numbers to do the operand:\n");
    scanf("%lf %lf",&a,&b);
    switch(n)
    {
        case 0:
        {
            printf("%f + %f = ",a,b);
            arr[0](a,b);
            break;
        }
        
        case 1:
        {
            printf("%f - %f = ",a,b);
            arr[1](a,b);
            break;
        }
        case 2:
        {
            printf("%f * %f = ",a,b);
            arr[2](a,b);
            break;
        }
        case 3:
        {
            printf("%f / %f = ",a,b);
            arr[3](a,b);
            break;
        }
    }
}