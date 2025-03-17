def calculate_sum(numbers):
    sum = 0
    for number in numbers:
        sum += number
    return sum

sumlist = [10,20,30,40,50]

result = calculate_sum(sumlist)

print("The sum of the given list: ", result)