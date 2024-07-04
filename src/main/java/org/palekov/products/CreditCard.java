package org.palekov.products;

import java.math.BigDecimal;

public class CreditCard extends AbstractProduct {
    private int interestRate;

    public BigDecimal debitRequest() {
        return this.getBalance();
    }
}
