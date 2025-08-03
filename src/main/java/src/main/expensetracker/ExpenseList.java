package src.main.expensetracker;

import java.util.ArrayList;
import java.util.List;

public class ExpenseList {
    private List<Expense> expenses; // It is necessary to create a list here. Just "Expense expenses" wouldn't do it

    public ExpenseList() {
        this.expenses = new ArrayList<>(); // It must be an ArrayList, because List is an interface and doesnt define behaviour. ArryList implements List.
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }
    
    public void addExpense(Expense expense) {
        this.expenses.add(expense);
    }
    
    public void viewAllExpenses() {
        for (Expense expense : expenses) {
            System.out.println(expense.toString());
        }
    }
    
    public void updateExpense(Expense oldExpense, Expense newExpense) {
        int index = expenses.indexOf(oldExpense); // The method indexOf returns -1 if the object's not found
        if(index != -1) {
            expenses.set(index, newExpense);
        }
    }
    
    public void deleteExpense(Expense expense) {
        int index = expenses.indexOf(expense);
        if(index != -1) {
            this.expenses.remove(expense);
        }
    }
    
    public String summaryTotalExpenses() {
        double totalSpent = 0;
        for (Expense expense : expenses) {
            totalSpent += expense.getAmount(); // Here, we see the importance of the getter. Referencing just as 'amount' wouldn't be possible, due to the fact that amount is a private variable.
        }
        return "Total spent: $" + totalSpent;
    }
    
        public String summaryExpensesByMonth(String month) {
        double totalSpent = 0;
        for (Expense expense : expenses) {
            if(expense.getMonth().equals(month)) {
                totalSpent += expense.getAmount(); 
            } 
        }
        return month + "'s total spent: $" + totalSpent;
    }
}
