package src.main.expensetracker;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private Scanner scanner; // So only this class can access the scanner, so other classes can't close it or manipulate it

    public Menu() {
        this.scanner = new Scanner(System.in);
    }
    
    public void showMenu() {
        System.out.println("\n >>> EXPENSE TRACKER 2025");
        System.out.println("Choose an option below:");
        System.out.println("1. Add an expense");
        System.out.println("2. Update an expense");
        System.out.println("3. View total summary");
        System.out.println("4. View summary of expenses for a specific month");
        System.out.println("5. Delete an expense");
        System.out.println("6. Exit");
    }
    
    public int getOption() {
        int option = -1; // It must be initialized with a number
        try {
            option = Integer.parseInt(scanner.nextLine()); // parseInt transforms a String into an int
        } catch(NumberFormatException e) {
            System.out.println("Invalid option, please insert a valid number.");
        }
        return option;
    }
    
    public String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
    
    public double readDouble(String prompt) {
        double value = 0.0;
        boolean valid = false;
        while (!valid) {
            System.out.print(prompt);
            try {
                value = Double.parseDouble(scanner.nextLine());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Please, insert a valid number.");
            }
        }
        return value;
    }
}
