#include<stdio.h>
int main()
{
    int n,m1,m2,m3,t1,m4,m5,n1;
    printf("�п�J�~��N�X:");
    scanf("%d",&n);
    switch(n){
    case 1:
        printf("�п�J�g�z�H���T�w�P�~:");
        scanf("%d",&m1);
        printf("�Ӹg�z�H�����P�~��:%d",m1);
        break;
    case 2:
        printf("�п�J���~�u�C�P�u�@�ɼ�:");
        scanf("%d",&t1);
        printf("�п�J�C�p�ɤu��:");
        scanf("%d",&m2);
        if(t1<=40)
        {
            m3=t1*m2;
            printf("%d %d",t1,m2);
        }
        else
        {
            m3=(40*m2)+(t1-40)*m2*1.5;
        }
        printf("�Ӯ��~�u���P�~��:%d",m3);     
        break;
    case 3:
    
        printf("�п�J��P�P����B:");
        scanf("%d",&m4);
        m5=250+m4*0.057;
        printf("�ө�Ī��u���P�~��:%d",m5);
        break;
    case 4:
        printf("�п�J��g�Ͳ����:");
        scanf("%d",n1);
        break;
    }
}