#include<stdio.h>
int main()
{
    char string[10];
    scanf("%s",string);
    printf("\"%s\"\n",string);
    printf("\\%20s\\\n",string);
    printf("\\%-20s\\",string);
}