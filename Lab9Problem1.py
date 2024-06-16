# Generate the following matrix in numpy

# and modify the entries to

# 2. Consider the system of equations 3x + 2y = 5 10x − y = 3

print("Name: Atul Rajput")
print("Roll No. 2230158")

import numpy as np
A = np.array([[1, 2, 3],
[4, 5, 6],
[7, 8, 9]])
print("Matrix A:")

print(A)
B = np.copy(A)
B[:2, 1:] = 999

print("\nMatrix B:")
print(B)