while True:
    print("\nRock-Paper-Scissors Game!")
    print("Player 1, make your choice (rock, paper, scissors):")
    player1 = input().lower()
    print("Player 2, make your choice (rock, paper, scissors):")
    player2 = input().lower()

    if player1 == player2:
        print("It's a tie!")
    elif (player1 == "rock" and player2 == "scissors") or \
         (player1 == "scissors" and player2 == "paper") or \
         (player1 == "paper" and player2 == "rock"):
        print("Player 1 wins!")
    else:
        print("Player 2 wins!")

    play_again = input("Do you want to play another round? (yes/no): ").lower()
    if play_again != "yes":
        print("Thanks for playing!")
        break