package Project.Finance.Checker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FinanceManager manager = new FinanceManager();

        System.out.println("=== Personal Finance Tracker ===");
        System.out.print("Enter your name: ");
        String userName = input.nextLine().trim();
        while (userName.isEmpty()) {
            System.out.print("Name cannot be empty. Enter your name: ");
            userName = input.nextLine().trim();
        }
        User user = new User(userName);

        // Set default budgets
        manager.setCategoryBudget("Food", 5000.0);
        manager.setCategoryBudget("Transport", 2000.0);
        manager.setCategoryBudget("Entertainment", 3000.0);
        manager.setCategoryBudget("Utilities", 4000.0);
        manager.setCategoryBudget("Shopping", 3000.0);

        System.out.println("\nWelcome, " + user.getName() + "!");
        System.out.println("Default budgets set for common categories.");
        System.out.println("You can modify these in the Manage Categories option.");

        boolean running = true;
        while (running) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View All Transactions");
            System.out.println("4. View Financial Summary");
            System.out.println("5. View Category Breakdown");
            System.out.println("6. View Transactions by Date Range");
            System.out.println("7. Manage Categories & Budgets");
            System.out.println("8. Export Transactions to File");
            System.out.println("9. Exit");
            System.out.print("Choose an option (1-9): ");

            int choice = 0;
            try {
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number between 1-9.");
                input.nextLine();
                continue;
            }
            input.nextLine();

            switch (choice) {
                case 1:
                    addIncome(input, manager);
                    break;
                case 2:
                    addExpense(input, manager);
                    break;
                case 3:
                    manager.showAllTransactions();
                    break;
                case 4:
                    manager.showSummary();
                    break;
                case 5:
                    manager.showCategoryBreakdown();
                    break;
                case 6:
                    viewTransactionsByDate(input, manager);
                    break;
                case 7:
                    manageCategories(input, manager);
                    break;
                case 8:
                    exportTransactions(input, manager);
                    break;
                case 9:
                    System.out.println("\nThank you for using Finance Tracker!");
                    System.out.println("Goodbye, " + user.getName() + "!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1-9.");
            }
        }
        input.close();
    }

    private static void addIncome(Scanner input, FinanceManager manager) {
        System.out.println("\n--- ADD INCOME ---");
        
        double amount = getValidAmount(input, "Enter income amount: ");
        if (amount < 0) return;
        
        System.out.print("Source (e.g., Salary, Freelance, Gift): ");
        String source = input.nextLine().trim();
        if (source.isEmpty()) source = "General Income";
        
        System.out.print("Description (optional): ");
        String desc = input.nextLine().trim();
        
        System.out.print("Use today's date? (Y/N): ");
        String dateChoice = input.nextLine().trim().toLowerCase();
        
        LocalDate date;
        if (dateChoice.equals("y") || dateChoice.equals("yes")) {
            date = LocalDate.now();
        } else {
            date = getValidDate(input, "Enter date (YYYY-MM-DD): ");
            if (date == null) return;
        }
        
        manager.addTransaction(new Transaction(amount, TransactionType.INCOME, source, desc, date));
        System.out.println("✓ Income added successfully!");
    }

    private static void addExpense(Scanner input, FinanceManager manager) {
        System.out.println("\n--- ADD EXPENSE ---");
        
        double amount = getValidAmount(input, "Enter expense amount: ");
        if (amount < 0) return;
        
        System.out.println("Available categories: " + manager.getCategories());
        System.out.print("Category (or enter new): ");
        String category = input.nextLine().trim();
        if (category.isEmpty()) category = "Miscellaneous";
        
        System.out.print("Description: ");
        String desc = input.nextLine().trim();
        
        System.out.print("Use today's date? (Y/N): ");
        String dateChoice = input.nextLine().trim().toLowerCase();
        
        LocalDate date;
        if (dateChoice.equals("y") || dateChoice.equals("yes")) {
            date = LocalDate.now();
        } else {
            date = getValidDate(input, "Enter date (YYYY-MM-DD): ");
            if (date == null) return;
        }
        
        manager.addTransaction(new Transaction(amount, TransactionType.EXPENSE, category, desc, date));
    }

    private static double getValidAmount(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                double amount = input.nextDouble();
                input.nextLine();
                if (amount <= 0) {
                    System.out.println("Amount must be positive!");
                    continue;
                }
                return amount;
            } catch (InputMismatchException e) {
                System.out.println("Invalid amount! Please enter a valid number.");
                input.nextLine();
            }
        }
    }

    private static LocalDate getValidDate(Scanner input, String prompt) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        while (true) {
            System.out.print(prompt);
            String dateStr = input.nextLine().trim();
            try {
                return LocalDate.parse(dateStr, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format! Please use YYYY-MM-DD (e.g., 2024-01-15)");
                System.out.print("Try again? (Y/N): ");
                String choice = input.nextLine().trim().toLowerCase();
                if (!choice.equals("y") && !choice.equals("yes")) {
                    return null;
                }
            }
        }
    }

    private static void viewTransactionsByDate(Scanner input, FinanceManager manager) {
        System.out.println("\n--- VIEW TRANSACTIONS BY DATE RANGE ---");
        System.out.println("Enter start date:");
        LocalDate startDate = getValidDate(input, "Start date (YYYY-MM-DD): ");
        if (startDate == null) return;
        
        System.out.println("Enter end date:");
        LocalDate endDate = getValidDate(input, "End date (YYYY-MM-DD): ");
        if (endDate == null) return;
        
        if (endDate.isBefore(startDate)) {
            System.out.println("End date cannot be before start date!");
            return;
        }
        
        manager.showTransactionsByDateRange(startDate, endDate);
    }

    private static void manageCategories(Scanner input, FinanceManager manager) {
        boolean managing = true;
        while (managing) {
            System.out.println("\n--- MANAGE CATEGORIES ---");
            System.out.println("Current categories and budgets:");
            manager.showAllCategories();
            
            System.out.println("\n1. Add/Update Category Budget");
            System.out.println("2. Remove Category");
            System.out.println("3. Back to Main Menu");
            System.out.print("Choose: ");
            
            int choice = 0;
            try {
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
                input.nextLine();
                continue;
            }
            input.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter category name: ");
                    String category = input.nextLine().trim();
                    if (category.isEmpty()) {
                        System.out.println("Category name cannot be empty!");
                        break;
                    }
                    double budget = getValidAmount(input, "Enter budget for " + category + ": ");
                    manager.setCategoryBudget(category, budget);
                    System.out.println("✓ Budget for '" + category + "' set to " + budget);
                    break;
                case 2:
                    System.out.print("Enter category name to remove: ");
                    String catToRemove = input.nextLine().trim();
                    if (manager.removeCategory(catToRemove)) {
                        System.out.println("✓ Category '" + catToRemove + "' removed.");
                    } else {
                        System.out.println("Category not found!");
                    }
                    break;
                case 3:
                    managing = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void exportTransactions(Scanner input, FinanceManager manager) {
        System.out.println("\n--- EXPORT TRANSACTIONS ---");
        System.out.print("Enter filename (e.g., transactions.csv): ");
        String filename = input.nextLine().trim();
        if (filename.isEmpty()) {
            filename = "transactions_export.csv";
        }
        
        if (manager.exportToCSV(filename)) {
            System.out.println("✓ Transactions exported to " + filename);
        } else {
            System.out.println("Failed to export transactions.");
        }
    }
}

enum TransactionType {
    INCOME,
    EXPENSE
}

class Transaction {
    private static int nextId = 1;
    
    private int id;
    private double amount;
    private TransactionType type;
    private String category;
    private LocalDate date;
    private String description;

    public Transaction(double amount, TransactionType type, String category, String description) {
        this(amount, type, category, description, LocalDate.now());
    }

    public Transaction(double amount, TransactionType type, String category, String description, LocalDate date) {
        this.id = nextId++;
        this.amount = amount;
        this.type = type;
        this.category = category;
        this.description = description;
        this.date = date;
    }

    // Getters
    public int getId() { return id; }
    public double getAmount() { return amount; }
    public TransactionType getType() { return type; }
    public String getCategory() { return category; }
    public LocalDate getDate() { return date; }
    public String getDescription() { return description; }

    public String toFileString() {
        return id + "," + amount + "," + type + "," + category + "," + 
               date + "," + description.replace(",", ";");
    }

    public static Transaction fromFileString(String line) {
        try {
            String[] parts = line.split(",");
            if (parts.length < 6) {
                throw new IllegalArgumentException("Invalid line format: " + line);
            }
            
            int id = Integer.parseInt(parts[0]);
            double amount = Double.parseDouble(parts[1]);
            TransactionType type = TransactionType.valueOf(parts[2]);
            String category = parts[3];
            LocalDate date = LocalDate.parse(parts[4]);
            String description = parts[5].replace(";", ",");
            
            Transaction t = new Transaction(amount, type, category, description, date);
            t.id = id;
            if (id >= nextId) {
                nextId = id + 1;
            }
            return t;
        } catch (Exception e) {
            System.err.println("Error parsing transaction: " + e.getMessage());
            return null;
        }
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return String.format("[ID: %d] %s | %-15s | %10s | %s | %s",
                id,
                date.format(formatter),
                category,
                String.format("$%.2f", amount),
                type,
                description);
    }
    
    public String toCSVString() {
        return String.format("%d,%s,%.2f,%s,%s,%s",
                id,
                date,
                amount,
                type,
                category.replace(",", ";"),
                description.replace(",", ";"));
    }
}

class User {
    private String name;
    private LocalDate createdDate;

    public User(String name) {
        this.name = name;
        this.createdDate = LocalDate.now();
    }

    public String getName() { return name; }
    public LocalDate getCreatedDate() { return createdDate; }
}

class FinanceManager {
    private List<Transaction> transactions = new ArrayList<>();
    private Map<String, Double> categoryBudgets = new HashMap<>();
    private final String FILE_NAME = "transactions.dat";
    private final String BUDGET_FILE = "budgets.dat";

    public FinanceManager() {
        loadBudgetsFromFile();
        loadFromFile();
    }

    // Category Management
    public void setCategoryBudget(String category, double budget) {
        if (budget < 0) {
            System.out.println("Budget cannot be negative!");
            return;
        }
        categoryBudgets.put(category, budget);
        saveBudgetsToFile();
    }

    public boolean removeCategory(String category) {
        if (categoryBudgets.containsKey(category)) {
            categoryBudgets.remove(category);
            saveBudgetsToFile();
            return true;
        }
        return false;
    }

    public Set<String> getCategories() {
        return categoryBudgets.keySet();
    }

    public void showAllCategories() {
        if (categoryBudgets.isEmpty()) {
            System.out.println("No categories defined.");
            return;
        }
        
        System.out.println("Category\t\tBudget");
        System.out.println("--------\t\t------");
        categoryBudgets.forEach((cat, budget) -> {
            System.out.printf("%-20s $%.2f\n", cat, budget);
        });
    }

    // Transaction Management
    public void addTransaction(Transaction t) {
        transactions.add(t);
        saveToFile();
        
        if (t.getType() == TransactionType.EXPENSE) {
            checkBudget(t);
        }
        
        // Sort transactions by date (newest first)
        transactions.sort((t1, t2) -> t2.getDate().compareTo(t1.getDate()));
    }

    private void checkBudget(Transaction t) {
        if (t.getType() == TransactionType.EXPENSE) {
            double total = getTotalForCategory(t.getCategory());
            double budget = categoryBudgets.getOrDefault(t.getCategory(), Double.MAX_VALUE);

            if (total > budget * 0.9 && total <= budget) {
                System.out.println("⚠ WARNING: You've used 90% of your budget for " + t.getCategory());
            } else if (total > budget) {
                System.out.println("[ALERT] Budget exceeded for " + t.getCategory());
                System.out.println("[WARNING] You've used 90% of your budget");
                System.out.println("Income added successfully.");
            }
        }
    }

    public double getTotalForCategory(String category) {
        double sum = 0;
        for (Transaction t : transactions) {
            if (t.getCategory().equalsIgnoreCase(category)
                    && t.getType() == TransactionType.EXPENSE) {
                sum += t.getAmount();
            }
        }
        return sum;
    }

    // Display Methods
    public void showAllTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }

        System.out.println("\n--- ALL TRANSACTIONS ---");
        System.out.println("Date       | Category         | Amount     | Type    | Description");
        System.out.println("-----------|------------------|------------|---------|------------");
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        for (Transaction t : transactions) {
            System.out.printf("%s | %-15s | $%9.2f | %-7s | %s\n",
                    t.getDate().format(formatter),
                    t.getCategory(),
                    t.getAmount(),
                    t.getType(),
                    t.getDescription());
        }
        System.out.println("Total transactions: " + transactions.size());
    }

    public void showTransactionsByDateRange(LocalDate start, LocalDate end) {
        List<Transaction> filtered = new ArrayList<>();
        double total = 0;
        
        for (Transaction t : transactions) {
            if (!t.getDate().isBefore(start) && !t.getDate().isAfter(end)) {
                filtered.add(t);
                total += t.getAmount();
            }
        }
        
        if (filtered.isEmpty()) {
            System.out.println("No transactions found between " + start + " and " + end);
            return;
        }
        
        System.out.println("\n--- TRANSACTIONS FROM " + start + " TO " + end + " ---");
        System.out.println("Date       | Category         | Amount     | Type    | Description");
        System.out.println("-----------|------------------|------------|---------|------------");
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        for (Transaction t : filtered) {
            System.out.printf("%s | %-15s | $%9.2f | %-7s | %s\n",
                    t.getDate().format(formatter),
                    t.getCategory(),
                    t.getAmount(),
                    t.getType(),
                    t.getDescription());
        }
        System.out.printf("Total amount in period: $%.2f (%d transactions)\n", total, filtered.size());
    }

    public void showSummary() {
        double income = 0, expense = 0;
        Map<String, Double> categoryExpenses = new HashMap<>();
        
        for (Transaction t : transactions) {
            if (t.getType() == TransactionType.INCOME) {
                income += t.getAmount();
            } else if (t.getType() == TransactionType.EXPENSE) {
                expense += t.getAmount();
                categoryExpenses.merge(t.getCategory(), t.getAmount(), Double::sum);
            }
        }
        
        double savings = income - expense;
        
        System.out.println("\n--- FINANCIAL SUMMARY ---");
        System.out.println("========================");
        System.out.printf("Total Income   : $%.2f\n", income);
        System.out.printf("Total Expense  : $%.2f\n", expense);
        System.out.printf("Net Savings    : $%.2f\n", savings);
        
        if (income > 0) {
            double expenseRatio = (expense / income) * 100;
            double savingsRatio = (savings / income) * 100;
            System.out.printf("\nExpense/Income : %.1f%%\n", expenseRatio);
            System.out.printf("Savings Rate   : %.1f%%\n", savingsRatio);
            
            if (savingsRatio < 0) {
                System.out.println("\n⚠ WARNING: You're spending more than you earn!");
            } else if (savingsRatio < 10) {
                System.out.println("\nℹ SUGGESTION: Try to save at least 20% of your income.");
            } else if (savingsRatio >= 20) {
                System.out.println("\n✓ EXCELLENT: Great savings rate!");
            }
        }
        
        if (!categoryExpenses.isEmpty()) {
            System.out.println("\n--- Top Expense Categories ---");
            categoryExpenses.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .limit(5)
                .forEach(entry -> System.out.printf("%-15s: $%.2f\n", entry.getKey(), entry.getValue()));
        }
    }

    public void showCategoryBreakdown() {
        Map<String, Double> categoryTotals = new HashMap<>();
        double totalExpenses = 0;
        
        for (Transaction t : transactions) {
            if (t.getType() == TransactionType.EXPENSE) {
                categoryTotals.merge(t.getCategory(), t.getAmount(), Double::sum);
                totalExpenses += t.getAmount();
            }
        }
        
        if (categoryTotals.isEmpty()) {
            System.out.println("No expenses recorded yet.");
            return;
        }
        
        System.out.println("\n--- CATEGORY BREAKDOWN ---");
        System.out.println("Category\t\tSpent\t\tBudget\t\t% Used\t\tStatus");
        System.out.println("--------\t\t-----\t\t------\t\t------\t\t------");
        
        for (Map.Entry<String, Double> entry : categoryTotals.entrySet()) {
            String category = entry.getKey();
            double spent = entry.getValue();
            double budget = categoryBudgets.getOrDefault(category, 0.0);
            double percentUsed = budget > 0 ? (spent / budget) * 100 : 0;
            
            String status;
            if (budget == 0) {
                status = "NO BUDGET";
            } else if (percentUsed <= 80) {
                status = "OK";
            } else if (percentUsed <= 100) {
                status = "WARNING";
            } else {
                status = "EXCEEDED";
            }
            
            System.out.printf("%-20s $%-12.2f $%-12.2f %-12.1f%% %-10s\n",
                    category, spent, budget, percentUsed, status);
        }
        
        System.out.println("\nTotal Expenses: $" + String.format("%.2f", totalExpenses));
    }

    // File Operations
    private void saveToFile() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Transaction t : transactions) {
                pw.println(t.toFileString());
            }
        } catch (IOException e) {
            System.out.println("Error saving transactions: " + e.getMessage());
        }
    }

    private void loadFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return;
        }

        try (Scanner sc = new Scanner(file)) {
            int loaded = 0;
            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                if (!line.isEmpty()) {
                    Transaction t = Transaction.fromFileString(line);
                    if (t != null) {
                        transactions.add(t);
                        loaded++;
                    }
                }
            }
            if (loaded > 0) {
                System.out.println("Loaded " + loaded + " transactions from file.");
            }
        } catch (Exception e) {
            System.out.println("Error loading transactions: " + e.getMessage());
        }
    }

    private void saveBudgetsToFile() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(BUDGET_FILE))) {
            for (Map.Entry<String, Double> entry : categoryBudgets.entrySet()) {
                pw.println(entry.getKey() + "," + entry.getValue());
            }
        } catch (IOException e) {
            System.out.println("Error saving budgets: " + e.getMessage());
        }
    }

    private void loadBudgetsFromFile() {
        File file = new File(BUDGET_FILE);
        if (!file.exists()) {
            return;
        }

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                if (!line.isEmpty()) {
                    String[] parts = line.split(",");
                    if (parts.length == 2) {
                        categoryBudgets.put(parts[0], Double.parseDouble(parts[1]));
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error loading budgets: " + e.getMessage());
        }
    }

    public boolean exportToCSV(String filename) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
            // Write header
            pw.println("ID,Date,Amount,Type,Category,Description");
            
            // Write data
            for (Transaction t : transactions) {
                pw.println(t.toCSVString());
            }
            return true;
        } catch (IOException e) {
            System.out.println("Error exporting to CSV: " + e.getMessage());
            return false;
        }
    }
}