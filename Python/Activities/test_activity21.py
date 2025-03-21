import pytest 

num1 = 10
num2= 5

sum = num1+num2
diff=num1-num2
prod = num1 * num2 
Quot = num1/num2

@pytest.mark.testcase1
def test_sum():
    num1 = 10
    num2= 5
    sum = num1+num2
    assert sum ==15

@pytest.mark.testcase1
def test_diff():
    num1 = 10
    num2= 5
    diff=num1-num2
    assert diff ==5 

@pytest.mark.activity
def test_prod():
    num1 = 10
    num2= 5
    prod = num1 * num2 
    assert prod == 50 

@pytest.mark.activity
def test_quot():
    num1 = 10
    num2= 5
    Quot = num1/num2
    assert Quot ==2



