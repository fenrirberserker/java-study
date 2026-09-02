my_dictionary = {'key1':'value1','key2':'value2','key3':'value3'}

print(my_dictionary)
print(my_dictionary['key1'])

print('key1' in my_dictionary)
del my_dictionary['key3']
print(my_dictionary)

for key,value in my_dictionary.items():
    print(key, value)