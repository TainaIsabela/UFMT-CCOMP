def matriz():
    a = []
    for i in range(0, 5):
        y = []
        for j in range(0, 4):
            y.append(int(input()))
        a.append(y)
    print(a.copy())
    return a


def preencher(a):
    b = []
    for i in range(0, 5):
        y = []
        for j in range(0, 4):
            if i == j:
                y.append(a[i][j] * 3)
            else:
                y.append(a[i][j] * 2)
        b.append(y)
    print(b.copy())
    return b


a = matriz()
print("-" * 30)
preencher(a)
