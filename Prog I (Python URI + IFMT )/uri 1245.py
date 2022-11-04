from sys import stdin

def main():


    n = int(stdin.readline())
    botas = []

    for _ in range(0, n):
        m, l = stdin.readline().split()
        m = int(m)

        botas.append((m, l))


    percorridas = []


    r = 0


    for m, l in botas:


        comp = (m, 'E' if l == 'D' else 'D')


        if comp in percorridas:
            percorridas.remove(comp)
            r += 1


        else:
            percorridas.append((m, l))

    print(r)
