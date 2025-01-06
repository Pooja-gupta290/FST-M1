def sum(elements):
    # Calculate the sum of the list elements
    total = 0
    for element in elements:
        total += element
    return total

# Example usage
numbers = [1, 2, 3, 4, 5]
result = sum(numbers)
print(f"The sum of the list elements is: {result}")
