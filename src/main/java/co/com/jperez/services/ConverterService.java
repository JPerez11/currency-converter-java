package co.com.jperez.services;

import co.com.jperez.models.ConversionModel;

import static co.com.jperez.utils.CurrencyConstants.*;
import static co.com.jperez.utils.DistanceConstants.*;
import static co.com.jperez.utils.GlobalConstants.*;

public class ConverterService {

    public String getConversionResult(ConversionModel conversionModel, String option) {

        if (conversionModel.getActual().equals(conversionModel.getTarget())) {
            conversionModel.setResult(conversionModel.getAmount());
            return getResultByOption(option, conversionModel);
        }
        String key = conversionModel.getActual() +
                " TO " +
                conversionModel.getTarget();
        double conversionValue = 0;
        try {
            conversionValue = getConversionValue(option, key);

        } catch (NullPointerException e) {
            JOptionPaneService.getJOptionPaneError(SELECTED_OPTION_EXCEPTION_MESSAGE);
        }

        conversionModel.setResult(conversionModel.getAmount() * conversionValue);

        return getResultByOption(option, conversionModel);

    }

    private double getConversionValue(String option, String key) {
        switch (option) {
            case CURRENCY_OPTION -> { return CURRENCY_MAP.get(key); }
            case DISTANCE_OPTION -> { return DISTANCE_MAP.get(key); }
            default -> { return 0.0; }
        }
    }

    private String getResultByOption(String option, ConversionModel model) {
        switch (option) {
            case CURRENCY_OPTION -> { return model.getSymbol() + " " + model.getResult(); }
            case DISTANCE_OPTION -> { return model.getResult() + " " + model.getSymbol(); }
            default -> { return null; }
        }
    }

    public String symbolConverted(String currencyType) {
        switch (currencyType) {
            case COP, USD -> { return DOLLAR_SYMBOL; }
            case EUR -> { return EURO_SYMBOL; }
            case CM -> { return CM; }
            case M -> { return M; }
            case KM -> { return KM; }
            default -> { return null; }
        }
    }

}
