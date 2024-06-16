# Find the mean square error between two array A = [1,2,3,4,5,6] & B = [7,8,9,10,12,17] using
# function in Numpy module.

print("Name: Atul Rajput")
print("Roll No. 2230158")
import numpy as np
A = np.array([1, 2, 3, 4, 5, 6])

B = np.array([7, 8, 9, 10, 12, 17])
mse = np.square(np.subtract(A, B)).mean()
print("Mean Square Error:", mse)