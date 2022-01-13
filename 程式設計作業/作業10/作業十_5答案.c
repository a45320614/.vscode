#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

union number{
	char ch;
	short sh;
	int in;
	long lo;
};
int main() {
	char c;
	short s;
	int i;
	long l;
	
	union number value;
	printf("輸入型別char...\n");
	scanf("%c", &c);
	value.ch = c;
	printf("char: %c\n", value.ch);
	printf("short: %lu\n", value.sh);
	printf("int: %lu\n", value.in);
	printf("long: %lu\n", value.lo);
	
	printf("輸入型別short...\n");
	scanf("%lu", &s);
	value.sh = s;
	printf("char: %c\n", value.ch);
	printf("short: %lu\n", value.sh);
	printf("int: %lu\n", value.in);
	printf("long: %lu\n", value.lo);
	
	printf("輸入型別int...\n");
	scanf("%d", &i);
	value.in = i;
	printf("char: %c\n", value.ch);
	printf("short: %lu\n", value.sh);
	printf("int: %lu\n", value.in);
	printf("long: %lu\n", value.lo);
	
	printf("輸入型別long...\n");
	scanf("%lu", &l);
	value.lo = l;
	printf("char: %c\n", value.ch);
	printf("short: %lu\n", value.sh);
	printf("int: %lu\n", value.in);
	printf("long: %lu\n", value.lo);

	return 0;
}