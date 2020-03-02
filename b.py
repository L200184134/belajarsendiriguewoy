def transpose(x,y):
    for i in range(len(x[0])):
        row = []
        for f in x :
            row.append(f[i])
        y.append(row)
    return y

x = [[4,5,3,9],[7,1,8,2]]
y=[]
print(transpose(x,y))


