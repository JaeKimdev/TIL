# SM TAFE hosts Python coding competitions.
# We decided to hold a comment event to increase attendance.
# Among the comment writers, one person will receive chicken and three coffee coupons through a lottery.
# Write a raffle program.

# Condition 1: 20 people wrote the comments and the ID is 1-20
# Condition 2: Random draw regardless of comments but not duplicated
# Condition 3: Using the shuffle and sample of the random module

# Sample Output
# --- Winner Announcement ---
# Chicken winners: 1
# Coffee winners: [2, 3, 4]
# --- Congratulations ---

from random import *
users = range(1, 21)
#print(type(users))
users = list(users)
#print(type(users))

shuffle(users)
#print(users)
winners = sample(users, 4)
#print(winners)

print(" --- Winner Announcement --- ")
print("     Chicken winners: {0}".format(winners[0]))
print("     Coffee winners: {0}".format(winners[1:]))
print(" --- Congratulations --- ")
