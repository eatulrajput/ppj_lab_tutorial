# Draw four line plots using the subplot() function. Use the following data: For line 1: x = [0, 1, 2,
# 3, 4, 5] and y = [0, 100, 200, 300, 400, 500] For line 2: x = [0, 1, 2, 3, 4, 5] and y = [50, 20, 40,
# 20, 60, 70] For line 3: x = [0, 1, 2, 3, 4, 5] and y = [10, 20, 30, 40, 50, 60] For line 4: x = [0, 1, 2,
# 3, 4, 5] and y = [200, 350, 250, 550, 450, 150]

print("Name: Atul Rajput")
print("Roll No. 2230158")

import matplotlib.pyplot as plt

x1 = [0, 1, 2, 3, 4, 5]
y1 = [0, 100, 200, 300, 400, 500]

x2 = [0, 1, 2, 3, 4, 5]
y2 = [50, 20, 40, 20, 60, 70]

x3 = [0, 1, 2, 3, 4, 5]
y3 = [10, 20, 30, 40, 50, 60]

x4 = [0, 1, 2, 3, 4, 5]
y4 = [200, 350, 250, 550, 450, 150]

plt.figure(figsize=(10, 8))

plt.subplot(2, 2, 1)
plt.plot(x1, y1, marker='o', color='b')
plt.title('Line 1')

plt.subplot(2, 2, 2)
plt.plot(x2, y2, marker='s', color='r')
plt.title('Line 2')

plt.subplot(2, 2, 3)
plt.plot(x3, y3, marker='^', color='g')
plt.title('Line 3')

plt.subplot(2, 2, 4)
plt.plot(x4, y4, marker='*', color='m')
plt.title('Line 4')

plt.tight_layout()
plt.show()