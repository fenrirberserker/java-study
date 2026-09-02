#lists
#mutable, ordered
list = ["John", "Peter", "Bob","Tom"]

print(list)
print(list[0:2])

numbers = [1,2,3,4,5]
numbers.insert(0,0)
numbers.append(6)
print(numbers)
numbers.remove(3)
print(numbers)
print(1 in numbers)
print(len(numbers))


camping_list = ["test", "sleeping bags", "water", "raspberry pi", "blankets","fire"]
camp_site = ["Crystal lake", 404, 89.3, True]

neg = camping_list[-1]
print(neg)

#tuples
#immutable, oredered, faster
atuple = ("mope", 33, "chelas")
(name, age, drink) = atuple#same with lists

print(name)
print(age)
print(drink)

othertuple = ("one","one","two","three","four","five")


print(othertuple[0:2])
print(othertuple[::2])
print(othertuple[::-1])
print("one" in othertuple)
print(othertuple.count("one"))

#sets
#unordered immutable, no duplicates
aset = {"apple","orange","banana","pineapple"}
print(aset)
aset.add("coconut")
aset.remove("orange")
print(aset)

#dictionaries -> map
#changeable, unordered

capitals = {
    'USA':'Washington',
    'Mexico':'CDMX',
    'China':'Beijing',
    'Russia':'Moscow'
}

print(capitals['Mexico'])
#print(capitals['Germany'])#fails
print(capitals.get('Germany'))
print(capitals.keys())
print(capitals.values())
print(capitals.items())

for key,val in capitals.items():
    print(key, val)

capitals.update({'Germany':'Berlin'})
capitals.update({'USA':'Las Vegas'})

print(capitals)

capitals.pop('China')
print(capitals)
capitals.clear()
print(capitals)

