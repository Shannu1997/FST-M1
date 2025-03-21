import pandas as pd

df = pd.read_excel("Userdetails.xlsx", sheet_name="Sheet1")

print(" The total no of rows are " + str(df.shape[0])+ " and columns are " +str(df.shape[1]))

print(df["Email"])

print(" Below are the Firstname sorted in ascending order ----- ")

print(df.sort_values("FirstName", ascending= True))