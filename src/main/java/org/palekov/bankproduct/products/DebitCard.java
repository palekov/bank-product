package org.palekov.bankproduct.products;

import org.palekov.bankproduct.util.BankCurrency;

import java.math.BigDecimal;

public final class DebitCard extends AbstractCard {

    public DebitCard(String name) {
        super(name);
    }

    public DebitCard(String name, String balance) {
        super(name, balance);
        this.setCurrency(BankCurrency.RUB);
    }

    @Override
    public void debiting(String debitingSum) {
        BigDecimal debitingValue = new BigDecimal(debitingSum);
        if (debitingValue.compareTo(this.getBalance()) > 0) {
            throw new IllegalArgumentException("Invalid debiting value");
        }
        super.debiting(debitingSum);
    }
}
