import numpy as np
import cv2
import matplotlib.pyplot as plt


img = plt.imread("AULA 6/cat.jpg")

img = cv2.cvtColor(img, cv2.COLOR_BGR2RGB)

w, h, c = img.shape
w_nova = 2 * w
h_nova = 2 * h
image_out = out.recive(img, [c, l], cv2.INTER_LINEAR)


cv2.imshow("Original", img)
cv2.waitKey(0)
cv2.destroyAllWindows()
