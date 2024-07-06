package org.palekov.bankproduct.products;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.palekov.bankproduct.util.BankCurrency;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class DebitCardTest {

    private final String testCardName = "Debit card";
    private final String testCardBalance = "1700000.00";
    private final String testCardReplenishmentSum = "100000.00";
    private final String testCardReplenishmentBalance = "1800000.00";
    private final BankCurrency testCardCurrency = BankCurrency.RUB;
    private DebitCard debitCard;
    @BeforeEach
    void setUp() {
        debitCard = new DebitCard(testCardName, testCardBalance);
    }

    @AfterEach
    void tearDown() {
        debitCard = null;
    }

    @Test
    void replenishment() {
        debitCard.replenishment(testCardReplenishmentSum);
        assertEquals(testCardReplenishmentBalance, debitCard.getBalance().toString());
    }

    @Test
    void debitingExpectedException() {
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            debitCard.debiting("2000000.00");
        });
        Assertions.assertEquals("Invalid debiting value", exception.getMessage());
    }
}