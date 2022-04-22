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
			//如果為重複且沒有計算過的數
				y[j]=-1;
				//將y[i]設為任一個不在0~9範圍內的數，為了不要重複計算。方便起見，取-1
				x[i]++;
				//計數器+1
			}
		}
	}
	for(i=0;i<MAX;i++){
		if(y[i]!=-1){
			x[i]++;
			//如果y[i]不是重複的數，則計數器+1。因為13行的for迴圈會少算到一個數，例如:1 1 1 ,計數器會只有2
		}
	}
	
	printf("\n重複的數字:\n");
	for(i=0;i<MAX;i++){
		if(x[i]>1){
			printf("%d\n",y[i]);
		}
	}
	printf("出現奇數次的數字:\n");
	for(i=0;i<MAX;i++){
		if(x[i]%2==1){
			printf("%d\n",y[i]);
		}
	}
}

