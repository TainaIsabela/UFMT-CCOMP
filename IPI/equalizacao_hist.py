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
    img = plt.imread('IPI/lena_low_contrast.jpeg')

    # calculo do histograma normalizado (pr)
    pr = hist(img)

    # cummulative distribution function (CDF)
    cdf = calcula_cdf(pr)
    sk = 255 * cdf
    sk = np.round(sk)

    # criando a imagem de saída
    img_out = np.zeros(img.shape)
    for i in range(256):
        img_out[img == i] = int(sk[i])

    img_out = img_out.astype(np.uint8)

    fig, axs = plt.subplots(1, 3)
    axs[0].imshow(img, cmap='gray', vmin=0, vmax=255)
    axs[1].plot(range(256), pr)
    axs[2].imshow(img_out, cmap='gray', vmin=0, vmax=255)
    plt.show()
