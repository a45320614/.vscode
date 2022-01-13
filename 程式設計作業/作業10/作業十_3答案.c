#include <stdio.h>
#include <stdlib.h>
#include <time.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

double get_bmi(double h, double w){

	//  bmi = weight(kg) / (height(m) * height(m)) 
	h = h / 100.0;
	
	return w/h/h;
}

int get_age(int birth_year, int birth_month, int birth_day){
	
	int current_year, current_month, current_day;
    
//    get current time, using <time.h> module
	time_t t = time(NULL);
  	struct tm tm = *localtime(&t);
//  	uncomment to get time format
//  	printf("now: %d-%02d-%02d %02d:%02d:%02d\n", tm.tm_year + 1900, tm.tm_mon + 1, tm.tm_mday, tm.tm_hour, tm.tm_min, tm.tm_sec);
	current_year = tm.tm_year + 1900;
	current_month = tm.tm_mon + 1;
	current_day = tm.tm_mday;
	
//	calculate age
	int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    if (birth_day > current_day) {
       current_day = current_day + month[birth_month - 1];
       current_month = current_month - 1;
    }
    if (birth_month > current_month) {
       current_year = current_year - 1;
       current_month = current_month + 12;
    }
    
	return current_year - birth_year;
	
}

typedef struct HealthProfile
{
	char lastname[10];
	char firstname[10];
	int gender;
	int birth_year;
	int birth_month;
	int birth_day;
	double height;
	double weight;
} Person;

int main() {
	
	Person p;
	
//	get format input 
	printf("It's a health profile!\n");
	printf("Please input your lastname... \n");
	scanf("%s", &p.lastname);
	printf("Please input your firstname... \n");
	scanf("%s", &p.firstname);
	printf("Please input your gender(0 for male/ 1 for female)... \n");
	scanf("%d", &(p.gender));
	printf("Please input your birthday year... \n");
	scanf("%d", &(p.birth_year));
	printf("Please input your birthday month... \n");
	scanf("%d", &(p.birth_month));
	printf("Please input your birthday day... \n");
	scanf("%d", &(p.birth_day));
	printf("Please input your height(cm)... \n");
	scanf("%lf", &(p.height));
	printf("Please input your weight(kg)... \n");
	scanf("%lf", &(p.weight));
	
//	format print output
	printf("lastname: %s firstname: %s\n", p.lastname, p.firstname);
	if(p.firstname==0){
		printf("gender: male");
	}
	else if(p.firstname==1){
		printf("gender: female");
	}
	printf("birthday: %d/%d/%d\n", p.birth_year, p.birth_month, p.birth_day);
	printf("Age: %d\n",  get_age(p.birth_year, p.birth_month, p.birth_day));
	printf("height: %.2f weight: %.2f\n", p.height, p.weight);
	printf("BMI: %.2f", get_bmi(p.height, p.weight));
	
	return 0;
}

