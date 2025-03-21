import pytest

@pytest.fixture

def listof10():
    list = [0,1,2,3,4,5,6,7,8,9,10]
    return list 

def test_sum(listof10):
    sum = 0

    for n in listof10:
        sum+= n 

    assert sum ==55
    