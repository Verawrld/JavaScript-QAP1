public class TestAccount {

    public static void main(String[] args) {
        // a. Create two accounts with initial balances
        Account acc1 = new Account("1", "Acc1", 5000);
        Account acc2 = new Account("2", "Acc2", 4000);

        // b. Display balance of both accounts
        System.out.println("Balance of Acc1: $" + acc1.getBalance());
        System.out.println("Balance of Acc2: $" + acc2.getBalance());

        // c. Transfer $1000.00 from account 1 to account 2
        acc1.debit(1000, acc2);

        // d. Display balance of both accounts again
        System.out.println("Balance of Acc1 after transfer: $" + acc1.getBalance());
        System.out.println("Balance of Acc2 after transfer: $" + acc2.getBalance());
    }
}