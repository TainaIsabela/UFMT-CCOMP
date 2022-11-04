import math


def matriz():
    a = []
    for i in range(0, 4):
        y = []
        for j in range(0, 4):
            y.append(int(input()))
        a.append(y)
    print(a.copy())
    return a


def preencher(a):
    soma = 0
    for i in range(0, 4):
        for j in range(0, 4):
            if (i == j):
                soma = soma + (a[i][j])
                print(soma)

    return soma


a = matriz()
print("-" * 30)
preencher(a)
