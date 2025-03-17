Player1 = input("Hello Player 1 , Please Enter your Name :")
Player2 = input("Hello Player 2 , Please Enter your Name :")

Player1_choice = input("Player1 : Your choice : rock or paper or Scissors ? ")
Player2_choice= input("Player2 : Your choice : rock or paper or Scissors? ")

if Player1_choice==Player2_choice:
    print("OOPs the game is tie... ")
elif Player1_choice == 'rock':
    if Player2_choice == 'scissors':
        print("Rock wins!")
    else:
        print("Paper wins!")
elif Player1_choice == 'scissors':
    if Player2_choice == 'paper':
        print("Scissors win!")
    else:
        print("Rock wins!")
elif Player1_choice == 'paper':
    if Player2_choice == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")

