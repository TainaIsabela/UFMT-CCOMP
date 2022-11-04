import numpy as np
import matplotlib.pyplot as plt


def hist(img):
    h = np.zeros(256)
    
    for i in range(256):
        h[i] = np.sum(img == i)
        
    return h


if __name__ == '__main__':
    img = plt.imread('AULA 3/cinza.jpg') # Tem que ser JPG 
    h = hist(img)
    x = range(256)
    fig, axs = plt.subplots(1, 2)
    axs[0].set_title('Original')
    axs[1].set_title('histograma')
    axs[0].imshow(img)
    axs[1].plot(x, h)
    plt.show()
