try:
    print(undeclared_variable) # type: ignore
except NameError as e:
    # Handle the NameError
    print(f"NameError encountered: {e}")
finally:
    print("Program execution continues without interruption.")
