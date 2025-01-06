import pandas as pd

# Read the Excel file
df = pd.read_excel("contact_data.xlsx")

# 1. Print the number of rows and columns
print("Number of rows and columns:")
print(df.shape)  # Returns a tuple (rows, columns)

# 2. Print the data in the Emails column only
print("\nEmails column:")
print(df["Email"])

# 3. Sort the data based on FirstName in ascending order and print the data
sorted_data = df.sort_values("FirstName")
print("\nData sorted by FirstName (ascending):")
print(sorted_data)
