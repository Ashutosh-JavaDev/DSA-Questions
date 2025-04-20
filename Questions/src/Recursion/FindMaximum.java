// package Recursion;

public class FindMaximum {
    int max = 0;

    public int maximum(int arr[], int size) {
        if (size == 0) {
            return 0;
        } else {
            if (max < arr[size - 1]) {
                max = arr[size - 1];
                maximum(arr, size - 1);
            }

            maximum(arr, size - 1);

        }
        return max;
    }

    public static void main(String[] args) {
        FindMaximum ob = new FindMaximum();
        int arr[] = { 1, 3, 5, 23, 2, 6 };
        int maxi = ob.maximum(arr, arr.length-1);
        System.out.println("Result: " + maxi);
    }
}
