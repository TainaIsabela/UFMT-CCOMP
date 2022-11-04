a = []
b = []
for i in range(0, 5):
    y = []
    for j in range(0, 5):
        num = (int(input()))
        if num % 3 == 1:
            y.append(num)
        else:
            print("Digite outro número:")
            y.append(int(input()))
    a.append(y)
print('A:', a.copy())
print("-" * 30)

for i in range(0, 5):
    y = []
    for j in range(0, 5):
        num = (int(input()))
        if  num % 6 == 0:
            print("Digite outro número:")
            y.append(int(input()))
        else:
            y.append(num)
    b.append(y)
print('B:', b.copy())
print("-" * 30)
c = []
for i in range(0, 5):
    y = []
    for j in range(0, 5):
        y.append(a[i][j] + b[i][j])
    c.append(y)
print('C:', c.copy())
