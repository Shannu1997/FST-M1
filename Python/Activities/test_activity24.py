import pytest

@pytest.fixture
def wallet():
    amount = 0
    return amount 

# @pytest.mark.parametrize("num, output", [(1, 11), (2, 22), (3, 33)])
# def test_multiplication_11(num, output):
#     assert 11 * num == output

@pytest.mark.parametrize("earned, spent, expected", [(30,10,20), (20,2,18),])
def test_wallet(wallet, earned, spent, expected):
    wallet +=0
    wallet+=earned 
    wallet -=spent

    assert wallet ==expected 