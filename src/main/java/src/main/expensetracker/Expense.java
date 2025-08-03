package src.main.expensetracker;


public class Expense {
    private String description;
    private String month;
    private double amount;

    public Expense(String description, String month, double amount) {
        this.description = description;
        this.month = month;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public String toString() { // This method is necessary to express what this object is
        return String.format("--- Expense: " + description + "\n--Amount: " + amount + "\n- Month: " + month);
    }
}
