# Random number game

from random import *

random_num = randint(1, 100)
print("Random number = ", random_num)
user_num = int(input("Guess number(1 ~ 100): "))
count = 0;

while True:
    if user_num == random_num:
        count += 1
        print("That's correct! End game!, Number of attempts: ", count)
        break
    elif user_num > random_num:
        print("Please input smaller number")
        count += 1
    else:
        print("Please input bigger numebr")
        count += 1
    user_num = int(input("Please put number again: "))
