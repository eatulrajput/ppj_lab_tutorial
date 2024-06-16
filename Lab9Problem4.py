# Generate a 5 by 5 random integer matrix whose values are between 2 & 100. Find the another
# matrix which produces boolean output as true where Values of random matrix are between 20 &
# 70.

print("Name: Atul Rajput")
print("Roll No. 2230158")

import numpy as np
random_matrix = np.random.randint(2, 101, size=(5, 5))
boolean_matrix = np.logical_and(random_matrix >= 20, random_matrix <= 70)
print("Random Integer Matrix:")
print(random_matrix)
print("\nBoolean Matrix (True where values are between 20 and 70):")
print(boolean_matrix)