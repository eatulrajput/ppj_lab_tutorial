# Using the following data plot a bar plot and a horizontal bar plot. company = ["Apple",
# "Microsoft", "Google", "AMD"] profit = [3000, 8000, 1000, 10000].

print("Name: Atul Rajput")
print("Roll No. 2230158")

import matplotlib.pyplot as plt

company = ["Apple", "Microsoft", "Google", "AMD"]
profit = [3000, 8000, 1000, 10000]

plt.figure(figsize=(8, 6))
plt.bar(company, profit, color='skyblue')
plt.title('Profit of Companies')
plt.xlabel('Company')
plt.ylabel('Profit (in millions)')
plt.show()

plt.figure(figsize=(8, 6))
plt.barh(company, profit, color='salmon')
plt.title('Profit of Companies')
plt.xlabel('Profit (in millions)')

plt.ylabel('Company')
plt.show()