# If someone has $5,000 and the bag costs $120, how many bags can they buy the most?

myMoney = 5000
bagPrice = 120

numBags = myMoney // bagPrice

print("The maximum number of bags you can buy: ", numBags)

change = myMoney % bagPrice

print("The money left after purchasing the bag: $", change)