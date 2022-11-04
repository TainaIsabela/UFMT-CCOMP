a = 10
b = 20
print("Quantos produtos A foram comprados?")
contaa = int(input())
print("Quantos produtos B foram comprados?")
contab = int(input())
total= ((contaa * 10) + (contab * 20))
if contaa >= 1 and contab >= 1:
    conta = total-(total*0.15)
else:
    conta = total- (total*0.10)

print('O total gasto foi: {:.02f}'.format(conta))
