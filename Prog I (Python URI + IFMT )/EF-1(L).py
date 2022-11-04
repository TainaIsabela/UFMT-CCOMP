import random


def matriz():
    a = []
    for i in range(0, 15):
        y = []
        for j in range(0, 15):
            y.append(random.randint(1, 100))
        a.append(y)
    print(a.copy())
    return a


def preencher(a):
    soma = 0
    for i in range(0, 15):
        for j in range(0, 15):
            if a[i][j] % 2 == 0 and i == j:
                soma = soma + (a[i][j])
                print(i+1, j+1, ":" ,soma)

    return soma


a = matriz()
print("-" * 30)
preencher(a)
