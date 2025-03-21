import pandas as pd

df = pd.read_csv('usercreds.csv')
#Usernames,Passwords
print(df["Usernames"])

print(" Username is " + df["Usernames"][1], " and password is : "+ df["Passwords"][1])

print( " Below are username sorted in ascending order  : ")
print(df.sort_values("Usernames", ascending=True))

print( " Below are passwords  sorted in Decending order  : ")

print(df.sort_values("Passwords", ascending=False))