#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int question(int);
int main()
{
    int i=0,c,x,n1,countT=0,countF=0;
    srand(time(NULL));
    int min=1;
    int max=9;
    int min1=1;
    int max1=4;
    while(1)
    {
        for(i=0;i<10;i++)
        {
            int a =rand() % (max-min+1)+min;
            int b =rand() % (max-min+1)+min;
            int n1 =rand() % (max1-min1+1)+min1;
            
            c=a*b;   
            printf("How much is %d times %d?",a,b);
            scanf("%d",&x);
            if(c==x)
            {
                switch(n1)
                {            
                case 1:
                    printf("Very good!\n");
                    break;
                case 2:
                    printf("Excellent!\n");
                    break;
                case 3:
                    printf("Nice work!\n");
                    break;
                case 4:
                    printf("Keep up the good work!\n");
                    break;
                }
                countT++;                        
            }
            else
            {
                switch(n1)
                {
                    case 1:
                    printf("No. Please try again.\n");
                    break;
                    case 2:
                    printf("Wrong. Try once more.\n");
                    break;
                    case 3:
                    printf("Don't give up!\n");
                    break;
                    case 4:           
                    printf("No. Keep trying.\n");
                    break;
                }
                
                
                countF++;
            }       
        }
        if(countT/(countT+countF)<0.75)
            printf("Please ask your teacher for extra help.\n");
        else
        {
            printf("You finished!\n");
        }
        system("pause");
    }
}
int question(int num)
{

}