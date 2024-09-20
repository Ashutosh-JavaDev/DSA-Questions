package Recursion;

public class Unique {
    
    // Helper method to check if the current element exists earlier in the array
    public boolean isUnique(int[] arr, int index, int current) {
        // Base case: no elements to compare (current element is at the beginning)
        if (current == 0) {
            return true;
        }
        // Check if the element at index matches any of the earlier elements
        if (arr[current - 1] == arr[index]) {
            return false;
        }
        // Recursive call to check earlier elements
        return isUnique(arr, index, current - 1);
    }

    // Main method to print unique elements recursively
    public void check(int[] arr, int size) {
        if (size == 0) {
            return;
        }
        
        // Check if the current element is unique
        if (isUnique(arr, size - 1, size - 1)) {
            System.out.print(arr[size - 1] + " ");
        }
        
        // Recursive call for the rest of the array
        check(arr, size - 1);
    }

    public static void main(String[] args) {
        Unique ob = new Unique();
        int arr[] = {1, 2, 2, 3, 5};  // Input array
        
        ob.check(arr, arr.length);  // Call the recursive method
        System.out.println();
    }
}
