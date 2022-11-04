import random


def matriz():
    a = []
    for i in range(0, 8):
        y = []
        for j in range(0, 6):
            y.append(random.randint(0,100))
        a.append(y)
    print(a.copy())
    return a


def preencher(a):

    b = []
    for i in range(0, 8):
        soma = 0
        y = []
        for j in range(0, 6):
            soma = soma + a[i][j]
        y.append(soma)
        b.append(y)
    print(b.copy())

    return b


a = matriz()
print("-" * 30)
preencher(a)
