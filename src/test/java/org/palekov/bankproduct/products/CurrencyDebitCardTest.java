package org.palekov.bankproduct.products;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.palekov.bankproduct.util.BankCurrency;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyDebitCardTest {

    private final String testCardName = "Currency credit card";
    private final String testCardBalance = "10000.00";

    private final BankCurrency testCardCurrency = BankCurrency.USD;

    private CurrencyDebitCard currencyDebitCard;
    @BeforeEach
    void setUp() {
        currencyDebitCard = new CurrencyDebitCard(testCardName, testCardBalance, testCardCurrency);
    }

    @AfterEach
    void tearDown() {
        currencyDebitCard = null;
    }

    @Test
    void replenishment() {
        currencyDebitCard.replenishment("1000.00");
        assertEquals("11000.00", currencyDebitCard.getBalance().toString());
    }

    @Test
    void getBalance() {
        assertEquals(testCardBalance, currencyDebitCard.getBalance().toString());
    }

    @Test
    void getCurrency() {
        assertEquals(testCardCurrency, currencyDebitCard.getCurrency());
    }

    @Test
    void getName() {
        assertEquals(testCardName, currencyDebitCard.getName());
    }
}