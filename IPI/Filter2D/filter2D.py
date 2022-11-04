import numpy as np
import matplotlib.pyplot as plt
import cv2


def conv_img(img, k):
    kernel = np.flipud(np.fliplr(k))
    xKernShape = kernel.shape[0]
    yKernShape = kernel.shape[1]
    xImgShape = img.shape[0]
    yImgShape = img.shape[1]

    padding = 0
    strides = 1

    # Forma da Convolução de Saída
    xOutput = int(((xImgShape - xKernShape + 2 * padding) / strides) + 1)
    yOutput = int(((yImgShape - yKernShape + 2 * padding) / strides) + 1)
    output = np.zeros((xOutput, yOutput))

    # Aplicar preenchimento igual em todos os lados
    if padding != 0:
        imagePadded = np.zeros(
            (img.shape[0] + padding*2, img.shape[1] + padding*2))
        imagePadded[int(padding):int(-1 * padding),
                    int(padding):int(-1 * padding)] = img
        print(imagePadded)
    else:
        imagePadded = img

    # Iterar através da imagem
    for y in range(img.shape[1]):
        # Sair da Convolução
        if y > img.shape[1] - yKernShape:
            break
        ## Apenas Convolve se y tiver caído pelos Strides especificados
        if y % strides == 0:
            for x in range(img.shape[0]):
                # Vá para a próxima linha quando o kernel estiver fora dos limites
                if x > img.shape[0] - xKernShape:
                    break
                try:
                    # Apenas Convolve se x se moveu pelos Strides especificados
                    if x % strides == 0:
                        output[x, y] = (
                            kernel * imagePadded[x: x + xKernShape, y: y + yKernShape]).sum()
                except:
                    break

    return output


if __name__ == '__main__':
    #recebe kernel do usuario
    kernel = []
    for x in range (3):
        for y in range (3):
            kernel.append(int(input("Digite o valor do kernel: ")))
    kernel = np.array(kernel).reshape(3, 3)
    
            
        
    image = cv2.imread("Filter2D/cat_puppy.jpg")
    # Convolução e Salvar Saída
    output = conv_img(image, kernel)
    
    cv2.imwrite('2DConvolved.jpg', output)
