import math

print('Digite dois números:')
num1 = int(input())
num2 = int(input())
a = num1+num2
b = num1 * (math.sqrt(num2))
c = math.sqrt(num1)
d = math.sqrt(math.sqrt(num1)+math.sqrt(num2))
e = math.sin(num1-num2)
f = abs(num1)
print("\n A soma dos números {},"
      "\n O produto do primeiro número pelo quadrado do segundo {},"
      "\n O quadrado do primeiro número {}, "
      "\n A raiz quadrada da soma dos quadrados {},"
      "\n O seno da diferença do primeiro número pelo segundo {},"
      "\n O módulo do primeiro número {}".format(a,b,c,d,e,f))