#include <stdio.h>

double toJPY(int);
double toEUR(int);
double toTWD(int);

int main()
{
int n;
double jpy,eur,twd;
printf("�п�J�n�I��������:\n");
scanf("%d",&n);
jpy=toJPY(n);
eur=toEUR(n);
twd=toTWD(n);
printf("�I����A�N�|��o:");
printf("%g�����\n",jpy);
printf("%g���ڤ�\n",eur);
printf("%g���s�x��",twd);
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