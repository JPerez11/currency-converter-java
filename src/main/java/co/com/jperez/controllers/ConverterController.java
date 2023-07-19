package co.com.jperez.controllers;

import co.com.jperez.models.Currency;
import co.com.jperez.services.ConverterService;
import co.com.jperez.services.JOptionPaneService;

import javax.swing.*;

public class ConverterController {

    private boolean keep = true;

    public void menu() {
        do {
            requestCurrency();
            keepConvert();
        } while (keep);
    }

    public void keepConvert() {
        int option = JOptionPaneService.getJOptionPaneToKeepApp();
        switch (option) {
            case 0 -> requestCurrency();
            case 1, 2 -> keep = false;
            default -> JOptionPaneService.getJOptionPaneError();
        }

    }

    public void requestCurrency() {
        String currencyToConvert = JOptionPaneService.getJOptionSelectCurrency(
                "Select the initial currency type",
                "Initial currency");

        String currencyConverted = JOptionPaneService.getJOptionSelectCurrency(
                "Select the type of currency to convert",
                "Target currency");

        double currencyAmount = JOptionPaneService.getJOptionPaneAmount();

        Currency currency = new Currency(
                currencyToConvert,
                currencyConverted,
                "$",
                currencyAmount
        );

        ConverterService service = new ConverterService();
        JOptionPane.showMessageDialog(null, service.convertCurrency(currency));

    }

}
