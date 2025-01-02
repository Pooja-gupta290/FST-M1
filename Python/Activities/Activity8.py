def check_first_last_same():
    
    user_input = input("Enter a list of numbers, separated by commas: ")
    
    
    num_list = [int(num.strip()) for num in user_input.split(',')]
    
    
    return num_list[0] == num_list[-1]

result = check_first_last_same()
print(result)
