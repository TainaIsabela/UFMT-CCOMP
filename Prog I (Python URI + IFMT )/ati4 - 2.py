numero = int(input("Fatorial de: ") )

resultado=1
count=1

while count <= numero:
    resultado *= count
    count += 1

print(resultado)

"""
def fatorial (numero): #função recursiva

    if numero <= 1:
       return 1
    else:
       return (numero * fatorial (numero - 1 ))
for n in range ( 1, 11 ):
    print ("Fatorial de",n," é ", fatorial(n))
"""