import random
import math

a = []
b = []
for i in range(0, 5):
    y = []
    for j in range(0, 6):
        num = (int(input()))
        if num % 2 == 1:
            print("Digite outro número:")
            y.append(int(input()))
        else:
            y.append(num)
    a.append(y)
print('A:', a.copy())
print("-" * 30)

for i in range(0, 5):
    y = []
    for j in range(0, 6):
        num = (int(input()))
        if num % 2 == 0:
            print("Digite outro número:")
            y.append(int(input()))
        else:
            y.append(num)
    b.append(y)
print('B:', b.copy())
print("-" * 30)


def somamatriz(a, b):
    soma = []
    for i in range(len(a)):
        y = []
        for j in range(len(a[0])):
            y.append(a[i][j] + b[i][j])
        soma.append(y)
    print('C:', soma.copy())
    return soma


somamatriz(a, b)
