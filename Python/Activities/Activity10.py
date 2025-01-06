def print_divisible_by_5():
         
    num_tuple = (10,23,25,30,44)
    print("Given list of numbers:", num_tuple)
       
    for num in num_tuple:
        if num % 5 == 0:
            print(num)

print_divisible_by_5()
