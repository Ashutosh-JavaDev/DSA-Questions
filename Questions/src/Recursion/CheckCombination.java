package Recursion;

public class CheckCombination {
    static int count = 0;;

    // Function to print all combinations of an array
    public static void printCombinations(int[] arr, int index, String current) {
        // Base condition: if we've considered all elements
        if (index == arr.length) {
            System.out.println(current+" count: "+count);
            return;
        }

        // Case 1: Include the current element in the combination
        printCombinations(arr, index + 1, current + arr[index] + " ");

        // Case 2: Exclude the current element and move to the next
        printCombinations(arr, index + 1, current);
        count++;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println("All possible combinations of array elements:");
        printCombinations(arr, 0, "");
    }
}
