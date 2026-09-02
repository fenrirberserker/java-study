import os
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

from vector.Vector import Vector
from datamodel.Datamodel import FrenchDeck

if __name__ == '__main__':
    v1 = Vector(2, 4)
    v2 = Vector(2, 1)
    print(v1 + v2)

    deck = FrenchDeck()
    print(f'{len(deck)} cards, first: {deck[0]}, last: {deck[-1]}')
