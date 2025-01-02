print("\nSum of Elements in a List:")
user_list = input("Enter a list of numbers separated by spaces: ").split()
number_list = [int(x) for x in user_list]
list_sum = sum(number_list)
print(f"The sum of the list {number_list} is {list_sum}.")
