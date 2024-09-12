package Recursion;

public class chrckArray {
    boolean result = false;

    // int sorting=0;
    public boolean check(int arr[], int size) {
        if (size <= 1) {
            return true;
        }

        if (arr[size - 1] < arr[size - 2]) {

            return false;

        }

        return check(arr, size - 1);
    }

    public static void main(String[] args) {
        chrckArray ob = new chrckArray();
        int arr[] = { 5, 4, 3, 2, 3 };
        boolean res = ob.check(arr, arr.length - 1);
        System.out.println("Result: " + res);
    }
}
