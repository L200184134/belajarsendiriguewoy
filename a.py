import numpy as np
list1 = [3,5,6]
list2 = [3,5,"a"]
print(type(list1))

arr1 = np.array([3,5,6])
print(type(arr1))

list3 = [[1,2],[2,4]]
list4 = [[1,2,3],[3,2,1],[2,1,3]]
list5 = [[[1,2],[2,1]],[[3,4],[4,3]]]
print(list5 + list3 + list1)
print(list4)
print(list5)
print(list4[1][0:1])

a = [1,2,3]
b = [3,4,5]
x = []
y = []
x.array(a)
y.array(b)
print(x+b)
