import numpy as np
import matplotlib.pyplot as plt

img = plt.imread('AULA 3/cinza.jpg')
img_aux = img.astype(np.float64)
gamma = 1.8
img_out = 255.0*(img_aux/255.0)**gamma
img_out = img_out.astype(np.uint8)
fig, axs = plt.subplots(1, 2)
axs[0].set_title('Original')
axs[1].set_title('Gamma')
axs[0].imshow(img)
axs[1].imshow(img_out)
plt.show()
