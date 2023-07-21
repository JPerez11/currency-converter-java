package co.com.jperez.models;

public class Currency {

    private String actual;
    private String expected;
    private String symbol;
    private double amount;

    public Currency() {}
    public Currency(String actual, String expected, String symbol, double amount) {
        this.actual = actual;
        this.expected = expected;
        this.symbol = symbol;
        this.amount = amount;
    }

    public String getActual() {
        return actual;
    }

    public void setActual(String actual) {
        this.actual = actual;
    }

    public String getExpected() {
        return expected;
    }

    public void setExpected(String expected) {
        this.expected = expected;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
