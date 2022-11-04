while True:
  try:
        num = int(input())
        pelado=[]
        tamanho=[]
        cont= 0

        for i in range(num):

            tam, pe = input().split(' ')
            tamanho.append(int(tam))
            pelado.append(pe)

        for i in range(num):
            for j in range(num):
                if ((tamanho[i] == tamanho[j]) and (pelado[i] != pelado[j])):
                    cont= cont +1
                    tamanho[i]=0
                    tamanho[j]=0
                    pelado[i]='x'
                    pelado[j]='x'
        print(cont)
except EOFError:
    break
