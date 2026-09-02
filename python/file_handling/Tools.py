import os
#from cryptography.fernet import Fernet

list = []

for file in os.listdir():
    if file == "Tools.py":
        continue
    if os.path.isfile(file):
        print(file)
        list.append(file)

print(list)