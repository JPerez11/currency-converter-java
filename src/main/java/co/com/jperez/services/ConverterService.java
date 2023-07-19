package co.com.jperez.services;

import co.com.jperez.models.Currency;

import static co.com.jperez.utils.CurrencyConstants.CURRENCY_MAP;

public class ConverterService {

    public String convertCurrency(Currency currency) {

        String key = currency.getActual() +
                " TO " +
                currency.getExpected();

        double conversionValue = CURRENCY_MAP.get(key);

        double result = currency.getAmount() * conversionValue;

        return currency.getSymbol() +
                " " +
                result;

    }

}
