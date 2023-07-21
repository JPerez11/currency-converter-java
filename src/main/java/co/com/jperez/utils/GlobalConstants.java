package co.com.jperez.utils;

import java.util.ArrayList;
import java.util.List;

public class GlobalConstants {

    public static final String ACTUAL_MESSAGE = "Select the initial type";
    public static final String ACTUAL_TITLE = "Initial type";
    public static final String TARGET_MESSAGE = "Select the type to convert";
    public static final String TARGET_TITLE = "Target type";
    public static final String CONVERSION_OPTIONS_MESSAGE = "Select the type of conversion";
    public static final String CONVERSION_OPTIONS_TITLE = "Conversion options";
    public static final String CURRENCY_OPTION = "Currency";
    public static final String DISTANCE_OPTION = "Distance";

    // Error message
    public static final String NUMBER_EXCEPTION_MESSAGE = "Only numbers are accepted";
    public static final String SELECTED_OPTION_EXCEPTION_MESSAGE = "An error occurred with the selected options";

    public static final List<String> CONVERSION_OPTIONS_LIST;

    private GlobalConstants() {}

    static {
        CONVERSION_OPTIONS_LIST = new ArrayList<>();
        CONVERSION_OPTIONS_LIST.add(CURRENCY_OPTION);
        CONVERSION_OPTIONS_LIST.add(DISTANCE_OPTION);
    }

}
