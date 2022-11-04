# ex = 1 + x + x2/2! + x3/3! + ..
import math

print('Digite o valor de x:')
x = int(input())
e = 1
com = 0
while
    for i in range(0, x):
        com = i + x
        if i > 1:
            com = com + x ** (i / math.factorial(i))
            print(com)
            if 10e-6 <= com:
                print(com)
