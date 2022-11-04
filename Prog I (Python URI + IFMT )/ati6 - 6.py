# Criando uma matriz de 10x5 inicializada com 0
lin = 5
col = 3
medcol = 0
medlin = 0
cont = 0
cont2 = 0
matriz = []
for i in range(0, lin):
    linha = []
    for j in range(0, col):
        linha.append(float(input([])))
    matriz.append(linha)
    """"
for i in range(0, len(matriz)):
    print("-----------------")
    for j in range(0, len(matriz[0])):
        print(matriz[i][j])
        """
for i in range(0, len(matriz)):
    for j in range(0, len(matriz[0])):
        if i/2 == 1:
            print(matriz[i],"i")
            cont = cont + sum(matriz[i])
            if j/2 == 0:
                print(matriz[j], "j")
                cont2 = cont2 +sum(matriz[j])


""""
print(matriz[i],[j])
            cont = cont + sum(matriz[i],[j])
            cont2 = cont2 +sum(matriz[i],[j])
            if len(matriz[0])/2 ==0:
                print(matriz[i],[j])
"""""