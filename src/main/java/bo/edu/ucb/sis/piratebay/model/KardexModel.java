package bo.edu.ucb.sis.piratebay.model;

public class KardexModel {
    private String date;
    private String description;
    private String bill;
    private double unit_value;
    private int input_qtt;
    private double input_value;
    private int output_qtt;
    private double output_value;
    private int balance;
    private double balance_value;

    public KardexModel() {
    }

    public KardexModel(String date, String description, String bill, double unit_value, int input_qtt, double input_value, int output_qtt, double output_value, int balance, double balance_value) {
        this.date = date;
        this.description = description;
        this.bill = bill;
        this.unit_value = unit_value;
        this.input_qtt = input_qtt;
        this.input_value = input_value;
        this.output_qtt = output_qtt;
        this.output_value = output_value;
        this.balance = balance;
        this.balance_value = balance_value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public double getUnit_value() {
        return unit_value;
    }

    public void setUnit_value(double unit_value) {
        this.unit_value = unit_value;
    }

    public int getInput_qtt() {
        return input_qtt;
    }

    public void setInput_qtt(int input_qtt) {
        this.input_qtt = input_qtt;
    }

    public double getInput_value() {
        return input_value;
    }

    public void setInput_value(double input_value) {
        this.input_value = input_value;
    }

    public int getOutput_qtt() {
        return output_qtt;
    }

    public void setOutput_qtt(int output_qtt) {
        this.output_qtt = output_qtt;
    }

    public double getOutput_value() {
        return output_value;
    }

    public void setOutput_value(double output_value) {
        this.output_value = output_value;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getBalance_value() {
        return balance_value;
    }

    public void setBalance_value(double balance_value) {
        this.balance_value = balance_value;
    }

    @Override
    public String toString() {
        return "KardexModel{" +
                "date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", bill='" + bill + '\'' +
                ", unit_value=" + unit_value +
                ", input_qtt=" + input_qtt +
                ", input_value=" + input_value +
                ", output_qtt=" + output_qtt +
                ", output_value=" + output_value +
                ", balance=" + balance +
                ", balance_value=" + balance_value +
                '}';
    }
}
