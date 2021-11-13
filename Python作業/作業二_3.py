import pylab
def h(t):
    return (1.2732*pylab.sin(2*t))+(0.4244*pylab.sin(6*t))+(0.25465*pylab.sin(10*t))+(0.18189*pylab.sin(14*t))+(0.14147*pylab.sin(18*t))
def dh2(t,h1):
    return (h(t+h1)-h(t))/h1
a,b,n=-pylab.pi,pylab.pi,10000
h1=(b-a)/(n-1)
ts=pylab.linspace(a,b,n)
ys=h(ts)
pylab.plot(ts,ys,label="h(t)",color="blue")
ys2=dh2(ts,h1)
pylab.plot(ts,ys2,label="h'(t)",color="green")
pylab.grid()
pylab.xlabel("t")
pylab.ylabel("Y")
pylab.title("sawtooth function approximation and derivative")
pylab.legend(loc=4)
pylab.show()
