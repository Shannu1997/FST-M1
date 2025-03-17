list1 = [2,3,4,5,6,7,8]
list2 = [9,10,11,12,13,14,15,16]
list3 = []

for num in list1:
    if (num %2 !=0):
        list3.append(num)

print (list3)

for num in list2:
    if(num %2 ==0):
        list3.append(num)

# print final list 

print(list3)