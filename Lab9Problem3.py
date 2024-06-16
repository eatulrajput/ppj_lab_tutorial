# Generate a 5 by 5 random matrix and find the maximum, minimum, average (mean) & variance
# values along all axes.

print("Name: Atul Rajput")
print("Roll No. 2230158")
import numpy as np
matrix = np.random.rand(5, 5)
max_values = np.max(matrix, axis=(0, 1))
min_values = np.min(matrix, axis=(0, 1))

mean_values = np.mean(matrix, axis=(0, 1))
variance_values = np.var(matrix, axis=(0, 1))
print("Matrix:")
print(matrix)
print("\nMaximum values along all axes:", max_values)
print("Minimum values along all axes:", min_values)
print("Average (mean) values along all axes:", mean_values)
print("Variance along all axes:", variance_values)