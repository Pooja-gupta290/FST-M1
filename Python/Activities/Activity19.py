import pandas as pd
from pandas import ExcelWriter

data = {
    "FirstName": ["Satvik", "Avinash", "Lahri"],
    "LastName": ["Shah", "Kati", "Rath"],
    "Email": ["satshah@example.com", "avinashk@example.com", "lahri.rath@example.com"],
    "PhoneNumber": [4537829158, 5892184058, 4528727830]
}

df = pd.DataFrame(data)
#writer = ExcelWriter('contact_data.xlsx')
df.to_excel("contact_data.xlsx", index=False)

print("Data has been written to 'contact_data.xlsx'")
