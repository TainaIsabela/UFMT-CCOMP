def matriz (linha, coluna):
    matriz = []
    for i in range (0,linha):
        lista = []
        for j in range(0,coluna):
            lista.append(int(input()))
        matriz.append(lista)

    return matriz
def somamatriz (a, b):
    soma = []
    for i in range(len(a)):
        y = []
        for j in range(len(a[0])):
            y.append(a[i][j]+b[i][j])
        soma.append(y)

    return soma

a = matriz(5, 3)
print("-"*30)
b = matriz(5, 3)
print(somamatriz(a,b))