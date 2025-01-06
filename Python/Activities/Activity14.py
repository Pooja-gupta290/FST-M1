def fibonacci(n):
    # Base cases
    if n == 0:
        return 0
    elif n == 1:
        return 1
    
    return fibonacci(n - 1) + fibonacci(n - 2)

def generate_fibonacci():
    
    num = int(input("How many Fibonacci numbers would you like to generate? "))
    
    print("Fibonacci sequence:")
    for i in range(num):
        print(fibonacci(i), end=" ")

generate_fibonacci()
