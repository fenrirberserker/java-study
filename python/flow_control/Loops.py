

success = True
for number in range(3):
    print("Hello", number)
    if success:
        print("Successful")
        break
else:#if condition not met, this will be executed
    print("Failed")

print("\n")

numbers = [1,2,3,4,5]
for item in numbers:
    print(item)

for i in range(len(numbers)):
    print(numbers[i])

for i, element in enumerate(numbers):
    print(i, element)

for number in range(1,10,2):
    print("Hello", number)

for x in range(5):
    for y in range(4):
        print(f"({x},{y})")





var = 1
while var <=5:
    print(f"var is {var}")
    var +=1

i = 0
while i < len(numbers):
    print(numbers[i])
    i = i + 1
#start:stop:step
numbers = range(1,10,2)
for number in numbers:
    print(number)

phone = "123-456-7890"

for i in phone:
    if i == "-":
        continue
    print(i, end="")

for i in range(1,21):
    if i == 13:
        pass
    else:
        print(i)


#name = input("What's your name?\n")

#while name != "mope":
    #name = input("What's your name?\n")

#print(f"Hello, {name}")

while True:
    name = input("What's your name?\n")
    if name != "":
        break;