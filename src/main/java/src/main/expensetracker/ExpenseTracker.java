package src.main.expensetracker;
import src.main.expensetracker.Expense;
import src.main.expensetracker.ExpenseList;
import src.main.expensetracker.Menu;

public class ExpenseTracker {

    public static void main(String[] args) {
        ExpenseList expenseList = new ExpenseList();
        Menu menu = new Menu();
        
        boolean exit = false;
        while (!exit) {
            menu.showMenu();
            int option = menu.getOption();
            
            switch(option) {
                case 1: 
                System.out.println(":::::::::::::::: ADD EXPENSE ::::::::::::::::\n");
                    String description = menu.readString("Describe the expense: ");
                    double amount = menu.readDouble("Amount: ");
                    String month = menu.readString("Month: ");

                    Expense expense = new Expense(description, month, amount);

                    expenseList.addExpense(expense);

                    System.out.println("Expense successfully added! \n");
                    break;                
                    
                case 2: 
                    System.out.println(":::::::::::::::: UPDATE EXPENSE :::::::::::::::: \n");
                    String oldExpense = menu.readString("Type the description of the expense you'd like to update: \n");
                    
                    // Now, it is necessary to find the expense using a loop
                    boolean found = false;
                    for( Expense e : expenseList.getExpenses()) { // It is impossible to just catch the expenses without the proper getter
                        if(e.getDescription().equalsIgnoreCase(oldExpense)) {
                            String newDescription;
                            double newAmount;
                            String newMonth;

                            System.out.println("Selected " + e.toString()); // Prints the choice

                            newDescription = menu.readString("New description: ");

                            String updateOption = menu.readString("Would you like to change the amount? Y/N ");
                            if(updateOption.equalsIgnoreCase("y")) {
                                newAmount = menu.readDouble("New amount: ");
                            } else {
                                newAmount = e.getAmount();
                            }

                            updateOption = menu.readString("Would you like to change the expense's month? Y/N ");
                            if(updateOption.equalsIgnoreCase("y")) {
                                newMonth = menu.readString("New month: ");
                            } else {
                                newMonth = e.getMonth();
                            }
       
                            Expense updatedExpense = new Expense(newDescription, newMonth, newAmount);
                            expenseList.updateExpense(e, updatedExpense);

                            System.out.println("Description successfully updated! ");
                            found = true;
                        }
                    }

                    if(found == false) {
                        System.out.println("Expense not found. Try again.");
                    }

                    break; // Breaks are necessary so the code doesn't keep executing

                case 3: 
                    System.out.println(":::::::::::::::: TOTAL SUMMARY ::::::::::::::::\n");
                    System.out.println(expenseList.summaryTotalExpenses());
                    break;

                case 4: 
                    System.out.println(":::::::::::::::: MONTH SUMMARY ::::::::::::::::\n");
                    String monthOfChoice = menu.readString("What month would you like a summary of? ");
                    System.out.println(expenseList.summaryExpensesByMonth(monthOfChoice));
                    break;
                case 5: 
                    System.out.println(":::::::::::::::: DELETE EXPENSE ::::::::::::::::\n");
                     String expenseToDelete = menu.readString("Type the description of the expense you'd like to delete: \n");
                    
                    // Now, it is necessary to find the expense using a loop
                    found = false;
                    for( Expense e : expenseList.getExpenses()) { // It is impossible to just catch the expenses without the proper getter
                        if(e.getDescription().equalsIgnoreCase(expenseToDelete)) {
                            found = true;
                            expenseList.deleteExpense(e);
                            System.out.println("Expense successfully deleted!");
                            break; // Adding a break here to avoid ConcurrentModificationException
                        }
                    }

                    if(found == false) {
                        System.out.println("Expense not found. Try again.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    exit = true;

            }
        }
        
    }
}
