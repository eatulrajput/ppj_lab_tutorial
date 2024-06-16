# Create a pandas data structure (series) X using a dictionary D = "Rohan": 176,"John":
# 175,"Harvinder": 180,"Hasan": 174 . Then pass other list ["Tinku","John","Ramesh","Hasan"] as
# index into series X . Comment on the resultant output & locate the index of NAN values.

print("Name: Atul Rajput")
print("Roll No. 2230158")
import pandas as pd
D = {"Rohan": 176, "John": 175, "Harvinder": 180, "Hasan": 174}
X = pd.Series(D)
indexes = ["Tinku", "John", "Ramesh", "Hasan"]
X_reindexed = X.reindex(indexes)
print("Resultant Series:")
print(X_reindexed)
print("\nComment:")

print("Since 'Tinku' and 'Ramesh' are not present in the original Series, they have NaN values.")
nan_indexes = X_reindexed.index[X_reindexed.isna()]
print("\nIndexes of NaN values:")
print(nan_indexes)