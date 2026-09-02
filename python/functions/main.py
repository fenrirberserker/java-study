import os
import sys

# Functions lives in this folder; Lists lives in the sibling data_structures/ folder
sys.path.insert(0, os.path.join(os.path.dirname(__file__), "..", "data_structures"))

import Functions as m
import Lists as l

m.hello()
m.bye()

print(l.mylist)
print(len(l.mylist))