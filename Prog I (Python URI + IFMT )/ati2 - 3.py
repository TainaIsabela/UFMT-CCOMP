print("Digite o preço do ṕroduto")
pre = float(input())
if pre <100:
    pre = pre + (pre* 0.10)
if pre >=100:
    pre = pre + (pre* 0.20)
print("O valor do produto final é %0.2f" %pre)