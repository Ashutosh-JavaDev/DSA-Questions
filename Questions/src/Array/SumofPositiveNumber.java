package Array;

public class SumofPositiveNumber {
    int arr[], size;

    SumofPositiveNumber() {
        BasicClass ob = new BasicClass();
        this.arr = ob.arr;
        this.size = ob.size;
        int sum = 0;
        System.out.print("Sum of " + size + " Positive Number is: ");
        for (int i = 0; i < size; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }

        System.out.print(sum);
        System.out.println();
    }

    public static void main(String[] args) {
        new SumofPositiveNumber();
    }
}
