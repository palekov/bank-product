package org.palekov.bankproduct.products;

import org.palekov.bankproduct.util.BankCurrency;

import java.math.BigDecimal;

public class CreditCard extends AbstractCard {

    private int interestRate;

    public CreditCard(String name, String balance, int interestRate) {
        super(name, balance);
        this.currency = BankCurrency.RUB;
        this.interestRate = interestRate;
    }

    public BigDecimal debitRequest() {
        return this.getBalance();
    }
}
