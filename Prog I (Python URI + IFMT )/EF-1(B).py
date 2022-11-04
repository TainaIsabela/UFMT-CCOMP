def matriz(linha, coluna):
    matriz = []
    for i in range(0, linha):
        lista = []
        for j in range(0, coluna):
            lista.append(int(input()))
        matriz.append(lista)

    return matriz


def preencher(a, b):
    c = []
    for i in range(0, 7):
        y = []
        for j in range(0, 2):
            if j == 0:
                y.append(a[i][0])
            if j == 1:
                y.append(b[i][0])
        c.append(y)
    print(c.copy())
    return c


a = matriz(7, 1)
print("-" * 30)
b = matriz(7, 1)
print(preencher(a, b))

