package org.palekov.products;

import java.math.BigDecimal;
import java.util.Currency;

public abstract class AbstractProduct {
    private Currency currency;
    private BigDecimal balance;
    private String name;

    public BigDecimal replenishment(BigDecimal value) {
        return balance.add(value);
    }

    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}
