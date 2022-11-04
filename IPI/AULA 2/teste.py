import numpy as np
import matplotlib.pyplot as plt

img = np.zeros((800, 600, 3)) ##linhas, colunas, planos
img[:,:,0] = 255 ##todos os pixels vão ficar 255 (vai ficar vermelho)
img[:,:,1] = 255 ##todos os pixels vão ficar 255 (vai ficar verde)
img[:,:,2] = 255 ##todos os pixels vão ficar 255 (vai ficar azul)
img = img.astype(np.uint8) ##Conversão para int sem sinal

plt.imshow(img)
plt.show()