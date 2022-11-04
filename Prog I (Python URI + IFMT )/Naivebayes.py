# -*- coding: utf-8 -*-
from sklearn.naive_bayes import MultinomialNB
import numpy as np
tempo = np.array([10, 0, 4], [11, 3, 2], [12, 2, 3], [13, 5, 9])
clases = np.array(["clase 1"], ["clase 2"], ["clase 3"], ["clase 4"])
teste = MultinomialNB
teste.fit(clima, tempo)
print('Digite o clima e a afirmação ou negação: ex: chuva, sim')
prev = input
print(result)
# clima = [[sol, não], [nublado, sim], [chuva, sim], [sol, sim], [sol, sim], [nublado, sim], [chuva, não], [chuva, não], [sol, sim], [chuva, sim], [sol, não], [nublado, sim], [nublado, sim], [chuva, não]]
