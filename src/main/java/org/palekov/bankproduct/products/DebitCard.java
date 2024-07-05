package org.palekov.bankproduct.products;

import org.palekov.bankproduct.util.BankCurrency;

public class DebitCard extends AbstractCard {

    public DebitCard(String name) {
        super(name);
    }

    public DebitCard(String name, String balance) {
        super(name, balance);
        this.currency = BankCurrency.RUB;
    }
}
