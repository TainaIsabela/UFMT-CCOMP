nots = []

for i in range (0,5):
    nots.append(int(input()))

def notas(nots):
    med = sum(nots)/5
    print('A média do aluno é %0.2f' %med)

notas(nots)