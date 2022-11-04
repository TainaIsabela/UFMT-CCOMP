entrada = input().split()
valores = [int(i) for i in entrada]

valores.sort()

print(*valores, sep= "\n")
print()
print(*entrada, sep= "\n")
