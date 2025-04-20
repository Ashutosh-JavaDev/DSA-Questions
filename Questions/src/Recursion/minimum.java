// package Recursion;

public class minimum {
    int min;

    public minimum() {
        min = Integer.MAX_VALUE;
    }

    public int CheckMinimum(int arr[], int size) {

        if (size == 0) {
            return min;
        }
        if (arr[size - 1] < min) {
            min = arr[size - 1];

        }
        return CheckMinimum(arr, size - 1);

    }

    public static void main(String[] args) {
        minimum ob = new minimum();
        int arr[] = { 12, 21, 23, 32, 24 };

        int result = ob.CheckMinimum(arr, arr.length);
        System.out.println("Result: " + result);

    }   
}
