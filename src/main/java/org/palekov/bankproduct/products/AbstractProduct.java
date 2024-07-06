package org.palekov.bankproduct.products;

import org.palekov.bankproduct.util.BankCurrency;

import java.math.BigDecimal;

public abstract class AbstractProduct {

    private String name;
    private BankCurrency currency;
    private BigDecimal balance;

    protected AbstractProduct() {
    }

    protected AbstractProduct(String name) {
        String namePattern = "^[a-z A-Z0-9]*$";
        if (name.matches(namePattern)) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid product name");
        }
    }

    public void replenishment(String value) {
        BigDecimal replenishmentValue = new BigDecimal(value);
        if (replenishmentValue.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Invalid replenishment value");
        }
        this.balance = balance.add(replenishmentValue);
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public BankCurrency getCurrency() {
        return this.currency;
    }

    public String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setCurrency(BankCurrency currency) {
        this.currency = currency;
    }

    protected void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
