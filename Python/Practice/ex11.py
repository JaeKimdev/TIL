# A program that receives a name from a user and checks the password.

user_list = ["Jae", "John", "Dave", "Choi", "Smith"]

pw = "1234"

id = input("Please input your name: ")

if id in user_list:
    password = input("Please input password: ")
    if password == pw:
        print(id, "logged in")
    else:
        print("Your password wrong!")
else:
    print("This is an unregistered name")