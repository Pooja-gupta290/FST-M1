import pandas as pd

# Read the CSV file
df = pd.read_csv("user_data.csv")

# 1. Print the values in the Usernames column
print("Usernames column values:")
print(df["Usernames"])

# 2. Print the username and password of the second row
print("\nUsername and password of the second row:")
print(f"Username: {df.loc[1, 'Usernames']}, Password: {df.loc[1, 'Passwords']}")

# 3. Sort the Usernames column in ascending order and print data
sorted_usernames = df.sort_values("Usernames")
print("\nData sorted by Usernames (ascending):")
print(sorted_usernames)

# 4. Sort the Passwords column in descending order and print data
sorted_passwords = df.sort_values("Passwords", ascending=False)
print("\nData sorted by Passwords (descending):")
print(sorted_passwords)
