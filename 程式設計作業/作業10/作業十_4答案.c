#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */


int pow_operation(int num, int pow){
	int i;
	
	for(i = 1; i <= pow; i++){
		num*=2;
	}
	return num;
}
 
int main() {
	int i,k;
	int tmp, num, pow;
	//	set all element 0
	int bin_num[32] = { 0 };
	int bin_pow_num[32] = { 0 };
	//	get format input
	printf("Please input num and pow...\n");
	scanf("%i %i", &num, &pow);
	
	//	get num in binary format, represent as bin_num[32]
	tmp = num;
	for(i = 31; tmp > 0; i--){    
		bin_num[i] = tmp%2;    
		tmp = tmp/2;    
	} 
	
	//	get first print format 
	printf("%08d =", num);
	for( i = 0; i <= 31; i++){   
		k = i; 
		//  for each 8 iteration, print a space
		if(k % 8 ==0){
			printf(" %d",bin_num[i]);    
		}
		else{
			printf("%d",bin_num[i]); 
		}   
	} 
	
	printf("\n");
	
	// compute binary format after pow operation
	for(i = 31; i>=0; i--){   
		if(bin_num[i]==1){
			bin_pow_num[i-pow] = bin_num[i];
		} 
	} 
	
	//	get sencond print format 
	printf("%08d =", pow_operation(num, pow));
	for( i = 0; i <= 31; i++){   
		k = i; 
		//  for each 8 iteration, print a space
		if(k % 8 ==0){
			printf(" %d",bin_pow_num[i]);    
		}
		else{
			printf("%d",bin_pow_num[i]); 
		}   
	} 
	   
	return 0;
}