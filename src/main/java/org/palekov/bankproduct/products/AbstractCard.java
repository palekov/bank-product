package org.palekov.bankproduct.products;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AbstractCard extends AbstractProduct {

    public AbstractCard(String name) {
        super(name);
    }

    public AbstractCard(String name, String balance) {
        super(name);
        this.balance =  new BigDecimal(balance).setScale(2, RoundingMode.HALF_UP);
    }
}
