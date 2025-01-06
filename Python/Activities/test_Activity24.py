import pytest

# Fixture that initializes the wallet amount to 0
@pytest.fixture
def wallet():
    amount = 0  # Initial amount is 0
    return amount

# Test function that tests the wallet scenario
@pytest.mark.parametrize("earned, spent, expected", [
    (100, 50, 50),  # Add 100, spend 50, expect 50 remaining
    (200, 100, 100),  # Add 200, spend 100, expect 100 remaining
    (50, 0, 50),  # Add 50, spend 0, expect 50 remaining
    (0, 100, -100),  # Add 0, spend 100, expect -100 remaining
])
def test_wallet_transactions(wallet, earned, spent, expected):
    # Add earned cash
    wallet += earned
    # Spend cash
    wallet -= spent
    # Assert that the remaining amount matches the expected value
    assert wallet == expected
