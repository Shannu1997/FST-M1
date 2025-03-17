

def fibonnaci_series(number):
    if number<=1:
        return number
    else:
        return(fibonnaci_series(number-1)+fibonnaci_series(number-2))
    

GivenNum = int(input("Enter a Number: "))

if(GivenNum<=0):
    print("Please Enter a Valid Number to generate a fibonacci")
else:
    print("Fibonacci series for a given num is : ")
    for num in range(GivenNum):
        print(fibonnaci_series(num))
