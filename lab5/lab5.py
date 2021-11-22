# Creating Node
class Node:
    def __init__(self, val = None):
        self.val = val
        self.next = None

# Creating the linked List    
class LinkedList:
    def __init__(self):
        head = None

    def traverseList(self):
        printState = self.head
        while (printState is not None):
            

# initialising Links
links = LinkedList()
links.head = Node("S0")
s1 = Node("S1")
s2 = Node("S2")

# Linking the nodes
links.head.next = s1
s1.next = s2

links.traverseList()

