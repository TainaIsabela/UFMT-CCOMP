print('Digite o total que foi gasto na loja:')
tot= float(input())
print('\nQual opção deseja?'
      '\n1) Opção: a vista com 10% de desconto;'
      '\n2) Opção: em duas vezes (preço da etiqueta);'
      '\n3) Opção: de 3 até 10 vezes com 3% de juros ao mês (somente para compras acima de R$ 100,00);')
opc=int(input())
if opc == 1:
    tot= tot-(tot*0.10)
    print('Com o desconto, o valor à ser pago deve ser de %0.2f' %tot)
if opc == 2:
    tot = tot/2
    print('O valor das duas prestações serão de %0.2f' %tot)
if opc == 3:
    print('Você pode optar por:')
    for i in range(3,11):
        pres = tot/i

        print(i, " Prestações de %0.2f" %pres)

