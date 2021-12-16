#include <stdio.h>

double toJPY(int);
double toEUR(int);
double toTWD(int);

int main()
{
int n;
double jpy,eur,twd;
printf("請輸入要兌換的美元:\n");
scanf("%d",&n);
jpy=toJPY(n);
eur=toEUR(n);
twd=toTWD(n);
printf("兌換後你將會獲得:");
printf("%g元日圓\n",jpy);
printf("%g元歐元\n",eur);
printf("%g元新台幣",twd);
}

double toJPY(int n)
{
    double x;
    x=n*104.18;
    return x;
}
double toEUR(int n)
{
    double x;
    x=n*0.8479;
    return x;
}
double toTWD(int n)
{
    double x;
    x=n*28.21;
    return x;
}