while True:
    n = int(input())

    numeros = []
    final = []

    if n == 0:
        break

    for i in range(1, n + 1):
        numeros.append(i)

    while len(numeros) > 1:
        final.append(str(numeros.pop(0)))
        numeros.insert(len(numeros) - 1, numeros.pop(0))

    print("Discarded cards: " + ", ".join(final), end="")
    print("\nRemaining card: " + str(numeros[0]), end="\n")