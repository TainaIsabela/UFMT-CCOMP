
print('Digite a nota da primeira prova:')
not1 = float(input())
if not1 == 50:
    print("Encerrando... ignore as próximas mensagens")

if -1<not1<11:
        print('Digite a nota da segunda prova:')
        not2=float(input())

        if -1<not2<11:
                med = (not1+not2) / 2
                print("A média das notas é: %0.2f" %med)
        else:
            print('erro, tente novamente')
else:
    print("erro, tente novamente")