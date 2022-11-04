import random


def matriz():
    a = []
    for i in range(0, 5):
        y = []
        for j in range(0, 5):
            y.append(random.randint(1,100))
        a.append(y)
    print(a.copy())
    return a


def preencher(a):
    soma = 0
    for i in range(0, 5):
        for j in range(0, 5):
            if i == j and i%2 != 1 :
                soma = soma + (a[i][j])
                print(i+1, j+1, ":" ,soma)

    return soma


a = matriz()
print("-" * 30)
preencher(a)
