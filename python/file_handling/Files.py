import os
import shutil
from cryptography.fernet import Fernet

source = "../resources/filetest.txt"
dest = "../resources/filetest2.txt"

if os.path.exists(source):
    print("exists")
    if os.path.isfile(source):
        print("Is a file")
else:
    print("doesn't exists")

#read
try:
    with open(source, 'r') as file:
        print(file.read())
except FileNotFoundError:
    print("File not found")

#write
try:
    with open(source, 'a') as file:#w for write
        file.write("\nWhat's up! Hello there")
except FileNotFoundError:
    print("File not found")

#copy a file
shutil.copyfile(source, dest)

#move a file
newfile = "../resources/filetest3.txt"
try:
    if os.path.exists(newfile):
        print("There's a file there")
    else:
        os.replace(dest,newfile)
        print(dest+" was moved")
except FileNotFoundError:
    print("File not found")

#delete a file
#os.remove(newfile)

#use crypto
keypath = "../resources/key.key"
def write_key():
    key = Fernet.generate_key()
    with open(keypath,"wb") as key_file:
        key_file.write(key)

#write_key()#called only once

def load_key():
    file = open(keypath,"rb")
    key = file.read()
    return key


key = load_key()
fer = Fernet(key)

file = "../resources/file.txt"
#with autoclosable for file
#open modes: w write(override content), r readonly, a append
with open(file, 'a') as f:
    f.write('\nNew line from code')
    encrypted = str(fer.encrypt('This is encrypted'.encode()).decode())
    decrypted = str(fer.decrypt(encrypted).decode())
    f.write('\n'+encrypted)
    f.write('\n'+decrypted)



with open(file, 'r') as f:
    for line in f.readlines():
        print(line.rstrip())