package co.com.jperez.services;

import co.com.jperez.models.Currency;

import static co.com.jperez.utils.CurrencyConstants.*;

public class ConverterService {

    public String convertCurrency(Currency currency) {

        String key = currency.getActual() +
                " TO " +
                currency.getExpected();
        double conversionValue = 0;
        try {
            conversionValue = CURRENCY_MAP.get(key);

        } catch (NullPointerException e) {
            JOptionPaneService.getJOptionPaneError();
        }

        double result = currency.getAmount() * conversionValue;

        return currency.getSymbol() +
                " " +
                result;

    }

    public String symbolConverted(String currencyType) {
        switch (currencyType) {
            case COP, USD -> { return DOLLAR_SYMBOL; }
            case EUR -> { return EURO_SYMBOL; }
            default -> { return null; }
        }
    }

}
