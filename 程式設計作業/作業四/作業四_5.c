#include<stdio.h>
#include<math.h>
void hanoi(int n, char A, char B, char C)
{
    
    if(n == 1) {
        printf("%c → %c\n", A, C);
        
        
    }
    else {
        hanoi(n-1, A, C, B);
        
        hanoi(1, A, B, C);
        
        hanoi(n-1, B, A, C);
        
    }
   
   
}

int main() {
    int n,count;
    printf("請輸入盤數：");
    scanf("%d", &n);
    count=(pow(2,n))-1;
    hanoi(n, 'A', 'B', 'C');
    
    
    printf("要移動的碟子數:%d",count);
    return 0;
} 