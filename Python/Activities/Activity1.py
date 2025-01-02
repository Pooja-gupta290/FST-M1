name = input("Enter your name: ")
age = int(input("Enter your age: "))

from datetime import datetime
current_year = datetime.now().year

year_to_turn_100 = current_year + (100 - age)

print(f"Hello {name}! You will turn 100 years old in the year {year_to_turn_100}.")