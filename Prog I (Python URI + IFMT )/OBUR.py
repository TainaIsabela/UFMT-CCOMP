num = int(input())
frase = input()

frase_separada = frase.split(' ')
for i in range(len(frase_separada)):
    if (frase_separada[i]) == "OB" or "UR":
        if (frase_separada[i]) == "OB" and len(frase_separada[i]) == 3:
            frase_separada[i] ="OBI"
            print(frase_separada[i])
        elif (frase_separada[i]) == "UR" and len(frase_separada[i]) == 3:
            frase_separada[i]="URI"
            print(frase_separada[i])
    else:
     print(frase_separada[i])
