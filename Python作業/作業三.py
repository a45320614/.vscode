import pylab
pi=pylab.pi
a,b,n=1,2,100
fn=lambda x:x*pylab.sqrt(2*x-1)
xs,h=pylab.linspace(a,b,n+1,retstep=True)
ys=xs*pylab.sqrt(2*xs-1)
rsum,lsum,usum=0,0,0
y1=ys[0]
for y2 in ys[1:]:
    rsum+=1
    if y1<y2:
        lsum+=y1
        usum+=y2
    else:
        lsum+=y2
        usum+=y1
    y1=y2
rsum*=h
lsum*=h
usum*=h
isum=2.158204464
print("數學積分 :",round(isum,9),end="\n\n")
print("迴圈求積:")
print("矩形積分    :",round(lsum,9)," 誤差:",round(abs(isum-lsum),10))
print("上矩形積分  :",round(usum,9)," 誤差:",round(abs(isum-usum),10))
print("下矩形積分  :",round(lsum,9)," 誤差:",round(abs(isum-lsum),10))
