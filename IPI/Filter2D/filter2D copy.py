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

    xOutput = int(((xImgShape - xKernShape + 2 * padding) / strides) + 1)
    yOutput = int(((yImgShape - yKernShape + 2 * padding) / strides) + 1)
    output = np.zeros((xOutput, yOutput))

    if padding != 0:
        imagePadded = np.zeros(
            (img.shape[0] + padding*2, img.shape[1] + padding*2))
        imagePadded[int(padding):int(-1 * padding),
                    int(padding):int(-1 * padding)] = img
        print(imagePadded)
    else:
        imagePadded = img

    for y in range(img.shape[1]):
        if y > img.shape[1] - yKernShape:
            break
        if y % strides == 0:
            for x in range(img.shape[0]):
                if x > img.shape[0] - xKernShape:
                    break
                try:
                    if x % strides == 0:
                        output[x, y] = (
                            kernel * imagePadded[x: x + xKernShape, y: y + yKernShape]).sum()
                except:
                    break

    return output

if __name__ == '__main__':
    kernel = []
    for x in range (3):
        for y in range (3):
            kernel.append(int(input("Digite o valor do kernel: ")))
    kernel = np.array(kernel).reshape(3, 3)
    image = cv2.imread("Filter2D/cat_puppy.jpg")
    output = conv_img(image, kernel)
    cv2.imwrite('2DConvolved.jpg', output)
