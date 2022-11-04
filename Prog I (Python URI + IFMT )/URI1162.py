
teste = int(input())
for i in range(teste):
    tamanho = int(input())
    vagoes = list(map(int, input().split()))
    movimentos = 0
    maior = tamanho
    ordenado = []
    for i in range(0, tamanho):
        ordenado.append(i+1)
    while True:
        for i in range(0, tamanho):
            if vagoes[i] == maior:
                movimentos += (maior-(i+1))
                maior -= 1
                vagoes.insert(maior, vagoes.pop(i))
                break
        if vagoes == ordenado:
            break
    print("Optimal train swapping takes {} swaps.".format(movimentos))
