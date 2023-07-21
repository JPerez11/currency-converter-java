package co.com.jperez.services;

import co.com.jperez.utils.GlobalConstants;

import javax.swing.*;

public class JOptionPaneService {

    private JOptionPaneService() {}

    public static String getJOptionPaneConversionOptions() {
        return (String) JOptionPane.showInputDialog(
                null,
                GlobalConstants.CONVERSION_OPTIONS_MESSAGE,
                GlobalConstants.CONVERSION_OPTIONS_TITLE,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                GlobalConstants.CONVERSION_OPTIONS_LIST.toArray(),
                GlobalConstants.CONVERSION_OPTIONS_LIST.get(0)
        );
    }

    public static int getJOptionPaneToKeepApp() {
        return JOptionPane.showConfirmDialog(
                null,
                "Do you want to continue??",
                "Is this goodbye?",
                JOptionPane.YES_NO_CANCEL_OPTION
        );
    }

    public static void getJOptionPaneError(String message) {
        JOptionPane.showMessageDialog(
                null,
                message,
                "Error",
                JOptionPane.ERROR_MESSAGE
        );
    }

    public static String getJOptionSelectConversion(String message, String title, Object[] options) {
        return (String) JOptionPane.showInputDialog(
                null,
                message,
                title,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]
        );
    }

    public static double getJOptionPaneAmount() {
        return Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Enter the amount to convert",
                "Amount to convert",
                JOptionPane.QUESTION_MESSAGE
        ));
    }

    public static void getJOptionPaneFinish() {
        JOptionPane.showMessageDialog(
                null,
                "Finished program",
                "Goodbye!",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
