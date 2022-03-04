#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define BUFFER_SIZE 10
typedef struct
{
  int Year;
  int Month;
  int Day;
} date;
int main()
{
    int m,n,d = 0;    
    date holiday = {2004, 4, 26};
    date festival;
    printf("\nPlease input Year: ");
    scanf("%d", &n);
    festival.Year = n;
   
    printf("\nPlease input Month: ");
    scanf("%d", &m);
   	festival.Month = m;

    printf("\nPlease input Day: ");
    scanf("%d", &d);

   festival.Day = d;
   
   printf("[holiday]  %02d/%02d/%04d\n", holiday.Month, holiday.Day, holiday.Year);
   printf("[festival] %02d/%02d/%04d\n", festival.Month, festival.Day, festival.Year);
   return 0;
}