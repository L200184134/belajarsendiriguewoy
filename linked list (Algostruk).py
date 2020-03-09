class Node:
    def __init__(self,data = None,next=None):
        self.data = data
        self.next = next

    def getData(self):
        return self.data
    def getNext(self):
        return self.next
    def setNext(self, newNext):
        self.next = newNext

class LinkedList:
    def __init__(self,head = None):
        self.head = head
    def insert1 (self,object):
        newNode = object
        newNode.next = self.head.next.next
        self.head.next.next = newNode
    def insert(self,before,object):
        newNode = object
        newNode.next = before.next
        before.next = newNode
    def Ilistprint(self):
        printval = self.head
        while printval is not None :
            print(printval.data)
            printval = printval.next
a = Node(50)
b = Node(42)
c = Node(85)
d = Node(71)
e = Node(99)
x = Node(40)
a.next = b
b.next = c
c.next = d
d.next = e
#e.next = a ##it is the circular linked list. if it uses that the result will looping
#print(a.next.next.data)
Ilist = LinkedList()
Ilist.head = a
#print(Ilist.head.data)
#print(Ilist.head.next.next.next.data)
Ilist.insert1(x)
Ilist.Ilistprint()
#Ilist.insert(b,x)
#Ilist.Ilistprint()

