package Array;

import java.util.*;

class Bankcheck {
    private int amount;
    private List<String> transactions;  // List to store the transactions (credit or debit)
    private List<Integer> balanceAfterCommits;  // To track the balance after each commit
    private int commitCount;

    // Constructor to initialize the account
    public Bankcheck(int initialAmount) {
        this.amount = initialAmount;
        this.transactions = new ArrayList<>();
        this.balanceAfterCommits = new ArrayList<>();
        this.commitCount = 0;
    }

    // Read the current balance
    public void read() {
        System.out.println(amount);
    }

    // Credit money to the account
    public void credit(int addMoney) {
        transactions.add("credit " + addMoney);
        amount += addMoney;
    }

    // Debit money from the account
    public void debit(int subMoney) {
        if (subMoney > amount) {
            System.out.println("Insufficient Balance: " + amount);
        } else {
            transactions.add("debit " + subMoney);
            amount -= subMoney;
        }
    }

    // Commit the changes (make them permanent)
    public void commit() {
        balanceAfterCommits.add(amount);  // Save the balance at commit point
        commitCount++;
    }

    // Abort the Xth transaction (undo it)
    public void abort(int transactionIndex) {
        if (transactionIndex <= commitCount) {
            System.out.println("Cannot abort after commit");
        } else if (transactionIndex > transactions.size()) {
            System.out.println("Invalid transaction index");
        } else {
            String transaction = transactions.get(transactionIndex - 1);
            if (transaction.startsWith("credit")) {
                int creditAmount = Integer.parseInt(transaction.split(" ")[1]);
                amount -= creditAmount;  // Undo the credit
            } else if (transaction.startsWith("debit")) {
                int debitAmount = Integer.parseInt(transaction.split(" ")[1]);
                amount += debitAmount;  // Undo the debit
            }
            transactions.remove(transactionIndex - 1);  // Remove the aborted transaction
        }
    }

    // Rollback the Xth commit
    public void rollback(int commitIndex) {
        if (commitIndex > commitCount || commitIndex <= 0) {
            System.out.println("Invalid commit index");
        } else {
            amount = balanceAfterCommits.get(commitIndex - 1);  // Restore balance to commit point
            transactions.clear();  // Clear all transactions after the rollback commit
            for (int i = 0; i < commitIndex; i++) {
                // Restore transactions before the commit
                String[] transaction = transactions.get(i).split(" ");
                if (transaction[0].equals("credit")) {
                    credit(Integer.parseInt(transaction[1]));
                } else if (transaction[0].equals("debit")) {
                    debit(Integer.parseInt(transaction[1]));
                }
            }
        }
    }
}

public class BankManage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the initial balance
        int initialBalance = sc.nextInt();
        sc.nextLine();  // Consume the newline character

        Bankcheck bank = new Bankcheck(initialBalance);
        
        // Read the number of operations
        int N = sc.nextInt();
        sc.nextLine();  // Consume the newline character

        for (int i = 0; i < N; i++) {
            String operation = sc.nextLine();
            String[] parts = operation.split(" ");
            
            switch (parts[0]) {
                case "read":
                    bank.read();
                    break;
                case "credit":
                    int creditAmount = Integer.parseInt(parts[1]);
                    bank.credit(creditAmount);
                    break;
                case "debit":
                    int debitAmount = Integer.parseInt(parts[1]);
                    bank.debit(debitAmount);
                    break;
                case "abort":
                    int abortIndex = Integer.parseInt(parts[1]);
                    bank.abort(abortIndex);
                    break;
                case "commit":
                    bank.commit();
                    break;
                case "rollback":
                    int rollbackIndex = Integer.parseInt(parts[1]);
                    bank.rollback(rollbackIndex);
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        }
        
        sc.close();
    }
}
