import random
import numpy
def matriz():
    a = []
    for i in range(0, 4):
        y = []
        for j in range(0, 5):
            y.append(random.randint(1, 100))
        a.append(y)
    print(a.copy())
    return a


def preencher(a):
    b = []
    c = []
    for i in range(0, 4):
        soma = 0
        for j in range(0, 5):
            soma = soma + (a[i][j])
        b.append(soma)
    print('B:', b.copy())

    soma = 0

    print("-" * 30)
    for i in range(0, 4):
        soma = 0
        for j in range(0, 5):
            soma = soma + (a[i][j]*random.randint(1,100))
        c.append(soma)
    c.append(random.randint(1, 100))
    print('C:', c.copy())
    print("-" * 30)

    for i in range(0, 4):
        for j in range(0, 5):
            somat = sum(b) + sum(c)
        print("A somatória de b e c :", somat)
        return b, c, somat


a = matriz()
print("-" * 30)
preencher(a)
