# Using the following data to plot a box plot. import numpy as np box1 = np.random.normal(100,
# 10, 200) box2 = np.random.normal(90, 20, 200).

print("Name: Atul Rajput")
print("Roll No. 2230158")
import matplotlib.pyplot as plt
import numpy as np

box1 = np.random.normal(100, 10, 200)
box2 = np.random.normal(90, 20, 200)

data = [box1, box2]
plt.figure(figsize=(8, 6))
plt.boxplot(data, patch_artist=True)

plt.xticks([1, 2], ['Box 1', 'Box 2'])
plt.xlabel('Box')
plt.ylabel('Values')
plt.title('Box Plot')

plt.grid(True)
plt.show()