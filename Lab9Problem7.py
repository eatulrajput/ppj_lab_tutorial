# Create a Normalized random variable of size 20 using Numpy and find out each quartile & their
# corresponding counts.
print("Name: Atul Rajput")
print("Roll No. 2230158")
import numpy as np
np.random.seed(0)
random_array = np.random.randn(20)
normalized_array = (random_array - np.mean(random_array)) / np.std(random_array)

quartiles = np.percentile(normalized_array, [25, 50, 75])
quartile_counts = np.histogram(normalized_array, bins=quartiles)[0]
print("Normalized Array:", normalized_array)
print("Quartiles:", quartiles)
print("Quartile Counts:", quartile_counts)