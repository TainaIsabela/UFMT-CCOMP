lista = []
for i in range (0,10):
    lista.append(int(input()))
med = int(sum(lista)/10)

for i in range (0,10):
    if med == lista[i]:
        print("O valor", lista[i], "é igual à média de todos os valores")
print('fim')
print("A média dos valores é ", med)