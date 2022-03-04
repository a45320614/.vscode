#include<stdio.h>
#include<math.h>
void hanoi(int n, char A, char B, char C)
{
    
    if(n == 1) {
        printf("%c �� %c\n", A, C);
        
        
    }
    else {
        hanoi(n-1, A, C, B);
        
        hanoi(1, A, B, C);
        
        hanoi(n-1, B, A, C);
        
    }
   
   
}

int main() {
    int n,count;
    printf("�п�J�L�ơG");
    scanf("%d", &n);
    count=(pow(2,n))-1;
    hanoi(n, 'A', 'B', 'C');
    
    
    printf("�n���ʪ��Фl��:%d",count);
    return 0;
} 