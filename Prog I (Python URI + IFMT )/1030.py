teste=(int(input()))
for i in range (teste):
    quantisoldados, pulo = map(int, input().split( ))
    soldadosvivos = list(range(1, quantisoldados + 1))
    soldadoatual = 1-pulo
    while (len(soldadosvivos) > 1 ):
                soldadosvivos.remove(soldadosvivos[soldadoatual])
                soldadoatual+= pulo-1
                if soldadoatual >= len(soldadosvivos):
                    soldadoatual%=len(soldadosvivos)
    print("Case %d: %d" %(i+1,soldadosvivos[0]))