# Copilot Instructions for ExpenseTracker

## Project Overview
- **ExpenseTracker** is a Java console application for managing personal expenses.
- Main logic is in `src/main/java/src/main/expensetracker/ExpenseTracker.java`.
- Core domain classes: `Expense`, `ExpenseList`, `Menu` (all in the same directory).
- Data flow: User interacts via `Menu`, which collects input and triggers actions on `ExpenseList`.

## Architecture & Patterns
- **ExpenseList** manages a collection of `Expense` objects. Use `getExpenses()` to access the list for iteration or updates.
- **Menu** handles all user input/output. Use its methods for reading strings, doubles, and displaying menus.
- **Expense** is a simple data class with fields for description, month, and amount.
- All business logic is centralized in the `main` method's switch statement.
- No persistent storage: all data is in-memory for the session.

## Developer Workflows
- **Build:** Use Maven (`pom.xml` present). Run `mvn compile` to build, `mvn exec:java -Dexec.mainClass=src.main.expensetracker.ExpenseTracker` to run.
- **Test:** Place tests in `src/test/java/`. Use `mvn test` to run tests (if any are present).
- **Debug:** Main entry point is `ExpenseTracker.main`. Set breakpoints in the main loop or in domain classes.

## Project Conventions
- All source files are under `src/main/java/src/main/expensetracker/`.
- Use English for all code, comments, and user prompts.
- Variable naming: use descriptive names (e.g., `expenseList`, `oldExpense`, `amount`).
- For updating or searching expenses, always use `expenseList.getExpenses()` and iterate with `for (Expense e : ...)`.
- Do not interact with files or databases; keep all logic in memory.

## Integration & Dependencies
- No external dependencies beyond standard Java and Maven.
- No web, GUI, or network integration.

## Examples
- To add an expense:
  ```java
  Expense expense = new Expense(description, month, amount);
  expenseList.addExpense(expense);
  ```
- To update an expense:
  ```java
  for (Expense e : expenseList.getExpenses()) {
      if (e.getDescription().equals(oldDescription)) {
          // update fields
      }
  }
  ```

## Key Files
- `src/main/java/src/main/expensetracker/ExpenseTracker.java` (main logic)
- `src/main/java/src/main/expensetracker/ExpenseList.java` (expense management)
- `src/main/java/src/main/expensetracker/Menu.java` (user interaction)
- `src/main/java/src/main/expensetracker/Expense.java` (data model)

---

If you add new features, follow the patterns above. For questions, check the main method's structure and existing class responsibilities.
