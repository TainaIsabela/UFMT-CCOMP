import random
import math
def matriz():
    a = []
    for i in range(0, 4):
        y = []
        for j in range(0, 4):
            y.append(random.randint(1, 100))
        a.append(y)
    print(a.copy())
    return a


def preencher(a):
    e = []
    for i in range(0,4):
        z = []
        for j in range (0,4):
            if i == 0:
                z.append(a[i][j]*2)
            if i == 1:
                z.append(b[i][j]*3)
            if i == 2:
                z.append(c[i][j]*4)
            if i == 3:
                z.append(math.factorial(d[i][j]))
        e.append(z)
    print(e.copy())
    return e


print("A:")
a = matriz()
print("-" * 30)
print('B:')
b = matriz()
print("-" * 30)
print('C:')
c = matriz()
print("-" * 30)
print('D:')
d = matriz()
print("-" * 30)
print('E:')
preencher(a)
