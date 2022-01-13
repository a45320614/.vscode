#include<stdio.h>
int main()
{
    double c,f;
    printf("Please input the temperature:");
    scanf("%lf",&f);
    c=5.0/9.0*(f-32);
    printf("%+10.3lfF\n",f);
    printf("%+10.3lfC",c);
}