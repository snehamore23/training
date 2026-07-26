package Encapsulstion;

public class Account {

    private long accnumber;
    private String customerName;
    private double balance;
    private String accountType;

    // Deposit Method
    public void deposit(double amount, long accnumber) {
        if (this.accnumber == accnumber && amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid account number or amount.");
        }
    }

    // Withdraw Method
    public void withdraw(double amount, long accnumber) {
        if (this.accnumber == accnumber) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Amount Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance or invalid amount.");
            }
        } else {
            System.out.println("Invalid account number.");
        }
    }

    // Check Balance
    public void checkBalance(long accnumber) {
        if (this.accnumber == accnumber) {
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Invalid account number.");
        }
    }

    // Display Account Details
    public void displayAccountDetails(long accnumber) {
        if (this.accnumber == accnumber) {
            System.out.println("---------- Account Details ----------");
            System.out.println("Account Number : " + this.accnumber);
            System.out.println("Customer Name  : " + customerName);
            System.out.println("Balance        : " + balance);
            System.out.println("Account Type   : " + accountType);
        } else {
            System.out.println("Invalid account number.");
        }
    }

    // Getter and Setter
    public long getAccnumber() {
        return accnumber;
    }

    public void setAccnumber(long accnumber) {
        this.accnumber = accnumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        if (customerName != null && !customerName.isEmpty()) {
            this.customerName = customerName;
        } else {
            System.out.println("Invalid customer name.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance.");
        }
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        if (accountType != null && !accountType.isEmpty()) {
            this.accountType = accountType;
        } else {
            System.out.println("Invalid account type.");
        }
    }

    // Main Method
    public static void main(String[] args) {

        Account a1 = new Account();

        a1.setAccnumber(1234567891L);
        a1.setCustomerName("Vaish");
        a1.setBalance(10000);
        a1.setAccountType("Saving");

        a1.displayAccountDetails(1234567891L);

        a1.deposit(5000, 1234567891L);

        a1.checkBalance(1234567891L);

        a1.withdraw(3000, 1234567891L);

        a1.checkBalance(1234567891L);

        a1.displayAccountDetails(1234567891L);
    }
}