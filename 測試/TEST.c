#include<stdio.h>
#include<stdlib.h>
#include <time.h>
#define MAX 16
void main(void){
	int x[MAX]={0},y[MAX];
	int i,j,num=0,duplicate;
	srand(time(NULL));
	for(i=0;i<MAX;i++){
		y[i]=rand()%10;
		printf("%d ",y[i]);
	}
	for(i=0;i<MAX;i++){
		for(j=i+1;j<MAX;j++){
			if(y[i]==y[j]&&y[i]!=-1){
			//�p�G�����ƥB�S���p��L����
				y[j]=-1;
				//�Ny[i]�]�����@�Ӥ��b0~9�d�򤺪��ơA���F���n���ƭp��C��K�_���A��-1
				x[i]++;
				//�p�ƾ�+1
			}
		}
	}
	for(i=0;i<MAX;i++){
		if(y[i]!=-1){
			x[i]++;
			//�p�Gy[i]���O���ƪ��ơA�h�p�ƾ�+1�C�]��13�檺for�j��|�ֺ��@�ӼơA�Ҧp:1 1 1 ,�p�ƾ��|�u��2
		}
	}
	
	printf("\n���ƪ��Ʀr:\n");
	for(i=0;i<MAX;i++){
		if(x[i]>1){
			printf("%d\n",y[i]);
		}
	}
	printf("�X�{�_�Ʀ����Ʀr:\n");
	for(i=0;i<MAX;i++){
		if(x[i]%2==1){
			printf("%d\n",y[i]);
		}
	}
}

