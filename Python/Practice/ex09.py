# Get user input and control turtle graphics.

import turtle

turtle.shape('turtle')
t = turtle.Pen()

while True:
    direction = input("Please input 'L' to turn left, 'R' to turn right, 'Q' to quit")

    if direction == "Q":
        break

    if direction == "L":
        t.left(90)
        t.forward(50)

    if direction == "R":
        t.right(90)
        t.forward(50)

turtle.exitonclick()