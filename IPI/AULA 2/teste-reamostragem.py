import numpy as np
import matplotlib.pyplot as plt

img = plt.imread('cinza.jpg')
img_nova = 255.0 - img  # calcula o negativ0
img_nova = img_nova.astype(np.uint8)
fig, axs = plt.subplots(1, 2)
axs[0].set_title('Original')
axs[0].imshow(img)
axs[1].set_title('Negativa')
axs[1].imshow(img_nova)

plt.show()
