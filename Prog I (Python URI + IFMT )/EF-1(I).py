import math


def matriz():
    a = []
    for i in range(0, 7):
        y = []
        for j in range(0, 7):
            y.append(int(input()))
        a.append(y)
    print(a.copy())
    return a


def preencher(a):
    b = []
    soma =0
    for i in range(0, 7):
        y = []
        for j in range(0, 7):
            soma = soma + (a[i][j])
            if (i == j) and (i%2 != 1):
                y.append(math.factorial(a[i][j]))
                print(math.factorial(a[i][j]))
            else:
                y.append(soma)
        b.append(y)
    print(b.copy())
    return b


a = matriz()
print("-" * 30)
preencher(a)
