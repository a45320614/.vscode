#include <stdio.h> 
#include <stdlib.h>
typedef struct time{
 int hour;
 int minutes;
 double second;
} times;
void display(times );
void sub(times ,times );
int main(void){
 times start={12,32,25.49};
 times end={15,12,17.53};
 display(start);
 display(end);
 sub(start,end);
 
 system("pause");
 return 0;
 
} 

void display(times x){
 printf("%d小時%d分%2.2f秒\n",x.hour,x.minutes,x.second);
}

void sub(times s,times e){
    times elaspe={0,0,0.0};
    if(s.second>e.second)        /* 計算秒 */
    {
        elaspe.second=60+e.second-s.second;
        elaspe.minutes--;
    }
    else
        elaspe.second=e.second-s.second;
      
    if(s.minutes>e.minutes)      /* 計算分 */
    {
        elaspe.minutes+=60+e.minutes-s.minutes;
        elaspe.hour--;
   }
    else
        elaspe.minutes+=e.minutes-s.minutes;
     
    elaspe.hour+=e.hour-s.hour;   /* 計算時 */
    display(elaspe);
}
