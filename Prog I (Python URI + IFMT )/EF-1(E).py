import math


def matriz():
    a =[]
    for j in range(0, 12):
        a.append(int(input()))
    return a

def preencher(a, b):
    c = []
    for i in range(0, 1):
        y = []
        for j in range(0, 2):
            if j == 0:
                soma = sum(a)*2
                y.append(soma)
            if j == 1:
                soma = sum(b)-5
                y.append(soma)
        c.append(y)
    return c


a = matriz()
print(a)
print("-" * 30)
b = matriz()
print(b)
print("-" * 30)
print(preencher(a, b))
# c= matriz(2,3)
