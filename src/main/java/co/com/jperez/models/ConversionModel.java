package co.com.jperez.models;

public class ConversionModel {

    private String actual;
    private String target;
    private String symbol;
    private double amount;
    private double result;

    public ConversionModel() {}
    public ConversionModel(String actual, String target, String symbol, double amount) {
        this.actual = actual;
        this.target = target;
        this.symbol = symbol;
        this.amount = amount;
    }

    public String getActual() {
        return actual;
    }

    public void setActual(String actual) {
        this.actual = actual;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
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

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
