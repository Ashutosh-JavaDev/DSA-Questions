package Array;
import java.util.*;

public class BankAccountManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initial balance
        int initialBalance = 90;
        int currentBalance = initialBalance;

        // Number of operations
        int N = sc.nextInt();
        sc.nextLine(); // Consume the newline

        // Lists to store transaction history and commit history
        List<Integer> transactions = new ArrayList<>();
        List<Integer> commitBalances = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            String operation = parts[0];

            switch (operation) {
                case "read":
                    System.out.println(currentBalance);
                    break;

                case "credit":
                    int creditAmount = Integer.parseInt(parts[1]);
                    transactions.add(creditAmount);
                    currentBalance += creditAmount;
                    break;

                case "debit":
                    int debitAmount = Integer.parseInt(parts[1]);
                    transactions.add(-debitAmount);
                    currentBalance -= debitAmount;
                    break;

                case "abort":
                    int abortIndex = Integer.parseInt(parts[1]) - 1;
                    if (abortIndex < transactions.size()) {
                        int abortedTransaction = transactions.remove(abortIndex);
                        currentBalance -= abortedTransaction;
                    }
                    break;

                case "rollback":
                    int rollbackIndex = Integer.parseInt(parts[1]) - 1;
                    if (rollbackIndex < commitBalances.size()) {
                        currentBalance = commitBalances.get(rollbackIndex);
                        // Remove transactions and commits after the rollback point
                        transactions.clear();
                        commitBalances = commitBalances.subList(0, rollbackIndex + 1);
                    }
                    break;

                case "commit":
                    commitBalances.add(currentBalance);
                    transactions.clear();
                    break;

                default:
                    throw new IllegalArgumentException("Invalid operation: " + operation);
            }
        }

        sc.close();
    }
}
