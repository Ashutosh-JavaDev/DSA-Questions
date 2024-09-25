package Recursion;

public class Index {
    int value = 0;

    public int Result(int arr[], int size, int target) {
        if (size == 0) {
            return value;
        }
        if (arr[size - 1] == target) {
            value = size - 1;
        }
        return Result(arr, size-1, target);
    }

    public static void main(String[] args) {
        Index ob = new Index();
        int arr[] = { 12, 21, 23, 43, 24 };
        int result = ob.Result(arr, arr.length, 12);

        System.out.println("Result: " + result);
    }
}
