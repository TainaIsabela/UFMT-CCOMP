from pip._vendor.distlib.compat import raw_input

N = int(raw_input())

bota = []

for i in range(N):
    tam, pe = raw_input().split()
    bota.append([int(tam), pe])

cnt = 0
MIN = 30
MAX = 60
for i in range(MIN, MAX + 1):
    cnt += min(bota.count([i, 'E']), bota.count([i, 'D']))
print(cnt)