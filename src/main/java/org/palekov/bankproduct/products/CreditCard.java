package org.palekov.bankproduct.products;

import org.palekov.bankproduct.util.BankCurrency;

import java.math.BigDecimal;

public final class CreditCard extends AbstractCard {

    private final int interestRate;

    public CreditCard(String name, String balance, int interestRate) {
        super(name, balance);
        this.setCurrency(BankCurrency.RUB);
        this.interestRate = interestRate;
    }

    public BigDecimal debitRequest() {
        return this.getBalance();
    }

    public int getInterestRate() {
        return interestRate;
    }
}
