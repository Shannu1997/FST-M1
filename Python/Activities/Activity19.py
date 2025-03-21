import pandas as pd
from pandas import ExcelFile
from pandas import ExcelWriter

data = {
    "FirstName":["Satvik","Avinash","Lahri"],
    "LastName":["Shah","Kati", "Rath"],
    "Email":["satshah@example.com","avinashk@example.com","lahri.rath@example.com"],
    "PhoneNumber":[4537829158, 5892184058, 4528727830]
}

df =pd.DataFrame(data)

# write object 

writer = ExcelWriter("Userdetails.xlsx")

df.to_excel(writer, "Sheet1", index=False)

writer.close()

df1 = pd.read_excel("Userdetails.xlsx", sheet_name ="Sheet1")
print(df1)