package org.palekov.bankproduct.products;

import org.palekov.bankproduct.util.BankCurrency;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class Deposit extends AbstractProduct {

    public Deposit(String name, String balance, BankCurrency currency) {
        super(name);
        this.setBalance(new BigDecimal(balance).setScale(2, RoundingMode.HALF_UP));
        this.setCurrency(currency);
    }
    public boolean close() {
        return true;
    }
}
