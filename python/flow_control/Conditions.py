

name = input("Hello, Welcome, what's your name?\n")

if not (name == "Ben" or name == "Loki"):
    evil = input("Are you evil?\n")
    good_deeds = int(input("how many good deeds did you do today?\n"))
    if evil.strip().lower() == "yes" and good_deeds < 4:
        print("GTF outta here, "+name)
    else:
        print("Then you're welcome")
elif name == "Tom":
    print("Nice guy")
else:
    print("Welcome, "+name)



if 5 > 3:
    print("5 is greater than 3")
elif 5 > 4:
    print("5 is greater than 4")
else:
    print("I don't know")
