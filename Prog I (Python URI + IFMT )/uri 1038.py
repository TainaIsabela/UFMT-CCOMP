entrada = input().split()

codigo = int(entrada[0])

quant = int(entrada[1])

resp = 0.0

if codigo == 1:
    resp = 4.0 * quant

elif codigo ==2:
    resp = 4.5 * quant

elif codigo == 3:
    resp = 5.0 * quant

elif codigo == 4:
    resp = 2.0 * quant

elif codigo == 5:
    resp = 1.5 * quant

print("TOTAL: R$ %0.2f" %resp)