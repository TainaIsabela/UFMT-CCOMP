import numpy as np
import matplotlib.pyplot as plt

# calcula o histograma normalizado (PDF - Probability Distribution Function)


def hist(img):  # supondo img monocromatica
    h = np.zeros(256)
    for i in range(256):
        h[i] = np.sum(img == i)

    linhas = img.shape[0]
    colunas = img.shape[1]

    h = h / (linhas * colunas)
    return h


def calcula_cdf(h):  # h é o histograma normalizado
    cdf = np.zeros(256)
    cdf[0] = h[0]
    for i in range(1, 256):
        cdf[i] = cdf[i-1] + h[i]

    return cdf


if __name__ == '__main__':
    img1 = plt.imread('IPI/lena_low_contrast.jpeg')  # imagem de referencia
    img2 = plt.imread('IPI/cachorro.jpeg')  # imagem de entrada

    pr1 = hist(img1)  # referencia
    pr2 = hist(img2)  # entrada

    cdf1 = calcula_cdf(pr1)  # referencia
    cdf2 = calcula_cdf(pr2)  # entrada

    img_out = np.zeros(img2.shape)  # saida

    for i in range(256):
        diff = np.absolute(cdf1 - cdf2[i])
        indice = diff.argmin()
        img_out[img2 == i] = indice

    img_out = img_out.astype(np.uint8)

    fig, axs = plt.subplots(1, 3)
    axs[0].imshow(img1, cmap='gray', vmin=0, vmax=255)
    axs[1].imshow(img2, cmap='gray', vmin=0, vmax=255)
    axs[2].imshow(img_out, cmap='gray', vmin=0, vmax=255)
    plt.show()
