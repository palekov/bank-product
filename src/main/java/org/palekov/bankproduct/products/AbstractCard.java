package org.palekov.bankproduct.products;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AbstractCard extends AbstractProduct {

    public AbstractCard(String name) {
        super(name);
    }

    public AbstractCard(String name, String balance) {
        super(name);
        this.setBalance(new BigDecimal(balance).setScale(2, RoundingMode.HALF_UP));
    }

    public void debiting(String debitingSum) {
        this.setBalance(this.getBalance().subtract(new BigDecimal(debitingSum).setScale(2, RoundingMode.HALF_UP)));
    }
}
