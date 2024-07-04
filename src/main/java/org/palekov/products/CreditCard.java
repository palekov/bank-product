package org.palekov.products;

import org.palekov.util.BankCurrency;

import java.math.BigDecimal;

public class CreditCard extends AbstractProduct {
    private int interestRate;
    private final BankCurrency currency = BankCurrency.RUB;

    public CreditCard(String name) {
        super(name);
    }

    public CreditCard(String name, BigDecimal balance) {
        super(name);
        this.balance = balance;
        this.name = name;
    }

    public CreditCard(String name, BigDecimal balance, int interestRate) {
        super(name);
        this.balance = balance;
        this.interestRate = interestRate;
    }


    public BigDecimal debitRequest() {
        return this.getBalance();
    }
}
