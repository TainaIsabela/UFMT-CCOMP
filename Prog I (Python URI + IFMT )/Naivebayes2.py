# -*- coding: utf-8 -*-
from sklearn.naive_bayes import MultinomialNB
import numpy as np
tempo = np.array([nublado, 0, 4], [sol, 3, 2], [chuva, 2, 3], [total, 5, 9])
clases = np.array(["clase 1"], ["clase 2"], ["clase 3"], ["clase 4"])
teste = MultinomialNB
teste.fit(clima, tempo)
print('Digite o clima e a afirmação ou negação: ex: chuva, sim')
prev = input
print(result)
# clima = [[sol, não], [nublado, sim], [chuva, sim], [sol, sim], [sol, sim], [nublado, sim], [chuva, não], [chuva, não], [sol, sim], [chuva, sim], [sol, não], [nublado, sim], [nublado, sim], [chuva, não]]
