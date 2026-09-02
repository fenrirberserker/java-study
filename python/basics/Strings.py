
print("""Hello
I am
Ironman""")

print("Hello "*7)

str = "this is a test"
#start:stop:step
print(str[2:14])
print(str[2::2])
print(str[2:10:2])
print(str[::-1])

website = "http://google.com"
slice = slice(7,-4)

print(website[slice])

animal = "cow"
item = "moon"

print("The {} jumped over the {}".format(animal,item))
print("The {0} jumped over the {1}".format(animal,item))
text = "The {} jumped over the {}"
print(text.format(animal,item))

name = "mope"
print("Hello my name is {:10}. Nice to meet you".format(name))
print("Hello my name is {:<10}. Nice to meet you".format(name))
print("Hello my name is {:>10}. Nice to meet you".format(name))
print("Hello my name is {:^10}. Nice to meet you".format(name))

number = 3.14159
print("The number pi is {}".format(number))
print("The number pi is {:.3f}".format(number))

number = 1000
print("The number is {:,}".format(number))#comma separated
print("The number is {:b}".format(number))#binary
print("The number is {:o}".format(number))#octal
print("The number is {:X}".format(number))#hexadecimal
print("The number is {:e}".format(number))