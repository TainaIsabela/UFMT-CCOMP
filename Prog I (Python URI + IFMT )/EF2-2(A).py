print('Digite o valor da prestação:')
val = float(input())
print('Digite o tempo:')
tem = float(input())
print('Digite a taxa:')
taxa= float(input())
prest = val +(val*taxa/100)*tem
print("O valor da prestação é de: " ,prest, "reais")