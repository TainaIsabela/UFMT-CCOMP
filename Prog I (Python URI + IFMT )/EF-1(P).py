import random


def matriz():
    a = []
    for i in range(0, 10):
        y = []
        for j in range(0, 7):
            y.append(random.randint(1, 100))
        a.append(y)

    return a


def preencher(a):
    par = 0
    impar = 0
    for i in range(0, 10):
        for j in range(0, 7):
            if a[i][j] % 2 == 0:
                par = par + 1

            if a[i][j] % 2 != 0:
                impar = impar + 1

    print('Existem', par, "números pares")
    print('Existe', impar, "números impares")
    print("{:.1f} % é par".format((len(a) / par) * 100))
    print('{:.1f} % é impar'.format((len(a) / impar) * 100))


    return par, impar

a = matriz()
print("-" * 30)
preencher(a)
