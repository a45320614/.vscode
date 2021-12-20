import pylab
def f(x):
    return (2+pylab.sin(x/pylab.pi))/(2-pylab.sin(x/pylab.pi))
def df2(x,h):
    return (f(x+h)-f(x))/h
a,b,n=0,50,10000
h=(b-a)/(n-1)
xs=pylab.linspace(a,b,n)
ys=f(xs)
pylab.plot(xs,ys,color="blue")
ys2=df2(xs,h)
pylab.plot(xs,ys2,color="green")
pylab.title("f(x) = (2 + sin(x/pi)) / (2 - sin(x/pi)) and computed derivative")
pylab.grid()
pylab.axis([0,50,-1,3])
pylab.xlabel("X")
pylab.ylabel("Y")
pylab.show()