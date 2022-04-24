# You are an Uber service driver.
# When you have a chance to match 50 passengers, write a program to calculate the total number of passengers on board

# CONDITION 1: The time required for each passenger is determined by a random number between 5 and 50 minutes.
# CONDITION 2: You must match only passengers between 5-15 minutes.

# Sample Output Statements
# [O] 1th customer (time required: 15 minutes)
# [ ] 2th customer (time required: 50 minutes)
# [O] 3th customer (time required: 5 minutes)
# ...
# [ ] 50th customer (time: 16 minutes)

# Total passengers on board: 2 persons

from random import *
count = 0
for i in range(1, 51):
    time = randrange(5, 51)
    if 5 <= time <= 15:
        print("[O] {0}th customer (time required: {1} minutes)".format(i, time))
        count += 1
    else:
        print("[ ] {0}th customer (time required: {1} minutes)".format(i, time))
print("Total passengers on board: {0} persons".format(count))