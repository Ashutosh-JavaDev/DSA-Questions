package Recursion;

public class CheckCombination {
    public void check(int arr[], int size, int target) {
        if (size <= 1) {
            return;
        }
        if (arr[size - 1] + arr[size - 2] == target) {
            System.out.println("arr[" + arr[size - 1] + "]" + "arr[" + arr[size - 2] + "]");
            check(arr, size-1, target);
        } else {
            check(arr, size - 1, target);
        }
    }
}
