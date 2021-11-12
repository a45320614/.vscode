import pylab
n=int()
def g(t):
    if t>1:return 1
    elif t<n:return -1
        

    
ts=pylab.linspace(-3,3,100)
ys=g(ts)
pylab.plot(ts,ys)
pylab.grid()
pylab.show()