
Tuple_num = (1,25,10,11,15)
print(Tuple_num)

list_divby5 = []
for num in Tuple_num:
    if(num %5==0):
        print(num)
        list_divby5.append(num)


print("These are the values in tuple which is divisble by 5 : ", list_divby5)
