#include<stdio.h>
int main()
{
    int n,m1,m2,m3,t1;
    printf("�п�J�~��N�X:");
    scanf("%d",&n);
    if(n=1)
    {
        printf("\n�п�J�g�z�H���T�w�P�~:");
        scanf("%d",&m1);
        printf("�Ӹg�z�H�����P�~��:%d",m1);
    }
    if(n=2)
    {
        printf("\n�п�J���~�u�C�P�u�@�ɼ�:");
        scanf("%d",&t1);
        printf("\n�п�J�C�p�ɤu��:");
        scanf("%d",m2);
        if(t1<=40)
        {
            m3=t1*m2;
        }
        else
        {
            m3=40*m2+(t1-40)*m2*1.5;
        }
        printf("�Ӯ��~�u���P�~��:%d",m3);     
    }



}