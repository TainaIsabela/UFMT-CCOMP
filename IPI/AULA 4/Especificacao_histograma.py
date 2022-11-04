import numpy as np
import matplotlib.pyplot as plt


def hist(img):
    h = np.zeros(256)
    for i in range(256):
        h[i] = np.sum(img == i)

    linhas = img.shape[0]
    colunas = img.shape[1]

    h = h / (linhas * colunas)

    return h


def calcula_CDF(img):
    cdf = np.zeros(256)
    cdf[0] = img[0]
    for i in range(1, 256):
        cdf[i] = cdf[i-1] + img[i]
    return cdf


if __name__ == '__main__':
    img1 = plt.imread('AULA 4/gato.jpg')
    img2 = plt.imread('AULA 4/cachorro.jpg')
    pr1 = hist(img1)
    pr2 = hist(img2)
    cdf1 = calcula_CDF(pr1)
    cdf2 = calcula_CDF(pr2)

    img_out = np.zeros(img2.shape)

    for i in range(256):
        diff = np.absolute(cdf1 - cdf2[i])
        indice = diff.argmin()
        img_out[img_out == i] = indice
    img_out = img_out.astype(np.uint8)

    fig, axs = plt.subplots(1, 3)  # 1 linha, duas colunas
    axs[0].imshow(img1, cmap='gray', vmin=0, vmax=255)
    axs[1].imshow(img2, cmap='gray', vmin=0, vmax=255)
    axs[2].imshow(img_out, cmap='gray', vmin=0, vmax=255)
    plt.show()
