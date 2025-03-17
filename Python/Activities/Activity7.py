# calculate the sum of all the elements in a list

numbers = [1,2,3,4,5]

#numbers = list(input("Enter a sequence of comma separated values: ").split(", "))
sum = 0
 
for number in numbers:
  sum += int(number)
 
print(sum)