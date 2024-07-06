package org.palekov.bankproduct.products;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.palekov.bankproduct.util.BankCurrency;

import static org.junit.jupiter.api.Assertions.*;

class DepositTest {

    private Deposit deposit;
    private final String depositName = "Deposit";
    private final String depositBalance = "99999.00";
    private final BankCurrency testDepositCurrency = BankCurrency.EUR;
    @BeforeEach
    void setUp() {
        deposit = new Deposit(depositName, depositBalance, testDepositCurrency);
    }

    @AfterEach
    void tearDown() {
        deposit = null;
    }
    @Test
    void replenishment() {
    }

    @Test
    void getBalance() {
    }

    @Test
    void getCurrency() {
    }

    @Test
    void getName() {
    }

    @Test
    void close() {
        assertTrue(deposit.close());
    }
}