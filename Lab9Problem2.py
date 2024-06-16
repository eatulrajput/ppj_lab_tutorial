# Consider the system of equations
# 3x + 2y = 5
# 10x − y = 3
# Find the unique solution to these equations using matrix calculus in the Numpy array.

print("Name: Atul Rajput")
print("Roll No. 2230158")
import numpy as np

coefficients = np.array([[3, 2],
[10, -1]])
constants = np.array([5, 3])

solution = np.linalg.solve(coefficients, constants)
print("The unique solution is:")
print("x =", solution[0])
print("y =", solution[1])