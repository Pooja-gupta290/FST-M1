def combine_odd_even(list1, list2):
    
    odd_numbers = [num for num in list1 if num % 2 != 0]
    
    
    even_numbers = [num for num in list2 if num % 2 == 0]
    
    new_list = odd_numbers + even_numbers
    return new_list

list1 = [1, 2, 3, 4, 5]
list2 = [6, 7, 8, 9, 10]
result = combine_odd_even(list1, list2)
print(result)
