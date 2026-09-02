#Lists are mutable

mylist = [1,2,3,4,5]
mylist[0] = 7

mylist.pop()
mylist.append(8)
mylist.append(9)
mylist.extend([4,5,8,5,7])
print(mylist)
print(mylist.pop())
letters = ['a','f','e','d']
letters.sort()

def mylen():
    len(mylist)

print(letters)

x = [1,2,3]
y = x
x[2] = 7
print(x,y)
y = x[:]
x[0] = 5
print(x,y)

x = [0,1,2,3,4,5,6,7,8,9]

sliced = x[0:4:2] #start:end(non inclusive):step
print(sliced)
inverse = x[::-1]
print(inverse)