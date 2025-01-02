def check_fruit_availability():
   
    fruit_prices = {
        'apple': 20,
        'banana': 10,
        'orange': 15,
        'mango': 30,
        'grapes': 40
    }
    
    fruit = input("Enter the name of the fruit you want to check: ").lower()
    
   
    if fruit in fruit_prices:
        print(f"{fruit.capitalize()} is available.")
    else:
        print(f"{fruit.capitalize()} is not available.")
        

check_fruit_availability()
