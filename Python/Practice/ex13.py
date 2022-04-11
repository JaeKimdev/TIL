'''
A program that generate passwords for each web-site
ex> http://google.com

Requirements
1) Exclude the first "http://" part => google.com
2) Except atfer first "." => google
3) The first 3 digits of the letter remaining + the number of letters + the number of 'e' in the letter + "!"
                    (goo)                               (6)                     (1)                 (!)

Generated Password : goo61!
'''

url = "http://google.com"
my_str = url.replace("http://", "") # Requirements 1
#print(my_str)
my_str = my_str[:my_str.index(".")] # Requirements 2 = my_str[0:6]
#print(my_str)
password = my_str[:3] + str(len(my_str)) + str(my_str.count("e")) + "!"
print("The password for {0} is {1}".format(url, password))