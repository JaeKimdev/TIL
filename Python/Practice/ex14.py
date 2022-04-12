# Dictionary

cabinet = {3:"Jae", 100:"John"}
print(cabinet[3])
print(cabinet[100])

print(cabinet.get(3))
print(cabinet.get(5, "Avaiable"))

print(3 in cabinet) # True
print(5 in cabinet) # False

cabinet = {"A-3":"Jae", "B-100":"John"}
print(cabinet["A-3"])
print(cabinet["B-100"])

# Add
print(cabinet)
cabinet["A-3"] = "Kyle"
cabinet["C-20"] = "James"
print(cabinet)

# Delete
del cabinet["A-3"]
print(cabinet)

# Print only keys
print(cabinet.keys())

# Print only values
print(cabinet.values())

# Print keys, values pair
print(cabinet.items())

# Clear
cabinet.clear()
print(cabinet)