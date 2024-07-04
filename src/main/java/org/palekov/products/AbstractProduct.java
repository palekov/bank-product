package org.palekov.products;

import org.palekov.util.BankCurrency;

import java.math.BigDecimal;

public abstract class AbstractProduct {
    protected BankCurrency currency;
    protected BigDecimal balance;
    protected String name;

    public AbstractProduct() {
    }

    public AbstractProduct(String name) {
        this.name = name;
    }

    public BigDecimal replenishment(BigDecimal value) {
        return balance.add(value);
    }

    public BankCurrency getCurrency() {
        return currency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}
