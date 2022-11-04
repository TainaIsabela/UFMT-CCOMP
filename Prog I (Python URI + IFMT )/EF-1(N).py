import random


def matriz():
    a = []
    for i in range(0, 7):
        y = []
        for j in range(0, 7):
            y.append(random.randint(1,100))
        a.append(y)
    print(a.copy())
    return a


def preencher(a):
    cont = 0
    for i in range(0, 7):
        for j in range(0, 7):
            if a[i][j]%2 == 0:
                cont = cont + 1

    print("Existem:", cont, "números pares")

    return cont


a = matriz()
print("-" * 30)
preencher(a)
