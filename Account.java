public class Account {
    private String accountId;
    private String accountName;
    private int balance = 0;

    // constructors
    public Account(String accountId, String accountName) {
        this.accountId = accountId;
        this.accountName = accountName;
    }

    public Account(String accountId, String accountName, int balance) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.balance = balance;
    }

    // methods
    public String getID() {
        return accountId;
    }

    public String getName() {
        return accountName;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        if (amount <= balance) 
            balance -= amount;
        else
            System.out.println("Amount exceeded balance");
        return balance;
    }

    public int debit(int amount, Account toAccount) {
        if (amount <= balance) {
            balance -= amount;
            toAccount.balance += amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public String toString() {
        return "Account[id=" + accountId + ", name=" + accountName + ", balance=" + balance + "]";
    }
}