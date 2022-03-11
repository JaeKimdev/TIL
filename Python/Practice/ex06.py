# It's a program where you get an integer and change it to hour, minute, second.

time = int(input("Please input seconds: "))

second = time % 60
minute = (time // 60) % 60
hour = (time // 60) // 60

print(time, "Seconds =", hour, "hour(s)", minute, "minute(s)", second, "second(s)")