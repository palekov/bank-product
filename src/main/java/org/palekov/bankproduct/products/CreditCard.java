package org.palekov.bankproduct.products;

import org.palekov.bankproduct.util.BankCurrency;

import java.math.BigDecimal;

public final class CreditCard extends AbstractCard {

    private final float interestRate;

    public CreditCard(String name, String balance, float interestRate) {
        super(name, balance);
        this.setCurrency(BankCurrency.RUB);
        this.interestRate = interestRate;
    }

    public BigDecimal debitRequest() {
        return this.getBalance();
    }

    public float getInterestRate() {
        return interestRate;
    }
}
