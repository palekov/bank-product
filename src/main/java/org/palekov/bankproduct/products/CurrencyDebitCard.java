package org.palekov.bankproduct.products;

import org.palekov.bankproduct.util.BankCurrency;

public class CurrencyDebitCard extends AbstractCard {

    public CurrencyDebitCard(String name, String balance, BankCurrency currency) {
        super(name, balance);
        this.setCurrency(currency);
    }
}
