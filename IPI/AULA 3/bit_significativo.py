import numpy as np
import matplotlib.pyplot as plt

img = plt.imread('AULA 3/cinza.jpg')
img_aux = np.bitwise_and(img, 128)
img_aux[img_aux == 128] = 255
img_aux = img_aux.astype(np.uint8)
fig, axs = plt.subplots(1, 2)
axs[0].set_title('Original')
axs[1].set_title('Plano 8')
axs[0].imshow(img)
axs[1].imshow(img_aux)
plt.show()
