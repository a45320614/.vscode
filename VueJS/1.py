a=0
b=0
for i in range(233):
    c=a+b
    a=b
    b=c
print(c)
import math
num=0
for n in range(2,102):
    flag=True
    tmp=int(math.sqrt(n))
    for i in range(2,tmp+1):
        if n&i==0:
            flag=False
            break
    if flag:
        num=num+n
print(num)
n1,n2=eval(input("請輸入兩個值:"))
if n1>n2:
    n1,n2=n2,n1
sum=1
for i in range(2,n1+1):
    if n1%i==0 and n2%i==0:
        sum=i
print(sum)
