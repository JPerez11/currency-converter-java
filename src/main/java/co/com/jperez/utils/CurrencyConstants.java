package co.com.jperez.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CurrencyConstants {

    public static final String COP_USD_KEY = "COP TO USD";
    public static final double COP_USD_VALUE = 0.00025;
    public static final String USD_COP_KEY = "USD TO COP";
    public static final double USD_COP_VALUE = 4_003.20;
    public static final String COP_EUR_KEY = "COP TO EUR";
    public static final double COP_EUR_VALUE = 0.000223;
    public static final String EUR_COP_KEY = "EUR TO COP";
    public static final double EUR_COP_VALUE = 4_477.63;
    public static final String USD_EUR_KEY = "USD TO EUR";
    public static final double USD_EUR_VALUE = 0.8904;
    public static final String EUR_USD_KEY = "EUR TO USD";
    public static final double EUR_USD_VALUE = 1.1227;
    public static final String COP_SYMBOL = "$";
    public static final String USD_SYMBOL = "$";
    public static final String EUR_SYMBOL = "€";

    public static final Map<String, Double> CURRENCY_MAP;
    public static final List<String> CURRENCY_LIST;

    private CurrencyConstants() {}

    static {
        CURRENCY_MAP = new HashMap<>();
        CURRENCY_MAP.put(COP_USD_KEY, COP_USD_VALUE);
        CURRENCY_MAP.put(USD_COP_KEY, USD_COP_VALUE);
        CURRENCY_MAP.put(COP_EUR_KEY, COP_EUR_VALUE);
        CURRENCY_MAP.put(EUR_COP_KEY, EUR_COP_VALUE);
        CURRENCY_MAP.put(USD_EUR_KEY, USD_EUR_VALUE);
        CURRENCY_MAP.put(EUR_USD_KEY, EUR_USD_VALUE);

        CURRENCY_LIST = new ArrayList<>();
        CURRENCY_LIST.add(CurrencyEnum.COP.name());
        CURRENCY_LIST.add(CurrencyEnum.USD.name());
        CURRENCY_LIST.add(CurrencyEnum.EUR.name());
    }

}
