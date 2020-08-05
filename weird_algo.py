N = int(input())
print(N,end = " ")
while(N!=1):
    if(N%2==0):
        N = N//2
        print(N,end = " ")
    elif(N%2!=0):
        N = (3*N)+1
        print(N,end = " ")
