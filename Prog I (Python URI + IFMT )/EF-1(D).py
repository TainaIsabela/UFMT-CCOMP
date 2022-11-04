import math


def matriz():
    a =[]
    for j in range(0, 10):
        a.append(int(input()))
    return a

def preencher(a):
    c = []
    for i in range(0, 2):
        y = []
        for j in range(0, 3):
            if j == 0:
                soma = sum(a) + 5
                y.append(soma)
            if j == 1:
                y.append(math.factorial(sum(a)))
            if j == 2:
                y.append(math.sqrt(sum(a)))
        c.append(y)
    return c


a = matriz()
print(a)
print("-" * 30)
print(preencher(a))
# c= matriz(2,3)
