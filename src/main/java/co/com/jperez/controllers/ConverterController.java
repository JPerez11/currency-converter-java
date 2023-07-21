package co.com.jperez.controllers;

import co.com.jperez.models.ConversionModel;
import co.com.jperez.services.ConverterService;
import co.com.jperez.services.JOptionPaneService;
import co.com.jperez.utils.CurrencyConstants;
import co.com.jperez.utils.DistanceConstants;
import co.com.jperez.utils.GlobalConstants;

import javax.swing.*;

public class ConverterController {

    private boolean keep = true;
    private final ConverterService service;

    public ConverterController(ConverterService service) {
        this.service = service;
    }

    public void menu() {
        do {
            try {
                conversionOptions();
                keepConvert();
            } catch (NullPointerException e) {
                keep = false;
                JOptionPaneService.getJOptionPaneFinish();
            }
        } while (keep);
    }

    public void keepConvert() {
        int option = JOptionPaneService.getJOptionPaneToKeepApp();
        switch (option) {
            case 0 -> keep = true;
            case -1, 1, 2 -> { keep = false; JOptionPaneService.getJOptionPaneFinish(); }
            default -> JOptionPaneService.getJOptionPaneError(GlobalConstants.SELECTED_OPTION_EXCEPTION_MESSAGE);
        }

    }

    public void conversionOptions() {
        String option = JOptionPaneService.getJOptionPaneConversionOptions();
        switch (option) {
            case GlobalConstants.CURRENCY_OPTION ->
                    requestConvert(CurrencyConstants.CURRENCY_LIST.toArray(), option);
            case GlobalConstants.DISTANCE_OPTION ->
                    requestConvert(DistanceConstants.DISTANCE_LIST.toArray(), option);
            default -> JOptionPaneService.getJOptionPaneError(GlobalConstants.SELECTED_OPTION_EXCEPTION_MESSAGE);
        }
    }

    public void requestConvert(Object[] options, String optionSelected) {
        String actual = JOptionPaneService.getJOptionSelectConversion(
                GlobalConstants.ACTUAL_MESSAGE,
                GlobalConstants.ACTUAL_TITLE,
                options);

        if (actual == null) {
            throw new NullPointerException();
        }

        String target = JOptionPaneService.getJOptionSelectConversion(
                GlobalConstants.TARGET_MESSAGE,
                GlobalConstants.TARGET_TITLE,
                options);

        if (target == null) {
            throw new NullPointerException();
        }

        double amount = 0;

        try {
            amount = JOptionPaneService.getJOptionPaneAmount();
        } catch (NumberFormatException e) {
            JOptionPaneService.getJOptionPaneError(GlobalConstants.NUMBER_EXCEPTION_MESSAGE);
        }

        String symbol = service.symbolConverted(target);

        ConversionModel conversionModel = new ConversionModel(
                actual,
                target,
                symbol,
                amount
        );

        JOptionPane.showMessageDialog(null,
                service.getConversionResult(conversionModel, optionSelected));

    }

}
