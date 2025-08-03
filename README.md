# 💵 Expense Tracker

A simple command-line application in Java for tracking personal expenses. This program allows users to manage their finances by adding, updating, and deleting expenses, as well as viewing summaries of their spending.

---

## Features

-   **Add Expenses**: Record new expenses with a description, amount, and the month they occurred.
-   **Update Expenses**: Modify existing expenses. You can change the description, amount, or month of any recorded expense.
-   **Delete Expenses**: Remove expenses from your list.
-   **View Summaries**:
    -   See a **total summary** of all expenses to understand your overall spending.
    -   Get a **monthly summary** to analyze spending for a specific month.

---

## How to Run

### Prerequisites

You need to have the **Java Development Kit (JDK) version 8 or higher** installed on your system.

### Compiling and Executing

1.  Navigate to the project's `src` directory in your terminal.
2.  Compile the Java files using the Java compiler:
    ```bash
    javac main/expensetracker/*.java
    ```
3.  Run the application with the following command:
    ```bash
    java main.expensetracker.ExpenseTracker
    ```

---

## Using the Application

Once the application starts, you will be presented with a menu of options. Simply type the number corresponding to your desired action and press Enter.

-   **Option 1: Add Expense**: You'll be prompted to enter the expense details one by one.
-   **Option 2: Update Expense**: You'll be asked for the description of the expense you want to update.
-   **Option 3: Total Summary**: Displays the grand total of all expenses.
-   **Option 4: Month Summary**: You will be prompted to enter the month for which you want a summary.
-   **Option 5: Delete Expense**: You'll be asked to provide the description of the expense to be removed.
-   **Option 6: Exit**: This option gracefully closes the program.
