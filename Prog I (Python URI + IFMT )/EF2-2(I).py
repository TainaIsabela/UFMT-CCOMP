print('Digite a cotação de dolár:')
cot= float(input())
print('Digite a quantidade de real disponível:')
real = float(input())
con = real/cot
print('O resultado da conversão: {:.2f}' .format(con), 'dólars')
