from sklearn.naive_bayes import MultinomialNB
import numpy as np
tempo = ([10, 0, 4], [11, 3, 2], [12, 2, 3], [13, 5, 9])
clases = (["clase 1"], ["clase 2"], ["clase 3"], ["clase 4"])
teste = MultinomialNB
x = array(tempo)
y = array(clases)
teste.fit(x, y)
print('Digite o clima e a afirmação ou negação: ex: chuva, sim')
prev = input
print(result)
# clima = [[sol, não], [nublado, sim], [chuva, sim], [sol, sim], [sol, sim], [nublado, sim], [chuva, não], [chuva, não], [sol, sim], [chuva, sim], [sol, não], [nublado, sim], [nublado, sim], [chuva, não]]