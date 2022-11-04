n = int(input())
dentro = 0
fora = 0
for i in range(n):
    num = int(input())
    if 10 <= num <= 20:
        dentro+=1
    else:
        fora+=1
print("{} in".format(dentro))
print("{} out".format(fora))