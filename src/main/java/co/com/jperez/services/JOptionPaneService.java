package co.com.jperez.services;

import javax.swing.*;

import static co.com.jperez.utils.CurrencyConstants.CURRENCY_LIST;

public class JOptionPaneService {

    private JOptionPaneService() {}

    public static int getJOptionPaneToKeepApp() {
        return JOptionPane.showConfirmDialog(
                null,
                "Do you want to continue??",
                "Is this goodbye?",
                JOptionPane.YES_NO_CANCEL_OPTION
        );
    }

    public static void getJOptionPaneError() {
        JOptionPane.showMessageDialog(
                null,
                "Selection error",
                "Error",
                JOptionPane.ERROR_MESSAGE
        );
    }

    public static String getJOptionSelectCurrency(String message, String title) {
        return (String) JOptionPane.showInputDialog(
                null,
                message,
                title,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                CURRENCY_LIST.toArray(),
                CURRENCY_LIST.get(0)
        );
    }

    public static int getJOptionPaneAmount() {
        return Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Enter the amount to convert",
                "Amount to convert",
                JOptionPane.QUESTION_MESSAGE
        ));
    }

}
