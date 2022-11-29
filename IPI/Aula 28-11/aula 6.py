import numpy as np
import matplotlib.pyplot as plt
import cv2

img = cv2.imread('gol-rich.jpg')
img = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
# faz a transformada de fourier
F = np.fft.fft2(img)  # TF direta
#spec = np.log(np.abs(F))

row, col = F_shift.shape
crow = row/2
ccol = col/2
F_shift[crow-30:crow+30, ccol+30:ccol] = 0
spec = np.log(np.abs(F_shift))
F_back = 


fig, axl = plt.subplots(1, 3)
axl[0].set_title('Imagem original')
axl[0].imshow(img, cmap='gray')
axl[1].set_title('Espectro')
axl[1].imshow(spec, cmap='gray')
axl[2].set_title('Imagem reconstruída')
axl[2].imshow(np.abs(F_back), cmap='gray')
plt.show()
