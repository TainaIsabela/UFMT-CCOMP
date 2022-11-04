import numpy as np
import matplotlib.pyplot as plt

img = plt.imread('AULA 3/cinza.jpg')
c = 225 / np.log(1+255)
img_aux = img.astype(np.float64)
img_out = np.exp(img_aux)**(1.0/c)-1.0
img_out = img_out.astype(np.float64)
fig, axs = plt.subplots(1, 2)
axs[0].imshow(img)
axs[1].imshow(img_out)
plt.show()
