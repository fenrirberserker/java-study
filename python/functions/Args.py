def add(*args):
    sum = 0
    for i in args:
        sum += i
    return sum

print(add(2,3,5))

def hello(**kwargs):
    print("Hello "+kwargs['first']+" "+kwargs['last'])
    for key,value in kwargs.items():
        print(key+" "+value)

hello(last="Baby",first="Mope")