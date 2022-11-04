import math


def matriz():
    a = []
    for i in range(0, 6):
        y = []
        for j in range(0, 5):
            y.append(int(input()))
        a.append(y)
    print(a.copy())
    return a


def preencher(a):
    b = []
    soma = 0
    for i in range(0, 6):
        y = []
        for j in range(0, 5):
            if (a[i][j]) % 2 == 0:
                y.append((a[i][j]) + 5)
                print('par', a[i][j])
            if (a[i][j]) % 2 != 0:
                y.append((a[i][j]) - 4)
                print("impar", a[i][j])
        b.append(y)
    print(b.copy())
    return b


a = matriz()
print("-" * 30)
preencher(a)
