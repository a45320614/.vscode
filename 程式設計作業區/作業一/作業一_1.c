#include<stdio.h>
#include<stdlib.h>
int prime(int);
int main()
{

int a,b,c,Smallest,Largest,Product,Sum;
float Average;
printf("叫块3俱计:");
scanf("%d %d %d",&a,&b,&c);
Sum=a+b+c;
Average=Sum/3;
Product=a*b*c;
printf("Product is %d\n",Product);
printf("Sum is %d\n",Sum);
printf("Average is %f\n",Average);
if(a>b&&a>c)
{
	printf("Largest=%d\n",a);
	Largest=a;
}
if(b>a&&b>c)
{
	printf("Largest=%d\n",b);
	Largest=b;
}
if(c>a&&c>b)
{
	printf("Largest=%d\n",c);
	Largest=c;
}
if(a<b&&a<c)
{
	printf("Smallest=%d\n",a);
}
if(b<a&&b<c)
{
	printf("Smallest=%d\n",b);
}
if(c<b&&c<a)
{
	printf("Smallest=%d\n",c);
}
int i=2;
int k=1;
printf("程そ计:");
if(a>=i&&b>=i&&c>=i)
{
	while(a>=i&&b>=i&&c>=i)
	{
		while(a%i==0 && b%i==0 && c%i==0)
		{
			k=k*i;
			a/=i;
			b/=i;
			c/=i;
		}
	i++;
	}
	printf("%d\n",k);
}
for(i=1;i<=Product;i++)	
{
	if((i%a==0)&&(i%b==0)&&(i%c==0))
	{
		printf("程そ计:%d\n",i);
		goto here;
	}
}

here:i=a%b;
while(i>0)
{
	a=b;
	b=i;
	i=a%b;
}
a=c;
i=a%b;
while(i>0)
{
	a=b;
	b=i;
	i=a%b;
}	
int ii;
printf("程计┮Τ借计:");
for(ii=2;ii<=Largest;ii++)
{
	if(prime(ii))
		printf("%3d",ii);
}
	
			
}


int prime(int num)
{
	int ii;
	for(ii=2;ii<=num/2;ii++)
	{
		if(num%ii==0)
			return 0;
	return 1;
}
}
