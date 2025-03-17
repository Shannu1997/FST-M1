def cal(n):
    if n:
        return n + cal(n-1)
    else:
        return 0 

result = cal(10)
print("The sum of 0 to 10 is : ", result)