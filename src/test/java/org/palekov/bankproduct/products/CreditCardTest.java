package org.palekov.bankproduct.products;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.palekov.bankproduct.util.BankCurrency;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    private CreditCard creditCard;

    private final String testCardName = "Rouble credit card";
    private final String invalidCardName = "Super-card №777";
    private final String testCardBalance = "1000.00";
    private final String zeroBalance = "0.00";
    private final float testCardInterestRate = 3.75F;
    @BeforeEach
    void setUp() {
        creditCard = new CreditCard(testCardName, testCardBalance, testCardInterestRate);
    }

    @AfterEach
    void tearDown() {
        creditCard = null;
    }

    @Test
    void replenishment() {
        creditCard.replenishment("1000.00");
        assertEquals("2000.00", creditCard.getBalance().toString());
    }

    @Test
    void debiting() {
        creditCard.debiting("1000.00");
        assertEquals(zeroBalance, creditCard.getBalance().toString());
    }

    @Test
    void setNameExpectedException() {
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            creditCard.setName(invalidCardName);
        });
        Assertions.assertEquals("Invalid product name", exception.getMessage());
    }

    @Test
    void getBalance() {
        assertEquals(testCardBalance, creditCard.getBalance().toString());
    }

    @Test
    void getCurrency() {
        assertEquals(BankCurrency.RUB, creditCard.getCurrency());
    }

    @Test
    void getName() {
        assertEquals(testCardName, creditCard.getName());
    }

    @Test
    void getInterestRate() {
        assertEquals(testCardInterestRate, creditCard.getInterestRate());
    }

    @Test
    void debitRequest() {
        assertEquals("1000.00", creditCard.debitRequest().toString());
    }
}