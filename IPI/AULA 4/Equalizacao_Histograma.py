import numpy as np
import matplotlib.pyplot as plt

def hist (img):
    h = np.zeros(256)
    for i in range(256):
        h[i] = np.sum(img[img==i])
    linhas = img.shape[0]
    colunas = img.shape[1]
    h = h / (linhas * colunas)
    return h

if __name__ == '__main__':
    img = plt.imread('AULA 4/cinza.jpg')
    histograma = hist(img)
    fig,axs = plt.subplots(1,2) # 1 linha, duas colunas
    axs[0].imshow(img, cmap = 'gray',vmin=0, vmax=255)
    axs[1].plot(range(256), histograma)
    plt.show()