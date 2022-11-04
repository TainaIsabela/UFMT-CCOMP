import numpy as np
import matplotlib.pyplot as plt

img = plt.imread('cinza.jpg')
img_nova = img * 1.2  # aumenta o brilho
img_nova[img_nova > 255] = 255
img_nova = img_nova.astype(np.uint8)
fig, axs = plt.subplots(1, 2)
axs[0].set_title('Original')
axs[0].imshow(img)
axs[1].set_title('Mais brilho')
axs[1].imshow(img_nova)

plt.show()
