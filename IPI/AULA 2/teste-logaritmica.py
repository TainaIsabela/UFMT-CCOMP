import numpy as np
import matplotlib.pyplot as plt

img = plt.imread('cinza.jpg')
c = 255.0/np.log(256.0)
img_nova = c* np.log(1.0 + img) ## conversão logaritmica
img_nova = img_nova.astype(np.uint8)
fig, axs = plt.subplots(1, 2)
axs[0].set_title('Original')
axs[0].imshow(img)
axs[1].set_title('Mais brilho')
axs[1].imshow(img_nova)

plt.show()
