from cv2 import COLOR_BGR2RGB
import numpy as np
import matplotlib.pyplot as plt
import cv2
import time

# Pyplot trabalha com RGB
# opencv trabalha com BGR

if __name__ == '__main__':
    size = 80
    kernel = np.ones((size, size))  # cria kernel
    kernel = kernel / (size*size)  # normalizando
    

    img = cv2.imread("Filter2D/cat_puppy.jpg")  # le a imagem de entrada
    img_out1 = cv2.filter2D(img, -1, kernel)  # filtra a imagem com o kernel

    # converte de BGR para RGB
    img_out1 = cv2.cvtColor(img_out1, cv2.COLOR_BGR2RGB)
    img = cv2.cvtColor(img, cv2.COLOR_BGR2RGB)

    fig, axs = plt.subplots(1, 2)
    axs[0].set_title('Kernel 1D')
    axs[0].imshow(img)
    axs[1].imshow(img_out1)
    axs[1].set_title('Kernel 2D')
    print(kernel)

    plt.show()
