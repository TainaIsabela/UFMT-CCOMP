from sklearn.naive_bayes import MultinomialNB

banana = [400, 350, 450, 500]
orange = [0, 150, 300, 300]
other = [100, 150, 50, 200]
teste = [banana, orange, other]

marcacoes_teste = 400, 350, 450, 500
modelo = MultinomialNB()
modelo.fit(teste, marcacoes)
resultado = modelo.predit(teste)