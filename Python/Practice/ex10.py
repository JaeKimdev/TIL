# A program that receives height and weight and outputs BMI.
# BMI = weight / (height * height)

height = float(input("Please input your height(cm): "))
weight = float(input("Please input your weight(kg): "))

height /= 100.0 # same as 'height = height / 100'
bmi  = weight / (height * height)
print("your BMI is: ", bmi)

if(bmi >= 20.0) and (bmi < 25.0):
    print("Your obesity level is standard.")

else:
    print("Weight management is necessary for health.")
