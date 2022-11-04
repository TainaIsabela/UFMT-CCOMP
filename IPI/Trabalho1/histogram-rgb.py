# - visualizar o histograma de cor de cada canal (r, g, b)
import numpy as np
import cv2
from matplotlib import pyplot as plt

# aceita formatos extras .jpg, png e .tiff

img = cv2.imread("Trabalho1/cat.jpg")

b, g, r = cv2.split(img)

red = plt.subplot(331)
red = plt.hist(r.ravel(), 256, [0, 256], color="red")
green = plt.subplot(332)
green = plt.hist(g.ravel(), 256, [0, 256], color="green")
blue = plt.subplot(333)
blue = plt.hist(b.ravel(), 256, [0, 256], color="blue")
rgb = plt.subplot(212)
rgb = plt.hist(r.ravel(), 256, [0, 256], color="red") + plt.hist(g.ravel(), 256, [
    0, 256], color="green") + plt.hist(b.ravel(), 256, [0, 256], color="blue")


# Funções


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
    img = plt.imread('IPI/Trabalho1/cat.jpg')
    ref = plt.imread('IPI/Trabalho1/ref.jpg')

    pr = hist(img)
    prr = hist(ref)

    # CDF
    cdf = calcula_CDF(pr)
    cdfr = calcula_CDF(prr)

    sk = cdf * 255
    sk = (np.round(sk))

    ref = np.zeros(ref.shape)
    espe = np.zeros(img.shape)
    equa = np.zeros(img.shape)

    for i in range(256):
        diff = np.absolute(cdfr - cdf[i])
        indice = diff.argmin()
        espe[img == i] = indice

    for i in range(256):
        equa[img == i] = int(sk[i])

    espe = espe.astype(np.uint8)
    equa = equa.astype(np.uint8)

    fig, axs = plt.subplots(1, 3)
    axs[0].set_title('Original')
    axs[0].imshow(img, cmap='gray', vmin=0, vmax=255)
    axs[1].set_title('Especificação')
    axs[1].imshow(espe, cmap='gray', vmin=0, vmax=255)
    axs[2].set_title('Equalização')
    axs[2].imshow(equa, cmap='gray', vmin=0, vmax=255)
    plt.show()


plt.show()
cv.waitKey(0)
